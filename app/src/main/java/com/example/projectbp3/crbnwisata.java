package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class crbnwisata extends AppCompatActivity {
    Button btnbackwisatacrbn, keraton, sunyaragi, waterland;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crbnwisata);
        btnbackwisatacrbn = (Button) findViewById(R.id.btnbackwisatacrbn);
        keraton = (Button) findViewById(R.id.keraton);
        sunyaragi = (Button) findViewById(R.id.sunyaragi);
        waterland = (Button) findViewById(R.id.waterland);

        btnbackwisatacrbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackWisataCrbn = new Intent(getApplicationContext(), wisata.class);
                startActivity(BackWisataCrbn);
            }
        });
        keraton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CrbnKeraton = new Intent(getApplicationContext(), readkeraton.class);
                startActivity(CrbnKeraton);
            }
        });
        sunyaragi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sunya = new Intent(getApplicationContext(), readsunyaragi.class);
                startActivity(sunya);
            }
        });
        waterland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent water = new Intent(getApplicationContext(), readwaterland.class);
                startActivity(water);
            }
        });
    }
}