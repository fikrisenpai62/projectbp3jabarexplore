package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class kuliner extends AppCompatActivity {
    Button btnbackkuliner, btnaki, btnemo, btndjenal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);
        btnbackkuliner = (Button) findViewById(R.id.btnbackkuliner);
        btnaki = (Button) findViewById(R.id.btnaki);
        btnemo = (Button) findViewById(R.id.btnemo);
        btndjenal = (Button) findViewById(R.id.btndjenal);

        btnbackkuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackKuliner = new Intent(getApplicationContext(), kotakuliner.class);
                startActivity(BackKuliner);
            }
        });
        btnaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KulinerAki = new Intent(getApplicationContext(), sawahaki.class);
                startActivity(KulinerAki);
            }
        });
        btnemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KulinerEmo = new Intent(getApplicationContext(), emo.class);
                startActivity(KulinerEmo);
            }
        });
        btndjenal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KulinerDjenal = new Intent(getApplicationContext(), djenal.class);
                startActivity(KulinerDjenal);
            }
        });
    }
}