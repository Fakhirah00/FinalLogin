package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    String name, email, age;

    EditText goal1;
    EditText goal2;
    EditText goal3;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        goal1 = (EditText) findViewById(R.id.goal1);
        goal2 = (EditText) findViewById(R.id.goal2);
        goal3 = (EditText) findViewById(R.id.goal3);

        submitButton= (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = goal1.getText().toString();
                email= goal2.getText().toString();
                age= goal3.getText().toString();

                showToast(name);
                showToast(email);
                showToast(age);
            }

            private void showToast(String text) {
                Toast.makeText(MainActivity4.this, text, Toast.LENGTH_SHORT).show();
            }
        });

    }
}