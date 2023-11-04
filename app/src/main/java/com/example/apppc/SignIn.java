package com.example.apppc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {
    TextView tv_switch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        tv_switch = (TextView) findViewById(R.id.tv_switch_main);
        tv_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignIn.this,SignUp.class);
                startActivity(i);
            }
        });
    }
}