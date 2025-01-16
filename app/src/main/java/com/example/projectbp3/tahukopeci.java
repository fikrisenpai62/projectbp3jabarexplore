package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class tahukopeci extends AppCompatActivity {
    Button btnbacktahu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahukopeci);
        btnbacktahu = (Button) findViewById(R.id.btnbacktahu);

        btnbacktahu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackTahu = new Intent(getApplicationContext(), kulinerkng.class);
                startActivity(BackTahu);
            }
        });
    }
}