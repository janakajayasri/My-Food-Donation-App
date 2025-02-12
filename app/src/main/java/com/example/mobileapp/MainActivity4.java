package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ImageButton lets_donatebtn = findViewById((R.id.imageButton3));
        lets_donatebtn.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
            startActivity(intent);

        }));

        ImageButton lets_aboutbtn = findViewById((R.id.imageButton2));
        lets_aboutbtn.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity6.class);
            startActivity(intent);

        }));

        ImageButton lets_recivebtn = findViewById((R.id.imageButton4));
        lets_recivebtn.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity7.class);
            startActivity(intent);

        }));

        ImageView lets_homeview = findViewById((R.id.imageView));
        lets_homeview.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity4.class);
            startActivity(intent);

        }));
        ImageView lets_myaccview = findViewById((R.id.imageView2));
        lets_myaccview.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity8.class);
            startActivity(intent);

        }));

        ImageButton lets_Logoutbtn = findViewById((R.id.imageButton7));
        lets_Logoutbtn.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
            startActivity(intent);

        }));
        ImageView lets_Logout = findViewById((R.id.imageView3));
        lets_Logout.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity2.class);
            startActivity(intent);

        }));
        ImageButton lets_history = findViewById((R.id.imageButton));
        lets_history.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity4.this,MainActivity9.class);
            startActivity(intent);

        }));
    }
}