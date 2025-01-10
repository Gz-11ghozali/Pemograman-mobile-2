package com.example.mrfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class sarapan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarapan);

        // Handle click for Telur Matasapi
        LinearLayout telurmatasapi = findViewById(R.id.layoutTelurMatasapi);
        telurmatasapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarapan.this, telurmatasapi.class);
                startActivity(intent);
            }
        });

        // Handle click for Oatmeal
        LinearLayout oatmeal = findViewById(R.id.layoutOatmeal);
        oatmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarapan.this, oatmeal.class);
                startActivity(intent);
            }
        });

        // Handle click for Bubur Ayam
        LinearLayout buburayam = findViewById(R.id.layoutBuburAyam);
        buburayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarapan.this, buburayam.class);
                startActivity(intent);
            }
        });

        // Handle click for Roti Panggang
        LinearLayout rotipanggang = findViewById(R.id.layoutRotiPanggang);
        rotipanggang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarapan.this, rotipanggang.class);
                startActivity(intent);
            }
        });

        // Handle click for Lontong Sayur
        LinearLayout lontongsayur = findViewById(R.id.layoutLontongSayur);
        lontongsayur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarapan.this, lontongsayur.class);
                startActivity(intent);
            }
        });

        // Handle click for Nasi Goreng
        LinearLayout nasigoreng = findViewById(R.id.layoutNasiGoreng);
        nasigoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarapan.this, nasigoreng.class);
                startActivity(intent);
            }
        });
    }
}
