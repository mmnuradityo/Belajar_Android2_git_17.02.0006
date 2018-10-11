package com.project_n.splashscreen.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Nurad on 11/10/2018.
 */

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "biodatadiri.db";
    private static final int DATABASE_VERTSION = 1;

    public DataHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERTSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "create table biodata(nama text null, pass text null);";
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}
