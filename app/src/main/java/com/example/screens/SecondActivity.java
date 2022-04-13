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
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        intent = getIntent();
        textView = findViewById(R.id.secondActivityTextView);
        String carName = intent.getStringExtra("Gemera");
        textView.setText(carName);

        Log.d("test", carName);

       /* Context context = imageView.getContext();

        int id = context.getResources().getIdentifier(carName.toLowerCase(Locale.ROOT), "drawable", context.getPackageName());
        imageView = findViewById(R.id.carPicture);
        imageView.setImageResource(id);*/


        ImageView myImageView = (ImageView)findViewById(R.id.car_picture);
        myImageView.setImageResource(0);
        myImageView.setImageResource(R.drawable.gemera);



    }


}