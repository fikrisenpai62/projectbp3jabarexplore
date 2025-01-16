package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class readtenjo extends AppCompatActivity {
    Button btnbacktenjo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readtenjo);
        btnbacktenjo= (Button) findViewById(R.id.btnbacktenjo);

        btnbacktenjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackTenjo = new Intent(getApplicationContext(), kuningwisata.class);
                startActivity(BackTenjo);
            }
        });
    }
}