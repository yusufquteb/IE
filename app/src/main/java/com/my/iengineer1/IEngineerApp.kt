package com.my.iengineer1

import android.app.Application
import com.my.iengineer1.db.AppDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class IEngineerApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        // Keep legacy DB warm for old Activities during migration
        Thread { AppDatabase.getInstance(this) }.start()
    }

    companion object {
        private lateinit var instance: IEngineerApp

        @JvmStatic
        fun getInstance(): IEngineerApp = instance

        @JvmStatic
        fun getDatabase(): AppDatabase = AppDatabase.getInstance(instance)
    }
}
