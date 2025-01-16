package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class djenal extends AppCompatActivity {
    Button btnbackbuje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_djenal);
        btnbackbuje = (Button) findViewById(R.id.btnbackbuje);

        btnbackbuje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackBuje = new Intent(getApplicationContext(), kuliner.class);
                startActivity(BackBuje);
            }
        });
    }
}