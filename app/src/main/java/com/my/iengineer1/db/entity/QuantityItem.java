package com.my.iengineer1.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
    tableName = "quantity_items",
    foreignKeys = @ForeignKey(
        entity = Project.class,
        parentColumns = "id",
        childColumns = "project_id",
        onDelete = ForeignKey.CASCADE
    ),
    indices = {@Index("project_id")}
)
public class QuantityItem {

    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "project_id")
    public long projectId;

    @ColumnInfo(name = "item_no")
    public String itemNo;       // e.g. "1.1"

    @ColumnInfo(name = "description")
    public String description;  // e.g. "خرسانة أساسات"

    @ColumnInfo(name = "unit")
    public String unit;         // م³ / م² / م / ط

    @ColumnInfo(name = "quantity")
    public double quantity;

    @ColumnInfo(name = "unit_price")
    public double unitPrice;

    @ColumnInfo(name = "total_price")
    public double totalPrice;

    @ColumnInfo(name = "section")
    public String section;      // "concrete" | "steel" | "masonry" | "road" | "sanitation"

    @ColumnInfo(name = "notes")
    public String notes;

    @ColumnInfo(name = "sort_order")
    public int sortOrder;

    public double calcTotal() {
        totalPrice = quantity * unitPrice;
        return totalPrice;
    }
}
