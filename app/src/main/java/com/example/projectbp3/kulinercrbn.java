package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class kulinercrbn extends AppCompatActivity {
    Button btnbackkulinercrbn, btnjamblang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulinercrbn);
        btnbackkulinercrbn = (Button) findViewById(R.id.btnbackkulinercrbn);
        btnjamblang = (Button) findViewById(R.id.btnjamblang);

        btnbackkulinercrbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackKulinerCCrb = new Intent(getApplicationContext(), kotakuliner.class);
                startActivity(BackKulinerCCrb);
            }
        });
        btnjamblang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BtnJam = new Intent(getApplicationContext(), nasijamblang.class);
                startActivity(BtnJam);
            }
        });
    }
}