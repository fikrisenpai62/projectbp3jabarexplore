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

public class wipanyaweuan extends AppCompatActivity {
    Button btnbackpny;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wipanyaweuan);
        btnbackpny = (Button) findViewById(R.id.btnbackpny);

        btnbackpny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackPny = new Intent(getApplicationContext(), mjlwisata.class);
                startActivity(BackPny);
            }
        });
    }
}