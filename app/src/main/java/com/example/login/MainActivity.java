package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity<view> extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

        public void openActivity3(){
            Intent intent = new Intent (this, MainActivity3.class);
            startActivity(intent);

            TextView username =(TextView) findViewById(R.id.username);
            TextView password =(TextView) findViewById(R.id.password);

           Button loginbtn = (Button) findViewById(R.id.loginbtn);

            //admin and admin

            loginbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (username.getText().toString().equals("19010413")&& password.getText ().toString().equals("445")){
                        //correct

                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    }else
                        //incorrect
                        Toast.makeText(MainActivity.this, "Login Unsuccessful, please try again!", Toast.LENGTH_SHORT).show();
                }
            });
        }};


