package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie x= new Movie("avengers","robert downy jr",8.0,13,"action");
        Movie y= new Movie("harry potter"," Daniel Radcliffe",7.6,13,"fantasy");

    }
}