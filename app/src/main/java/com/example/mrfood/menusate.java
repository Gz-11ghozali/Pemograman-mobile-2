package com.example.mrfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class menusate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusate);
    }

    // Sate Odeng
    public void goToSateodeng(View view) {
        Intent intent = new Intent(this, sateodeng.class);
        startActivity(intent);
    }

    // Sate Taichan
    public void goToSatetaichan(View view) {
        Intent intent = new Intent(this, satetaichan.class);
        startActivity(intent);
    }

    // Rendang Sapi
    public void goToRendangSapi(View view) {
        Intent intent = new Intent(this, rendang.class);
        startActivity(intent);
    }

    // Opor Ayam
    public void goToOporAyam(View view) {
        Intent intent = new Intent(this, oporayam.class);
        startActivity(intent);
    }

    // Pasta Carbonara
    public void goToPastaCarbonara(View view) {
        Intent intent = new Intent(this, pastacarbonara.class);
        startActivity(intent);
    }

    // Ayam Bakakak
    public void goToBakakak(View view) {
        Intent intent = new Intent(this, ayambakakak.class);
        startActivity(intent);
    }
}
