package com.example.projectbp3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class reg extends AppCompatActivity {
    Button btnbackreg, btnRegisterConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        btnbackreg = (Button) findViewById(R.id.btnbackreg);
        btnRegisterConfirm = (Button) findViewById(R.id.btnRegisterConfirm);

        btnbackreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BackReg = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(BackReg);
            }
        });
        btnRegisterConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisConfirm = new Intent(getApplicationContext(), log.class);
                startActivity(RegisConfirm);
            }
        });
    }
}