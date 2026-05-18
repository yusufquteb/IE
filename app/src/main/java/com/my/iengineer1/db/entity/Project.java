package com.my.iengineer1.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "projects")
public class Project {

    @PrimaryKey(autoGenerate = true)
    public long id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "type")
    public String type; // "structures" | "roads" | "sanitation" | "finishes"

    @ColumnInfo(name = "client")
    public String client;

    @ColumnInfo(name = "engineer")
    public String engineer;

    @ColumnInfo(name = "location")
    public String location;

    @ColumnInfo(name = "notes")
    public String notes;

    @ColumnInfo(name = "created_at")
    public long createdAt;

    @ColumnInfo(name = "updated_at")
    public long updatedAt;

    public Project() {
        createdAt = System.currentTimeMillis();
        updatedAt = createdAt;
    }

    public static Project create(String name, String type, String client, String engineer, String location) {
        Project p = new Project();
        p.name     = name;
        p.type     = type;
        p.client   = client;
        p.engineer = engineer;
        p.location = location;
        return p;
    }
}
