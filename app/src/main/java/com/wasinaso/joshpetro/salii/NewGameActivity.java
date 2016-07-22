package com.wasinaso.joshpetro.salii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NewGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        //// TODO: 7/21/2016 Collect Planet Name, player name

        final Button save_button = (Button) findViewById(R.id.planet_save_button);

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("NewGameActivity: ", "Player Attempted to Save");
                PlanetDbHelper.class

            }
        });
    }
}
