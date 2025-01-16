package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class readpalutungan extends AppCompatActivity {
    Button btnbackpalutung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readpalutungan);
        btnbackpalutung = (Button) findViewById(R.id.btnbackpalutung);

        btnbackpalutung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackPalutung = new Intent(getApplicationContext(), kuningwisata.class);
                startActivity(BackPalutung);
            }
        });
    }
}