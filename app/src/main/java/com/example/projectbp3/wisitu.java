package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class wisitu extends AppCompatActivity {
    Button btnbacksitu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisitu);
        btnbacksitu = (Button) findViewById(R.id.btnbacksitu);

        btnbacksitu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackSitu = new Intent(getApplicationContext(), mjlwisata.class);
                startActivity(BackSitu);
            }
        });
    }
}