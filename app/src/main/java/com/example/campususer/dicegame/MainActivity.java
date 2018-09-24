package com.example.campususer.dicegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView systemImageView;
    private TextView text_player;
    private Button button_1, button_2, button_3, button_4, button_5,button_6;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        systemImageView = findViewById(R.id.system);
        button_1 = findViewById(R.id.button3);
        button_2 = findViewById(R.id.button4);
        button_3 = findViewById(R.id.button6);
        button_4 = findViewById(R.id.button7);
        button_5 = findViewById(R.id.button8);
        button_6 = findViewById(R.id.button9);
        text_player = findViewById(R.id.textView);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOnClick(button_1);
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOnClick(button_2);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOnClick(button_3);
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOnClick(button_4);
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOnClick(button_5);
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOnClick(button_6);
            }
        });
    }

    private void buttonOnClick(Button button) {
        String userText = button.getText().toString();
        text_player.setText(String.format("Your selection is: %s", userText));
        setImageSystem();
       // button.setVisibility(View.INVISIBLE);
    }

    public void setImageSystem() {
        int number = random.nextInt(6)+1;
        systemImageView.setVisibility(View.VISIBLE);
        switch (number) {
            case 1:
                systemImageView.setImageResource(R.drawable.dice_one);
                break;
            case 2:
                systemImageView.setImageResource(R.drawable.dice_two);
                break;
            case 3:
                systemImageView.setImageResource(R.drawable.dice_three);
                break;
            case 4:
                systemImageView.setImageResource(R.drawable.dice_four);
                break;
            case 5:
                systemImageView.setImageResource(R.drawable.dice_five);
                break;
            case 6:
                systemImageView.setImageResource(R.drawable.dice_six);
                break;
        }
    }
}