package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class crbn extends AppCompatActivity {
    Button btnbackcrbn, readmorecrbn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crbn);
        btnbackcrbn = (Button) findViewById(R.id.btnbackcrbn);
        readmorecrbn = (Button) findViewById(R.id.readmorecrbn);

        btnbackcrbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackCrbn = new Intent(getApplicationContext(), kota.class);
                startActivity(BackCrbn);
            }
        });
        readmorecrbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MoreCrbn = new Intent(getApplicationContext(), readcrbn.class);
                startActivity(MoreCrbn);
            }
        });
    }
}