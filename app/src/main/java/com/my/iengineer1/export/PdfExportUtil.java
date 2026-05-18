package com.my.iengineer1.export;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.my.iengineer1.db.entity.Project;
import com.my.iengineer1.db.entity.QuantityItem;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Generates a professional bilingual (Arabic/English) PDF quantity survey report.
 * Header includes project info; body is an itemised table with totals.
 */
public class PdfExportUtil {

    private static final String TAG = "PdfExportUtil";

    // Brand colours (RGB)
    private static final BaseColor COLOR_PRIMARY     = new BaseColor(0x6F, 0x45, 0x3B);
    private static final BaseColor COLOR_PRIMARY_DARK= new BaseColor(0x00, 0x4D, 0x40);
    private static final BaseColor COLOR_SURFACE     = new BaseColor(0xFF, 0xF7, 0xEE);
    private static final BaseColor COLOR_ROW_ALT     = new BaseColor(0xF0, 0xE0, 0xD4);
    private static final BaseColor COLOR_WHITE       = BaseColor.WHITE;
    private static final BaseColor COLOR_TEXT        = new BaseColor(0x20, 0x1A, 0x18);

    public static String exportProject(Context ctx, Project project, List<QuantityItem> items) {
        if (project == null) return null;

        String fileName = "iEngineer_" + sanitize(project.name) + "_"
                + new SimpleDateFormat("yyyyMMdd_HHmm", Locale.US).format(new Date()) + ".pdf";

        File dir = ctx.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        if (dir == null) dir = ctx.getFilesDir();
        dir.mkdirs();
        File file = new File(dir, fileName);

        try {
            Document doc = new Document(PageSize.A4, 40, 40, 60, 50);
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(file));
            writer.setPageEvent(new HeaderFooterEvent(project));
            doc.open();

            addCoverSection(doc, project);
            addItemsTable(doc, items);
            addTotalsSection(doc, items);

            doc.close();
            Log.i(TAG, "PDF saved: " + file.getAbsolutePath());
            return file.getAbsolutePath();
        } catch (Exception e) {
            Log.e(TAG, "PDF export failed", e);
            return null;
        }
    }

    // ── Cover / Project Info ──────────────────────────────────────────────────
    private static void addCoverSection(Document doc, Project project) throws DocumentException {
        // Title bar
        PdfPTable titleBar = new PdfPTable(1);
        titleBar.setWidthPercentage(100);
        PdfPCell titleCell = new PdfPCell(new Phrase("جدول كميات الأعمال\nQuantity Survey Report",
                FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, COLOR_WHITE)));
        titleCell.setBackgroundColor(COLOR_PRIMARY);
        titleCell.setPadding(14);
        titleCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        titleCell.setBorder(Rectangle.NO_BORDER);
        titleBar.addCell(titleCell);
        doc.add(titleBar);

        doc.add(Chunk.NEWLINE);

        // Info table
        PdfPTable info = new PdfPTable(new float[]{1f, 2f, 1f, 2f});
        info.setWidthPercentage(100);
        addInfoRow(info, "اسم المشروع", project.name,            "Project Name", project.name);
        addInfoRow(info, "صاحب العمل",  nvl(project.client),     "Client",       nvl(project.client));
        addInfoRow(info, "المهندس",     nvl(project.engineer),   "Engineer",     nvl(project.engineer));
        addInfoRow(info, "الموقع",      nvl(project.location),   "Location",     nvl(project.location));
        addInfoRow(info, "تاريخ الإعداد",
                new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date()),
                "Date",
                new SimpleDateFormat("dd MMM yyyy", Locale.US).format(new Date()));
        doc.add(info);
        doc.add(Chunk.NEWLINE);
    }

    private static void addInfoRow(PdfPTable t, String arLabel, String arValue,
                                   String enLabel, String enValue) {
        Font lf = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 9, COLOR_PRIMARY);
        Font vf = FontFactory.getFont(FontFactory.HELVETICA, 9, COLOR_TEXT);
        t.addCell(styledCell(arLabel, lf, COLOR_ROW_ALT));
        t.addCell(styledCell(arValue, vf, COLOR_WHITE));
        t.addCell(styledCell(enLabel, lf, COLOR_ROW_ALT));
        t.addCell(styledCell(enValue, vf, COLOR_WHITE));
    }

    // ── Items Table ───────────────────────────────────────────────────────────
    private static void addItemsTable(Document doc, List<QuantityItem> items) throws DocumentException {
        if (items == null || items.isEmpty()) return;

        Font hf = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 9, COLOR_WHITE);
        Font cf = FontFactory.getFont(FontFactory.HELVETICA, 9, COLOR_TEXT);

        PdfPTable table = new PdfPTable(new float[]{0.5f, 3.5f, 0.8f, 1.0f, 1.2f, 1.4f});
        table.setWidthPercentage(100);
        table.setSpacingBefore(6);

        // Header row
        String[] headers = {"#", "البيان / Description", "الوحدة / Unit",
                "الكمية / Qty", "سعر الوحدة / U.Price", "الإجمالي / Total"};
        for (String h : headers) {
            PdfPCell c = new PdfPCell(new Phrase(h, hf));
            c.setBackgroundColor(COLOR_PRIMARY);
            c.setPadding(6);
            c.setHorizontalAlignment(Element.ALIGN_CENTER);
            c.setBorderColor(COLOR_WHITE);
            table.addCell(c);
        }

        // Data rows
        for (int i = 0; i < items.size(); i++) {
            QuantityItem it = items.get(i);
            BaseColor bg = (i % 2 == 0) ? COLOR_WHITE : COLOR_SURFACE;
            table.addCell(numCell(String.valueOf(i + 1), cf, bg));
            table.addCell(styledCell(nvl(it.description), cf, bg));
            table.addCell(numCell(nvl(it.unit), cf, bg));
            table.addCell(numCell(String.format(Locale.US, "%.2f", it.quantity), cf, bg));
            table.addCell(numCell(String.format(Locale.US, "%.2f", it.unitPrice), cf, bg));
            table.addCell(numCell(String.format(Locale.US, "%.2f", it.totalPrice), cf, bg));
        }

        doc.add(table);
    }

    // ── Totals ────────────────────────────────────────────────────────────────
    private static void addTotalsSection(Document doc, List<QuantityItem> items) throws DocumentException {
        double subtotal = 0;
        if (items != null) for (QuantityItem it : items) subtotal += it.totalPrice;
        double vat   = subtotal * 0.14; // 14% VAT
        double total = subtotal + vat;

        doc.add(Chunk.NEWLINE);

        PdfPTable t = new PdfPTable(new float[]{3f, 1.5f});
        t.setWidthPercentage(60);
        t.setHorizontalAlignment(Element.ALIGN_RIGHT);

        Font lf = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, COLOR_TEXT);
        Font vf = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, COLOR_PRIMARY);

        addTotalRow(t, "المجموع قبل الضريبة  /  Subtotal", f(subtotal), lf, vf);
        addTotalRow(t, "ضريبة القيمة المضافة 14%  /  VAT 14%", f(vat), lf, vf);

        PdfPCell totalLabel = new PdfPCell(new Phrase("الإجمالي النهائي  /  Grand Total", lf));
        totalLabel.setBackgroundColor(COLOR_PRIMARY);
        totalLabel.setPadding(8);
        PdfPCell totalVal = new PdfPCell(new Phrase(f(total), FontFactory.getFont(FontFactory.HELVETICA_BOLD, 11, COLOR_WHITE)));
        totalVal.setBackgroundColor(COLOR_PRIMARY);
        totalVal.setPadding(8);
        totalVal.setHorizontalAlignment(Element.ALIGN_CENTER);
        t.addCell(totalLabel);
        t.addCell(totalVal);

        doc.add(t);

        doc.add(Chunk.NEWLINE);
        Font note = FontFactory.getFont(FontFactory.HELVETICA_OBLIQUE, 8, BaseColor.GRAY);
        doc.add(new Paragraph("* تم إعداد هذا الجدول بواسطة تطبيق iEngineer — برنامج الحصر الهندسي الشامل", note));
    }

    private static void addTotalRow(PdfPTable t, String label, String value, Font lf, Font vf) {
        PdfPCell l = new PdfPCell(new Phrase(label, lf));
        l.setPadding(6);
        l.setBackgroundColor(COLOR_ROW_ALT);
        PdfPCell v = new PdfPCell(new Phrase(value, vf));
        v.setPadding(6);
        v.setHorizontalAlignment(Element.ALIGN_CENTER);
        t.addCell(l);
        t.addCell(v);
    }

    // ── Helpers ───────────────────────────────────────────────────────────────
    private static PdfPCell styledCell(String text, Font font, BaseColor bg) {
        PdfPCell c = new PdfPCell(new Phrase(text, font));
        c.setBackgroundColor(bg);
        c.setPadding(5);
        return c;
    }

    private static PdfPCell numCell(String text, Font font, BaseColor bg) {
        PdfPCell c = styledCell(text, font, bg);
        c.setHorizontalAlignment(Element.ALIGN_CENTER);
        return c;
    }

    private static String nvl(String s) { return (s == null || s.isEmpty()) ? "—" : s; }
    private static String f(double v)   { return String.format(Locale.US, "%.2f", v); }
    private static String sanitize(String s) {
        return s == null ? "project" : s.replaceAll("[^\\w\\-]", "_").substring(0, Math.min(s.length(), 30));
    }

    // ── Header / Footer on every page ────────────────────────────────────────
    static class HeaderFooterEvent extends PdfPageEventHelper {
        private final Project project;
        HeaderFooterEvent(Project p) { this.project = p; }

        @Override
        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte cb = writer.getDirectContent();
            Font f = FontFactory.getFont(FontFactory.HELVETICA, 7, BaseColor.GRAY);

            // Footer line
            cb.setColorStroke(COLOR_PRIMARY_DARK);
            cb.setLineWidth(0.5f);
            cb.moveTo(document.left(), document.bottom() - 8);
            cb.lineTo(document.right(), document.bottom() - 8);
            cb.stroke();

            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT,
                    new Phrase("iEngineer — الحصر الهندسي الشامل", f),
                    document.left(), document.bottom() - 18, 0);

            ColumnText.showTextAligned(cb, Element.ALIGN_RIGHT,
                    new Phrase("صفحة " + writer.getPageNumber(), f),
                    document.right(), document.bottom() - 18, 0);
        }
    }

    // ── Open PDF ──────────────────────────────────────────────────────────────
    public static void openPdf(Context ctx, String path) {
        try {
            File file = new File(path);
            Uri uri = FileProvider.getUriForFile(ctx, ctx.getPackageName() + ".provider", file);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(uri, "application/pdf");
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_ACTIVITY_NEW_TASK);
            ctx.startActivity(intent);
        } catch (Exception e) {
            Log.e(TAG, "Cannot open PDF", e);
        }
    }
}
