package com.rahulgaur.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button B1, B2, B3, B4, B5, B6, B7, B8, B9;
    private int turn = 0;
    private int gameover = 0;
    private TextView player1, player2;
    private static String TAG = "MainActivity.java";
    private String matrix[][] = new String[3][3];
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                ,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        findViewByIds();

        //giving default values to matrix
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                matrix[i][j] = "-";
            }
        }

        builder = new AlertDialog.Builder(this);
        builder.setPositiveButton("Play Again 😊😊", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(MainActivity.this, Welcome.class);
                startActivity(i);
                finish();
            }
        });

        Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_LONG).show();

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1.setEnabled(false);
                if (turn == 0) {
                    makeMatrix("O", R.id.b1);
                    winCondition("O");
                } else {
                    makeMatrix("X", R.id.b1);
                    winCondition("X");
                }
                playerTurn(turn, B1);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B2.setEnabled(false);
                if (turn == 0) {
                    makeMatrix("O", R.id.b2);
                    winCondition("O");
                } else {
                    makeMatrix("X", R.id.b2);
                    winCondition("X");
                }
                playerTurn(turn, B2);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B3.setEnabled(false);
                if (turn == 0) {
                    makeMatrix("O", R.id.b3);
                    winCondition("O");
                } else {
                    makeMatrix("X", R.id.b3);
                    winCondition("X");
                }
                playerTurn(turn, B3);

            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B4.setEnabled(false);
                if (turn == 0) {
                    makeMatrix("O", R.id.b4);
                    winCondition("O");
                } else {
                    makeMatrix("X", R.id.b4);
                    winCondition("X");
                }
                playerTurn(turn, B4);

            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B5.setEnabled(false);
                if (turn == 0) {
                    makeMatrix("O", R.id.b5);
                    winCondition("O");
                } else {
                    makeMatrix("X", R.id.b5);
                    winCondition("X");
                }
                playerTurn(turn, B5);

            }
        });

        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B6.setEnabled(false);
                if (turn == 0) {
                    makeMatrix("O", R.id.b6);
                    winCondition("O");
                } else {
                    makeMatrix("X", R.id.b6);
                    winCondition("X");
                }
                playerTurn(turn, B6);

            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B7.setEnabled(false);
                if (turn == 0) {
                    makeMatrix("O", R.id.b7);
                    winCondition("O");
                } else {
                    makeMatrix("X", R.id.b7);
                    winCondition("X");
                }
                playerTurn(turn, B7);

            }
        });

        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B8.setEnabled(false);
                if (turn == 0) {
                    makeMatrix("O", R.id.b8);
                    winCondition("O");
                } else {
                    makeMatrix("X", R.id.b8);
                    winCondition("X");
                }
                playerTurn(turn, B8);

            }
        });

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B9.setEnabled(false);
                if (turn == 0) {
                    makeMatrix("O", R.id.b9);
                    winCondition("O");
                } else {
                    makeMatrix("X", R.id.b9);
                    winCondition("X");
                }
                playerTurn(turn, B9);

            }
        });

    }

    private void findViewByIds() {
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
    }

    private void makeMatrix(String value, int btn) {
        switch (btn) {
            case R.id.b1:
                matrix[0][0] = value;
                break;
            case R.id.b2:
                matrix[0][1] = value;
                break;
            case R.id.b3:
                matrix[0][2] = value;
                break;
            case R.id.b4:
                matrix[1][0] = value;
                break;
            case R.id.b5:
                matrix[1][1] = value;
                break;
            case R.id.b6:
                matrix[1][2] = value;
                break;
            case R.id.b7:
                matrix[2][0] = value;
                break;
            case R.id.b8:
                matrix[2][1] = value;
                break;
            case R.id.b9:
                matrix[2][2] = value;
                break;
            default:
                break;
        }
    }

    private void winCondition(String turn) {
        ArrayList<String> arr = new ArrayList<>();

        //for diagonal left to right "\" win checks "DONE"
        Log.e(TAG, "diagonal left to right");
        for (int col = 0; col <= 2; col++) {
            for (int j = col; j <= col; j++) {
                for (int i = col; i <= col; i++) {
                    try {
                        if (gameover >= 4) {
                            Log.e(TAG, "" + i + j);
                            Log.e(TAG, "matrix " + matrix[i][j]);
                            arr.add(matrix[i][j]);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (gameover >= 4) {
            if (arr.get(0).equals(arr.get(1)) && arr.get(1).equals(arr.get(2)) && !arr.get(1).equals("-")) {
                Log.e(TAG, "winner winner winner " + arr.get(0) + arr.get(1) + arr.get(2));
                turn = turn + 1;
                builder.setMessage(arr.get(0)+" is the ultimate winner\n\uD83D\uDC51\uD83D\uDC51\uD83D\uDC51\uD83D\uDC51");
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            } else {
                Log.e(TAG, "no no no no no " + arr.get(0) + arr.get(1) + arr.get(2));
            }
        }
        arr.clear();

        //for diagonal right to left "/" win checks "DONE"
        int exit = 2;
        Log.e(TAG, "diagonal right to left");
        for (int j = 0; j <= 2; j++) {
            for (int i = 2; i >= 0; i--) {
                if (i == exit) {
                    if (gameover >= 4) {
                        Log.e(TAG, "" + j + i);
                        Log.e(TAG, "matrix " + matrix[j][i]);
                        arr.add(matrix[j][i]);
                    }
                }
            }
            exit--;
        }
        if (gameover >= 4) {
            if (arr.get(0).equals(arr.get(1)) && arr.get(1).equals(arr.get(2))&& !arr.get(1).equals("-")) {
                Log.e(TAG, "winner winner winner " + arr.get(0) + arr.get(1) + arr.get(2));
                turn = turn + 1;
                builder.setMessage(arr.get(0)+" is the ultimate winner\n\uD83D\uDC51\uD83D\uDC51\uD83D\uDC51\uD83D\uDC51");
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            } else {
                Log.e(TAG, "no no no no no " + arr.get(0) + arr.get(1) + arr.get(2));
            }
        }
        arr.clear();

        //for horizontal win checks "DONE"
        Log.e(TAG, "horizontal");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (gameover >= 4) {
                    Log.e(TAG, " " + i + j);
                    Log.e(TAG, "matrix " + matrix[i][j]);
                    arr.add(matrix[i][j]);
                }
            }

            if (gameover >= 4) {
                if (arr.get(0).equals(arr.get(1)) && arr.get(1).equals(arr.get(2)) && !arr.get(1).equals("-")) {
                    Log.e(TAG, "winner winner winner " + arr.get(0) + arr.get(1) + arr.get(2));
                    turn = turn + 1;
                    builder.setMessage(arr.get(0)+" is the ultimate winner\n\uD83D\uDC51\uD83D\uDC51\uD83D\uDC51\uD83D\uDC51");
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Log.e(TAG, "no no no no no " + arr.get(0) + arr.get(1) + arr.get(2));
                }
            }
            arr.clear();
        }

        //for vertical win checks "DONE"
        Log.e(TAG, "vertical");
        for (int col = 0; col <= 2; col++) {
            for (int j = 0; j <= 2; j++) {
                for (int i = 0; i <= col; i++) {
                    if (i >= col) {
                        if (gameover >= 4) {
                            Log.e(TAG, "" + j + i);
                            Log.e(TAG, "matrix " + matrix[j][i]);
                            arr.add(matrix[j][i]);
                        }
                    }
                }
            }
            if (gameover >= 4) {
                if (arr.get(0).equals(arr.get(1)) && arr.get(1).equals(arr.get(2))&& !arr.get(1).equals("-")) {
                    Log.e(TAG, "winner winner winner " + arr.get(0) + arr.get(1) + arr.get(2));
                    turn = turn + 1;
                    builder.setMessage(arr.get(0)+" is the ultimate winner\n\uD83D\uDC51\uD83D\uDC51\uD83D\uDC51\uD83D\uDC51");
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                } else {
                    Log.e(TAG, "no no no no no " + arr.get(0) + arr.get(1) + arr.get(2));
                }
            }
            arr.clear();
        }
    }

    private void playerTurn(int pt, Button btn) {
        if (pt == 0) {
            btn.setText("O");
            btn.setTextColor(Color.BLACK);
            String sourceString2 = "<b>Player X</b>";
            player2.setText(Html.fromHtml(sourceString2));
            player2.setTextSize(40);
            String sourceString1 = "Player O";
            player1.setText(Html.fromHtml(sourceString1));
            player1.setTextSize(35);
            turn++;
            gameover++;
        } else {
            btn.setText("X");
            turn--;
            btn.setTextColor(Color.BLACK);
            String sourceString1 = "<b>Player O</b>";
            player1.setText(Html.fromHtml(sourceString1));
            player1.setTextSize(40);
            String sourceString2 = "Player X";
            player2.setText(Html.fromHtml(sourceString2));
            player2.setTextSize(35);
            gameover++;
        }

        if (gameover >= 9) {
            Toast.makeText(this, "GAME OVER :D", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "playerTurn: match ended");
            builder.setMessage("It's a DRAW!! You both are Winners 😄😄");
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    }

}