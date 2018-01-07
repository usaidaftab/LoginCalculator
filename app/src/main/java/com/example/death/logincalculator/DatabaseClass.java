package com.example.death.logincalculator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Death on 10/30/2017.
 */

public class DatabaseClass extends SQLiteOpenHelper {

    static final String db_name="my_db";
    static final String table_name="my_table";

    public DatabaseClass(Context context) {
        super(context, db_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table "+table_name+ "(username text, password text) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("drop table if exist "+table_name+ ";");
        onCreate(sqLiteDatabase);

    }

    public long insertData(String username, String password){

        SQLiteDatabase object=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("username",username);
        values.put("password",password);
        long result=object.insert(table_name,null,values);
        return result;
    }

    public boolean check(String username, String password){

        SQLiteDatabase dbobject=this.getReadableDatabase();
        Cursor res= dbobject.rawQuery("select * from "+table_name+ " where username='"+username+"' and password='"+password+"'",null);

        int noOfreords=0;
        res.moveToFirst();
        while (res.isAfterLast()==false){

            noOfreords++;
            res.moveToNext();

        }

        dbobject.close();

        boolean result=false;
        if (noOfreords>0){
            result=true;
        }
        else
            result=false;

        return result;
    }

}//class ending
