package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class readsunyaragi extends AppCompatActivity {
    Button btnbacksuny;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readsunyaragi);
        btnbacksuny = (Button) findViewById(R.id.btnbacksuny);

        btnbacksuny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackReadSuny = new Intent(getApplicationContext(), crbnwisata.class);
                startActivity(BackReadSuny);
            }
        });
    }
}