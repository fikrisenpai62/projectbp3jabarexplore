package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class readdarma extends AppCompatActivity {
    Button btnbackdarma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readdarma);
        btnbackdarma = (Button) findViewById(R.id.btnbackdarma);

        btnbackdarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackDarma = new Intent(getApplicationContext(), kuningwisata.class);
                startActivity(BackDarma);
            }
        });
    }
}