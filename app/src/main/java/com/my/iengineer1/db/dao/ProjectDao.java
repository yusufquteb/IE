package com.my.iengineer1.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.my.iengineer1.db.entity.Project;
import java.util.List;

@Dao
public interface ProjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(Project project);

    @Update
    void update(Project project);

    @Delete
    void delete(Project project);

    @Query("SELECT * FROM projects ORDER BY updated_at DESC")
    LiveData<List<Project>> getAll();

    @Query("SELECT * FROM projects ORDER BY updated_at DESC")
    List<Project> getAllSync();

    @Query("SELECT * FROM projects WHERE id = :id LIMIT 1")
    Project getById(long id);

    @Query("SELECT * FROM projects WHERE type = :type ORDER BY updated_at DESC")
    LiveData<List<Project>> getByType(String type);

    @Query("DELETE FROM projects WHERE id = :id")
    void deleteById(long id);

    @Query("SELECT COUNT(*) FROM projects")
    int count();
}
