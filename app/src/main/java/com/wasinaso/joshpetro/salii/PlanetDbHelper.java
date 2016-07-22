package com.wasinaso.joshpetro.salii;

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

    // Common column names
    private static final String KEY_ID = "id";
    private static final String KEY_CREATED_AT = "created_at";

    private static final String CREATE_QUERY =
            "CREATE TABLE "+GeneratePlanet.NewPlanetInfo.PLANET_TABLE_NAME+"("
                    + PlanetDbHelper.KEY_ID+ " INTEGER PRIMARY KEY,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_NAME+ " TEXT,"
                    + GeneratePlanet.NewPlanetInfo.PLAYER_NAME + " TEXT,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_HABITABLE + " BIT,"
                    + GeneratePlanet.NewPlanetInfo.GOLDILOX_VALUE + " BIT,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_TYPE + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_POPULATION + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_POPULATION_LIMIT + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_RESOURCE_LIST + " STRING,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_PRODUCTION_VALUE + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_EXPLORATION_COST + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_LOCAL_HOSTILITY + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_PLANETARY_HOSTILITY + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_SIZE + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_HABITAL_ZONES + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_FOOD + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_BUILDING_MATERIAL + " INTEGER,"
                    + GeneratePlanet.NewPlanetInfo.PLANET_CREDITS + " INTEGER,"
                    + PlanetDbHelper.KEY_CREATED_AT + " DATETIME" + ")";

    public PlanetDbHelper(Context context){

        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.e("PlanetDbHelper: ", "Database created/opened..." );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_QUERY);
        Log.d("PlanetDbHelper: ", "Created New Planet Table");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
