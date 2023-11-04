package com.example.apppc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewFlipper viewFlipper = findViewById(R.id.viewFlipper);
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();

    }
}