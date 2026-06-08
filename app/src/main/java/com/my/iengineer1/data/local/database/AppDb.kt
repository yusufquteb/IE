package com.my.iengineer1.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.my.iengineer1.data.local.dao.ProjectDaoKt
import com.my.iengineer1.data.local.entity.ProjectEntity

@Database(
    entities = [ProjectEntity::class],
    version = 2,
    exportSchema = true
)
abstract class AppDb : RoomDatabase() {

    abstract fun projectDaoKt(): ProjectDaoKt

    companion object {
        @Volatile private var instance: AppDb? = null

        private val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE projects_v2 ADD COLUMN client TEXT NOT NULL DEFAULT ''")
                database.execSQL("ALTER TABLE projects_v2 ADD COLUMN engineer TEXT NOT NULL DEFAULT ''")
                database.execSQL("ALTER TABLE projects_v2 ADD COLUMN location TEXT NOT NULL DEFAULT ''")
            }
        }

        fun getInstance(context: Context): AppDb =
            instance ?: synchronized(this) {
                instance ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDb::class.java,
                    "iengineer_pro.db"
                ).addMigrations(MIGRATION_1_2).build().also { instance = it }
            }
    }
}
