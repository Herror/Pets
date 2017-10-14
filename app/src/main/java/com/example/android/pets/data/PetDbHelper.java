package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by enach on 10/12/2017.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    //DB version. If the DB schema is changed, you must increment the DB version
    public static final int DATABASE_VERSION = 1;

    //Name of the database file
    public static final String DATABASE_NAME = "shelter.db";

    //create the constructor
    public PetDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //create a String that contains the SQL statement to create the table
        String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + PetEntry.TABLE_NAME + " (" +
                        PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL," +
                        PetEntry.COLUMN_PET_BREED + " TEXT," +
                        PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL," +
                        PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0)";

        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
