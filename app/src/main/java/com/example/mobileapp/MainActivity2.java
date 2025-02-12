package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        TextView lets_signupbtn = findViewById((R.id.textView2));
                 lets_signupbtn.setOnClickListener((v -> {
                     Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                     startActivity(intent);

                      } )
                 );
        Button lets_homebtn = findViewById((R.id.button));
               lets_homebtn.setOnClickListener((v -> {
                   Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                   startActivity(intent);
               }));
        }
}




