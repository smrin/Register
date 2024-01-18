package com.example.registationpagev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome to page ", Toast.LENGTH_SHORT).show();

        EditText username=(EditText) findViewById(R.id.username);
        MaterialButton regbn=(MaterialButton) findViewById(R.id.signupbtn);
        regbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1=username.getText().toString();
                Toast.makeText(MainActivity.this, "usename is "+username1, Toast.LENGTH_SHORT).show();

            }
        });
       }
                
    }
