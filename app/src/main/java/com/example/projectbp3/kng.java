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

public class kng extends AppCompatActivity {
    Button btnbackkng, readstorykng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kng);
        btnbackkng = (Button) findViewById(R.id.btnbackkng);
        readstorykng = (Button) findViewById(R.id.readstorykng);

        btnbackkng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackKng = new Intent(getApplicationContext(), kota.class);
                startActivity(BackKng);
            }
        });
        readstorykng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MoreKng = new Intent(getApplicationContext(), readkng.class);
                startActivity(MoreKng);
            }
        });
    }
}