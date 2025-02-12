package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main9);

        ImageView lets_homeview = findViewById((R.id.imageView21));
        lets_homeview.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity9.this,MainActivity4.class);
            startActivity(intent);

        }));
        ImageView lets_myaccview = findViewById((R.id.imageView22));
        lets_myaccview.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity9.this,MainActivity8.class);
            startActivity(intent);

        }));
        ImageView lets_Logout = findViewById((R.id.imageView16));
        lets_Logout.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity9.this,MainActivity2.class);
            startActivity(intent);

        }));

    }
}