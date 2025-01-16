package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class kuningwisata extends AppCompatActivity {
    Button btnbackwisatakng, darma, palutungan, tenjo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuningwisata);
        btnbackwisatakng = (Button) findViewById(R.id.btnbackwisatakng);
        darma = (Button) findViewById(R.id.darma);
        palutungan = (Button) findViewById(R.id.palutungan);
        tenjo = (Button) findViewById(R.id.tenjo);

        btnbackwisatakng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackWisataKng = new Intent(getApplicationContext(), wisata.class);
                startActivity(BackWisataKng);
            }
        });
        darma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Darma = new Intent(getApplicationContext(), readdarma.class);
                startActivity(Darma);
            }
        });
        palutungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Palutu = new Intent(getApplicationContext(), readpalutungan.class);
                startActivity(Palutu);
            }
        });
        tenjo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tenjo = new Intent(getApplicationContext(), readtenjo.class);
                startActivity(Tenjo);
            }
        });
    }
}