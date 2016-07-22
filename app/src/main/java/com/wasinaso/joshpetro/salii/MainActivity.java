package com.wasinaso.joshpetro.salii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String NEW_GAME = "NewGame";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_new_game = (Button) findViewById(R.id.new_game);

        button_new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(NEW_GAME, "onClick: New Game Started");
                Intent intent = new Intent(view.getContext(),NewGameActivity.class);
                    startActivity(intent);
            }
        });
    }
}
