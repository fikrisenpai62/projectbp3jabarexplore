package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class wisata extends AppCompatActivity {
    Button btnbackwisata, btnwisatamjl, btnwisatakng, btnwisatacrbn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        btnbackwisata = (Button) findViewById(R.id.btnbackwisata);
        btnwisatamjl = (Button) findViewById(R.id.btnwisatamjl);
        btnwisatakng = (Button) findViewById(R.id.btnwisatakng);
        btnwisatacrbn = (Button) findViewById(R.id.btnwisatacrbn);

        btnbackwisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackWisata = new Intent(getApplicationContext(), home.class);
                startActivity(BackWisata);
            }
        });
        btnwisatamjl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KotaMjlWisata = new Intent(getApplicationContext(), mjlwisata.class);
                startActivity(KotaMjlWisata);
            }
        });
        btnwisatakng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KotaKngWisata = new Intent(getApplicationContext(), kuningwisata.class);
                startActivity(KotaKngWisata);
            }
        });
        btnwisatacrbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KotaCrbnWisata = new Intent(getApplicationContext(), crbnwisata.class);
                startActivity(KotaCrbnWisata);
            }
        });
    }
}