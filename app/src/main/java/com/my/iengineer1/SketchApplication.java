package com.my.iengineer1;

import android.app.Application;
import android.content.res.Configuration;

public class SketchApplication extends Application {

    private static SketchApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static SketchApplication getInstance() {
        return instance;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
