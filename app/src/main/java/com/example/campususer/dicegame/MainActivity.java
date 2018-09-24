package com.example.campususer.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView system, player;
    private TextView text_system, text_player;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        system = findViewById(R.id.system);
        player = findViewById(R.id.player);
        text_system = findViewById(R.id.text_system);
        text_player = findViewById(R.id.text_player);

        random = new Random();
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*int playerRoll = random.nextInt(6) + 1;*/
                int systemRoll = random.nextInt(6) + 1;

                setImageSystem(systemRoll);
                /*setImagePlayer(playerRoll);*/
            }
        });
    }

    public void setImageSystem(int number) {
        switch (number) {
            case 1:
                system.setImageResource(R.drawable.dice_one);
                break;
            case 2:
                system.setImageResource(R.drawable.dice_two);
                break;
            case 3:
                system.setImageResource(R.drawable.dice_three);
                break;
            case 4:
                system.setImageResource(R.drawable.dice_four);
                break;
            case 5:
                system.setImageResource(R.drawable.dice_five);
                break;
            case 6:
                system.setImageResource(R.drawable.dice_six);
                break;
        }
    }

    /*public void setImagePlayer(int number) {
        switch (number) {
            case 1:
                player.setImageResource(R.drawable.dice_one);
                break;
            case 2:
                player.setImageResource(R.drawable.dice_two);
                break;
            case 3:
                player.setImageResource(R.drawable.dice_three);
                break;
            case 4:
                player.setImageResource(R.drawable.dice_four);
                break;
            case 5:
                player.setImageResource(R.drawable.dice_five);
                break;
            case 6:
                player.setImageResource(R.drawable.dice_six);
                break;
        }
    }*/

}