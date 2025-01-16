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

public class emo extends AppCompatActivity {
    Button btnbackemo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emo);
        btnbackemo = (Button) findViewById(R.id.btnbackemo);

        btnbackemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackEmo = new Intent(getApplicationContext(), kuliner.class);
                startActivity(BackEmo);
            }
        });
    }
}