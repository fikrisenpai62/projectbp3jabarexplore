package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class readcrbn extends AppCompatActivity {
    Button btnbackreadcrbn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readcrbn);
        btnbackreadcrbn = (Button) findViewById(R.id.btnbackreadcrbn);

        btnbackreadcrbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackReadCrbn = new Intent(getApplicationContext(), crbn.class);
                startActivity(BackReadCrbn);
            }
        });
    }
}