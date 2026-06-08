package com.my.iengineer1.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.my.iengineer1.data.local.dao.ProjectDaoKt
import com.my.iengineer1.data.local.entity.ProjectEntity

@Database(
    entities = [ProjectEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDb : RoomDatabase() {

    abstract fun projectDaoKt(): ProjectDaoKt

    companion object {
        @Volatile private var instance: AppDb? = null

        fun getInstance(context: Context): AppDb =
            instance ?: synchronized(this) {
                instance ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDb::class.java,
                    "iengineer_pro.db"
                ).build().also { instance = it }
            }
    }
}
