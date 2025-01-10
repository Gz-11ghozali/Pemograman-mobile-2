package com.example.mrfood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tombol Sarapan untuk berpindah ke activity sarapan
        Button btnSarapan = findViewById(R.id.sarapan);
        btnSarapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sarapan.class);
                startActivity(intent);
            }
        });

        // Tombol Menu Sate untuk berpindah ke activity menusate
        Button btnSate = findViewById(R.id.Menusate);
        btnSate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, menusate.class);
                startActivity(intent);
            }
        });

        // Layout Makanan Sayuran untuk berpindah ke activity sayuran
        LinearLayout layoutSayuran = findViewById(R.id.layout_sayuran);
        layoutSayuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sayuran.class);
                startActivity(intent);
            }
        });

        // Ikon Profil untuk berpindah ke activity profile
        ImageView profileIcon = findViewById(R.id.profileIcon);
        profileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, akun.class);
                startActivity(intent);
            }
        });

        // Tombol atau Layout Telur Dadar
        LinearLayout layoutTelurDadar = findViewById(R.id.layouttelurdadar);
        layoutTelurDadar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, telordadar.class);
                startActivity(intent);
            }
        });
    }
}
