package com.project_n.splashscreen.room;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract MahasiswaDao userDao();
}
