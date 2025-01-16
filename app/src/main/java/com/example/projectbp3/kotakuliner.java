package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class kotakuliner extends AppCompatActivity {
    Button btnbackmjlkuliner, btnmjlkuliner, btnkng, btncrbn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotakuliner);
        btnbackmjlkuliner = (Button) findViewById(R.id.btnbackmjlkuliner);
        btnmjlkuliner = (Button) findViewById(R.id.btnmjlkuliner);
        btnkng = (Button) findViewById(R.id.btnkng);
        btncrbn = (Button) findViewById(R.id.btncrbn);

        btnbackmjlkuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackMjlKuli = new Intent(getApplicationContext(), home.class);
                startActivity(BackMjlKuli);
            }
        });
            btnmjlkuliner.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent MjlKulin = new Intent(getApplicationContext(), kuliner.class);
                    startActivity(MjlKulin);
                }
            });
        btnkng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent KngKulin = new Intent(getApplicationContext(), kulinerkng.class);
                startActivity(KngKulin);
            }
        });
        btncrbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CrbnKulin = new Intent(getApplicationContext(), kulinercrbn.class);
                startActivity(CrbnKulin);
            }
        });
        }
}
