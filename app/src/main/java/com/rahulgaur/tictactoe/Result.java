package com.rahulgaur.tictactoe;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String player = getIntent().getStringExtra("player");
        TextView text = findViewById(R.id.winnerTV);
        text.setTextColor(Color.BLACK);
        if (player.equals("no"))
            text.setText("It's a DRAW!!\n Everyone is a Winner!!\n😄😄😄😄");
        else
            text.setText("Player " + player + " is the\n👑👑 KING!! 👑👑");
    }
}
