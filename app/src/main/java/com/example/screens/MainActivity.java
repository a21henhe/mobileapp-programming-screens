package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   onButtonClick();
            }
        }
        );

        imageView = findViewById(R.id.gemera);
    }

    private void onButtonClick(){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(getString(R.string.Car_name_gemera), getString(R.string.Car_picture_value_gemera));
        startActivity(intent);
    }
}
