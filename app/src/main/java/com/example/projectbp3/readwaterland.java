package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class readwaterland extends AppCompatActivity {
    Button btnbackwtr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readwaterland);
        btnbackwtr = (Button) findViewById(R.id.btnbackwtr);

        btnbackwtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackReadWtr = new Intent(getApplicationContext(), crbnwisata.class);
                startActivity(BackReadWtr);
            }
        });
    }
}