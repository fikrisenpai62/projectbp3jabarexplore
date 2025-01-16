package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class wiibun extends AppCompatActivity {
    Button btnbackibun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiibun);
        btnbackibun = (Button) findViewById(R.id.btnbackibun);

        btnbackibun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackIbun = new Intent(getApplicationContext(), mjlwisata.class);
                startActivity(BackIbun);
            }
        });
    }
}