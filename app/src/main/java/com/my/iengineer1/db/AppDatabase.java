package com.my.iengineer1.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.my.iengineer1.db.dao.ProjectDao;
import com.my.iengineer1.db.dao.QuantityItemDao;
import com.my.iengineer1.db.entity.Project;
import com.my.iengineer1.db.entity.QuantityItem;

@Database(
    entities = {Project.class, QuantityItem.class},
    version = 1,
    exportSchema = false
)
public abstract class AppDatabase extends RoomDatabase {

    private static volatile AppDatabase INSTANCE;

    public abstract ProjectDao projectDao();
    public abstract QuantityItemDao quantityItemDao();

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AppDatabase.class,
                            "iengineer.db"
                    ).fallbackToDestructiveMigration().build();
                }
            }
        }
        return INSTANCE;
    }
}
