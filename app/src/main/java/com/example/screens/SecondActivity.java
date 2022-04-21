package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class SecondActivity extends AppCompatActivity {
    Intent intent;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        intent = getIntent();
        textView = findViewById(R.id.secondActivityTextView);
        String carName = intent.getStringExtra("Gemera") + " is the car in the previous activity.";
        textView.setText(carName);

    }
}