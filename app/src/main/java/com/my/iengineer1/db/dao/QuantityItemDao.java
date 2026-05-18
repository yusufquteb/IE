package com.my.iengineer1.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.my.iengineer1.db.entity.QuantityItem;
import java.util.List;

@Dao
public interface QuantityItemDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(QuantityItem item);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<QuantityItem> items);

    @Update
    void update(QuantityItem item);

    @Delete
    void delete(QuantityItem item);

    @Query("SELECT * FROM quantity_items WHERE project_id = :projectId ORDER BY sort_order ASC")
    LiveData<List<QuantityItem>> getByProject(long projectId);

    @Query("SELECT * FROM quantity_items WHERE project_id = :projectId ORDER BY sort_order ASC")
    List<QuantityItem> getByProjectSync(long projectId);

    @Query("SELECT * FROM quantity_items WHERE project_id = :projectId AND section = :section ORDER BY sort_order ASC")
    List<QuantityItem> getBySection(long projectId, String section);

    @Query("SELECT SUM(total_price) FROM quantity_items WHERE project_id = :projectId")
    double getTotalByProject(long projectId);

    @Query("DELETE FROM quantity_items WHERE project_id = :projectId")
    void deleteByProject(long projectId);
}
