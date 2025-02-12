package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main8);

        ImageView lets_homeview = findViewById((R.id.imageView19));
        lets_homeview.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity8.this,MainActivity4.class);
            startActivity(intent);

        }));

        ImageView lets_myaccview = findViewById((R.id.imageView18));
        lets_myaccview.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity8.this,MainActivity8.class);
            startActivity(intent);

        }));
        ImageView lets_Logout = findViewById((R.id.imageView20));
        lets_Logout.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity8.this,MainActivity2.class);
            startActivity(intent);

        }));

    }
}