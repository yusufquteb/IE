package com.my.iengineer1;

import android.app.Application;
import com.my.iengineer1.db.AppDatabase;

public class SketchApplication extends Application {

    private static SketchApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        // Warm up Room DB on background thread
        new Thread(() -> AppDatabase.getInstance(this)).start();
    }

    public static SketchApplication getInstance() {
        return instance;
    }

    public static AppDatabase getDatabase() {
        return AppDatabase.getInstance(instance);
    }
}
