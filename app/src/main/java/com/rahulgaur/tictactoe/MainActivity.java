package com.rahulgaur.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button B1, B2, B3, B4, B5, B6, B7, B8, B9;
    private int turn = 0;
    private int gameover = 1;
    private TextView player1, player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1 = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);
        B3 = findViewById(R.id.b3);
        B4 = findViewById(R.id.b4);
        B5 = findViewById(R.id.b5);
        B6 = findViewById(R.id.b6);
        B7 = findViewById(R.id.b7);
        B8 = findViewById(R.id.b8);
        B9 = findViewById(R.id.b9);

        player1 = findViewById(R.id.player1TV);
        player2 = findViewById(R.id.player2TV);

        Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_LONG).show();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1.setEnabled(false);
                playerTurn(turn);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B2.setEnabled(false);
                playerTurn(turn);

            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B3.setEnabled(false);
                playerTurn(turn);

            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B4.setEnabled(false);
                playerTurn(turn);

            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B5.setEnabled(false);
                playerTurn(turn);

            }
        });

        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B6.setEnabled(false);
                playerTurn(turn);

            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B7.setEnabled(false);
                playerTurn(turn);

            }
        });

        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B8.setEnabled(false);
                playerTurn(turn);

            }
        });

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B9.setEnabled(false);
                playerTurn(turn);

            }
        });

    }

    private void playerTurn(int pt) {
        if (pt == 0){
            String sourceString2 = "<b>Player 2</b>";
            player2.setText(Html.fromHtml(sourceString2));
            String sourceString1 = "Player 1";
            player1.setText(Html.fromHtml(sourceString1));
            Toast.makeText(this, "Player 2 turn", Toast.LENGTH_SHORT).show();
            turn++;
            gameover++;
        } else {
            turn--;
            String sourceString1 = "<b>Player 1</b>";
            player1.setText(Html.fromHtml(sourceString1));
            String sourceString2 = "Player 2";
            player2.setText(Html.fromHtml(sourceString2));
            Toast.makeText(this, "Player 1 turn", Toast.LENGTH_SHORT).show();
            gameover++;
        }

        if (gameover==9){
            Toast.makeText(this, "GAME OVER :D", Toast.LENGTH_SHORT).show();
        }
    }
}
