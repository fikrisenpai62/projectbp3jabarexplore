package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class mjlwisata extends AppCompatActivity {
    Button btnbackwisatamjl, panyaweuan, situ, ibun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mjlwisata);
        btnbackwisatamjl = (Button) findViewById(R.id.btnbackwisatamjl);
        panyaweuan = (Button) findViewById(R.id.panyaweuan);
        situ = (Button) findViewById(R.id.situ);
        ibun = (Button) findViewById(R.id.ibun);

        btnbackwisatamjl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackWisataMjl = new Intent(getApplicationContext(), wisata.class);
                startActivity(BackWisataMjl);
            }
        });
        panyaweuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MjlPanyaweuan = new Intent(getApplicationContext(), wipanyaweuan.class);
                startActivity(MjlPanyaweuan);
            }
        });
        situ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MjlSitu = new Intent(getApplicationContext(), wisitu.class);
                startActivity(MjlSitu);
            }
        });
        ibun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MjlIbun = new Intent(getApplicationContext(), wiibun.class);
                startActivity(MjlIbun);
            }
        });
    }
}