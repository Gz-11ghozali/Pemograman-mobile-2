package com.example.mrfood;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menusate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusate);
    }

    // Metode untuk berpindah ke halaman Sate Odeng
    public void goToSateodeng(View view) {
        Intent intent = new Intent(menusate.this, sateodeng.class);
        startActivity(intent);
    }

    // Metode untuk berpindah ke halaman Sate Taichan
    public void goToSatetaichan(View view) {
        Intent intent = new Intent(menusate.this, satetaichan.class);
        startActivity(intent);
    }
}
