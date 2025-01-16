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

public class home extends AppCompatActivity {
    Button btnKota, btnWisata, btnKuliner, btnTentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnKota = (Button) findViewById(R.id.btnKota);
        btnWisata = (Button) findViewById(R.id.btnWisata);
        btnKuliner = (Button) findViewById(R.id.btnKuliner);
        btnTentang = (Button) findViewById(R.id.btnTentang);

        btnKota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Kota = new Intent(getApplicationContext(), kota.class);
                startActivity(Kota);
            }
        });
        btnWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Wisata = new Intent(getApplicationContext(), wisata.class);
                startActivity(Wisata);
            }
        });
        btnKuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Kuliner = new Intent(getApplicationContext(), kotakuliner.class);
                startActivity(Kuliner);
            }
        });
        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tentang = new Intent(getApplicationContext(), tentang.class);
                startActivity(Tentang);
            }
        });
    }
}