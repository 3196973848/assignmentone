package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnFacilities = findViewById(R.id.btn_facilities);
        ImageButton btnEvents = findViewById(R.id.btn_events);
        ImageButton btnClubs = findViewById(R.id.btn_clubs);
        ImageButton btnSupport = findViewById(R.id.btn_support);

        btnFacilities.setOnClickListener(v -> Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show());
        btnEvents.setOnClickListener(v -> Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show());
        btnClubs.setOnClickListener(v -> Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show());
        btnSupport.setOnClickListener(v -> Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show());
    }
}