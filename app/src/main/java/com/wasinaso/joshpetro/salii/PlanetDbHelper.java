package com.wasinaso.joshpetro.salii;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Josh Petro on 7/21/2016.
 */
public class PlanetDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "PLANETINFO.DB";
    private static final int DATABASE_VERSION = 1;


    public PlanetDbHelper(Context context){

        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.e("PlanetDbHelper: ", "Database created/opened..." );
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d("PlanetDBHelper: ", "Oncreate Hit");
        sqLiteDatabase.execSQL(NewPlanetContract.SQL_CREATE_ENTRIES);
        Log.d("PlanetDbHelper: ", "Created New Planet Table");

    }

    public void addPlanet(SQLiteDatabase sqLiteDatabase){
        ContentValues contentValues = new ContentValues();
        contentValues.put(GeneratePlanet.NewPlanetInfo.PLANET_NAME, "Test1");

        sqLiteDatabase.insert(GeneratePlanet.NewPlanetInfo.PLANET_TABLE_NAME,null,contentValues);
        Log.d("PlanetDbHelper: ", "One Row Inserted...");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        sqLiteDatabase.execSQL(NewPlanetContract.SQL_DELETE_ENTRIES);
        onCreate(sqLiteDatabase);
    }
}
