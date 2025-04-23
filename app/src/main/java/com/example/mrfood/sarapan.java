package com.example.mrfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class sarapan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarapan);
    }

    // Nasi Goreng
    public void goToNasiGoreng(View view) {
        Intent intent = new Intent(this, nasigoreng.class);
        startActivity(intent);
    }

    // Telur Mata Sapi
    public void goToTelurMataSapi(View view) {
        Intent intent = new Intent(this, telurmatasapi.class);
        startActivity(intent);
    }

    // Oatmeal
    public void goToOatmeal(View view) {
        Intent intent = new Intent(this, oatmeal.class);
        startActivity(intent);
    }

    // Bubur Ayam
    public void goToBuburAyam(View view) {
        Intent intent = new Intent(this, buburayam.class);
        startActivity(intent);
    }

    // Roti Panggang
    public void goToRotiPanggang(View view) {
        Intent intent = new Intent(this, rotipanggang.class);
        startActivity(intent);
    }

    // Lontong Sayur
    public void goToLontongSayur(View view) {
        Intent intent = new Intent(this, lontongsayur.class);
        startActivity(intent);
    }
}
