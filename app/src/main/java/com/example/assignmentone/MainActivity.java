package com.example.assignmentone; // 替换为你的实际包名

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 绑定四个按钮
        ImageButton btnFacilities = findViewById(R.id.btn_facilities);
        ImageButton btnEvents = findViewById(R.id.btn_events);
        ImageButton btnClubs = findViewById(R.id.btn_clubs);
        ImageButton btnSupport = findViewById(R.id.btn_support);

        // Facilities按钮：跳转+传递标识0
        btnFacilities.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("ITEM_ID", 0);  // 0代表Facilities
            startActivity(intent);
        });

        // Events按钮：跳转+传递标识1
        btnEvents.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("ITEM_ID", 1);  // 1代表Events
            startActivity(intent);
        });

        // Clubs按钮：跳转+传递标识2
        btnClubs.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("ITEM_ID", 2);  // 2代表Clubs
            startActivity(intent);
        });

        // Support按钮：跳转+传递标识3
        btnSupport.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("ITEM_ID", 3);  // 3代表Support
            startActivity(intent);
        });
    }
}