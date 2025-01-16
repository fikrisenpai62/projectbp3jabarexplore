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

public class mjl extends AppCompatActivity {
    Button btnbackmjl, readmoremjl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mjl);
        btnbackmjl = (Button) findViewById(R.id.btnbackmjl);
        readmoremjl = (Button) findViewById(R.id.readmoremjl);

        btnbackmjl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackMjl = new Intent(getApplicationContext(), kota.class);
                startActivity(BackMjl);
            }
        });
        readmoremjl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MoreMjl = new Intent(getApplicationContext(), readmjl.class);
                startActivity(MoreMjl);
            }
        });
    }
}