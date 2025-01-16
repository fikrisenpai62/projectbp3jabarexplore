package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class kota extends AppCompatActivity {
    Button btnbackkota, btnmjl, btnkng, btncrbn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kota);
        btnbackkota = (Button) findViewById(R.id.btnbackkota);
        btnmjl = (Button) findViewById(R.id.btnmjl);
        btnkng = (Button) findViewById(R.id.btnkng);
        btncrbn = (Button) findViewById(R.id.btncrbn);

        btnbackkota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackKota = new Intent(getApplicationContext(), home.class);
                startActivity(BackKota);
            }
        });
        btnmjl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KotaMjl = new Intent(getApplicationContext(), mjl.class);
                startActivity(KotaMjl);
            }
        });
        btnkng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KotaKng = new Intent(getApplicationContext(), kng.class);
                startActivity(KotaKng);
            }
        });
        btncrbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KotaCrbn = new Intent(getApplicationContext(), crbn.class);
                startActivity(KotaCrbn);
            }
        });
    }
}