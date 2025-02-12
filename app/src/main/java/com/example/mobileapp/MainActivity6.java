package com.example.mobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        ImageView youtube_btn = findViewById(R.id.imageView13);
                  youtube_btn.setOnClickListener(v -> {
                      Uri uri = Uri.parse("https://youtu.be/8kLfPkOSWMU?si=Dqg8MNoURYaIT7wR");
                      Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                      startActivity(intent);

                  });

        ImageView facebook_btn = findViewById(R.id.imageView9);
        facebook_btn.setOnClickListener(v1 -> {
            Uri uri = Uri.parse("https://web.facebook.com/?_rdc=1&_rdr");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

                  });

        ImageView insta_btn = findViewById(R.id.imageView7);
        insta_btn.setOnClickListener(v1 -> {
            Uri uri = Uri.parse("https://www.instagram.com/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        });
        ImageView lets_homeview = findViewById((R.id.imageView11));
        lets_homeview.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity6.this,MainActivity4.class);
            startActivity(intent);

        }));
        ImageView lets_myaccview = findViewById((R.id.imageView10));
        lets_myaccview.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity6.this,MainActivity8.class);
            startActivity(intent);

        }));
        ImageView lets_Logout = findViewById((R.id.imageView8));
        lets_Logout.setOnClickListener((v -> {
            Intent intent = new Intent(MainActivity6.this,MainActivity2.class);
            startActivity(intent);

        }));

    }
}