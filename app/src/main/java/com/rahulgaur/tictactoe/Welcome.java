package com.rahulgaur.tictactoe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Welcome extends AppCompatActivity {
    private String username;
    private TextView nameTV;
    private EditText nameET;
    private Button submitBtn;
    private String TAG = "Welcome.java";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        submitBtn = findViewById(R.id.welcome_submitBtn);
        Button playBtn = findViewById(R.id.welcome_playBtn);

        nameET = findViewById(R.id.welcome_editText);
        nameTV = findViewById(R.id.welcome_userTV);

        pref();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                username = nameET.getText().toString().toUpperCase();

                if (!username.isEmpty()) {
                    SharedPreferences.Editor editor = getSharedPreferences("USERNAME", MODE_PRIVATE).edit();
                    editor.putString("name", username);
                    editor.apply();
                    nameTV.setText("Welcome\n" + username);
                    nameET.setVisibility(View.INVISIBLE);
                    nameET.setEnabled(false);
                    submitBtn.setEnabled(false);
                    submitBtn.setVisibility(View.INVISIBLE);
                } else {
                    Toast.makeText(Welcome.this, "Please Enter Your Name! :)", Toast.LENGTH_SHORT).show();
                }
            }
        });

        nameTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameET.setVisibility(View.VISIBLE);
                nameET.setEnabled(true);
                submitBtn.setEnabled(true);
                submitBtn.setVisibility(View.VISIBLE);
            }
        });

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Welcome.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    @SuppressLint("SetTextI18n")
    void pref() {
        final SharedPreferences prefs = getSharedPreferences("USERNAME", MODE_PRIVATE);
        try {
            String name = prefs.getString("name", null); //"No name defined" is the default value
            if (!Objects.requireNonNull(name).isEmpty()) {
                Toast.makeText(this, "Welcome Back " + name, Toast.LENGTH_SHORT).show();
                nameTV.setText("Welcome\n" + name);
                nameET.setVisibility(View.INVISIBLE);
                nameET.setEnabled(false);
                submitBtn.setEnabled(false);
                submitBtn.setVisibility(View.INVISIBLE);
            } else {
                Log.e(TAG, "pref: No prefs found");
                nameET.setVisibility(View.VISIBLE);
                nameET.setEnabled(true);
                submitBtn.setEnabled(true);
                submitBtn.setVisibility(View.VISIBLE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
