package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class kulinerkng extends AppCompatActivity {
    Button btnbackkulinerkng, btntahu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulinerkng);
        btnbackkulinerkng = (Button) findViewById(R.id.btnbackkulinerkng);
        btntahu = (Button) findViewById(R.id.btntahu);

        btnbackkulinerkng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackKulinerKng = new Intent(getApplicationContext(), kotakuliner.class);
                startActivity(BackKulinerKng);
            }
        });
        btntahu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BtnTah = new Intent(getApplicationContext(), tahukopeci.class);
                startActivity(BtnTah);
            }
        });
    }
}