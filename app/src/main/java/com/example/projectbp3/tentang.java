package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class tentang extends AppCompatActivity {
    Button backtentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        backtentang = (Button) findViewById(R.id.backtentang);

        backtentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackTentang = new Intent(getApplicationContext(), home.class);
                startActivity(BackTentang);
            }
        });
    }
}