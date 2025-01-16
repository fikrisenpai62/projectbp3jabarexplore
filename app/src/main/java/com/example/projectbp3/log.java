package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class log extends AppCompatActivity {
    Button btnbacklog, btnLoginConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        btnbacklog = (Button) findViewById(R.id.btnbacklog);
        btnLoginConfirm = (Button) findViewById(R.id.btnLoginConfirm);

        btnbacklog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackLog = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(BackLog);
            }
        });
        btnLoginConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home = new Intent(getApplicationContext(), home.class);
                startActivity(Home);
            }
        });
    }
}