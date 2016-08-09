package com.wasinaso.joshpetro.salii;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewGameActivity extends AppCompatActivity {

    Context context;
    PlanetDbHelper planetDbHelper;
    SQLiteDatabase sqLiteDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        setContentView(R.layout.activity_new_game);
        //// TODO: 7/21/2016 Collect Planet Name, player name
        final Button save_planet_but = (Button) findViewById(R.id.planet_save_button);
        save_planet_but.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d("On Click", ": Saved Button");
                savePlanet(view);
            }
        });


    }
    public void savePlanet(View view)
    {
        MyApp.getInstance().getApplicationContext();
        Log.d("I clicked ","User Save Planet");
        planetDbHelper = new PlanetDbHelper(context.getApplicationContext());
        sqLiteDatabase = planetDbHelper.getWritableDatabase();
        //planetDbHelper.addPlanet(sqLiteDatabase);
        Toast.makeText(getBaseContext(),"Data Saved",Toast.LENGTH_LONG).show();
    }
}
