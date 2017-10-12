package com.jalalkun.resepmasakansederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button peceol_btn = (Button)findViewById(R.id.btnPecel);
        Button pepes_btn = (Button)findViewById(R.id.btnPepes);
        Button pindand_btn = (Button)findViewById(R.id.btnPindang);
        Button sate_jamur_btn = (Button)findViewById(R.id.btnSateJamur);

        peceol_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, PecelActivity.class);
                startActivity(intent);
            }
        });

        pepes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, PepesActivity.class);
                startActivity(intent);
            }
        });

        pindand_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, PindangActivity.class);
                startActivity(intent);
            }
        });

        sate_jamur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(DashboardActivity.this, SateActivity.class);
                startActivity(intent);
            }
        });
    }
}
