package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class readkng extends AppCompatActivity {
    Button btnbackreadkng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readkng);
        btnbackreadkng = (Button) findViewById(R.id.btnbackreadkng);

        btnbackreadkng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackReadKng = new Intent(getApplicationContext(), kng.class);
                startActivity(BackReadKng);
            }
        });
    }
}