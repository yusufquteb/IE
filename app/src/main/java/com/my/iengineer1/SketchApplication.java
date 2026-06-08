package com.my.iengineer1;

import android.app.Application;
import com.my.iengineer1.db.AppDatabase;

// Legacy stub — kept so old Activities compile during migration.
// The real Application class is IEngineerApp (Hilt).
public class SketchApplication extends Application {

    public static SketchApplication getInstance() {
        return (SketchApplication) IEngineerApp.getInstance();
    }

    public static AppDatabase getDatabase() {
        return IEngineerApp.getDatabase();
    }
}
