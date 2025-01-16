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

public class nasijamblang extends AppCompatActivity {
    Button btnbackjamblang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasijamblang);
        btnbackjamblang = (Button) findViewById(R.id.btnbackjamblang);

        btnbackjamblang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackJamblang = new Intent(getApplicationContext(), kulinercrbn.class);
                startActivity(BackJamblang);
            }
        });
    }
}