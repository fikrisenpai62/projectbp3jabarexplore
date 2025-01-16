package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class readkeraton extends AppCompatActivity {
    Button btnbackkrtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readkeraton);
        btnbackkrtn = (Button) findViewById(R.id.btnbackkrtn);

        btnbackkrtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackReadKrtn = new Intent(getApplicationContext(), crbnwisata.class);
                startActivity(BackReadKrtn);
            }
        });
    }
}