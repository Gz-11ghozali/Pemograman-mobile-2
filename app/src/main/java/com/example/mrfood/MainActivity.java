package com.example.mrfood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tombol Sarapan untuk berpindah ke activity sarapan
        Button btnsarapan = findViewById(R.id.sarapan);
        btnsarapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sarapan.class);
                startActivity(intent);
            }
        });

        Button btnSate = findViewById(R.id.menusate); // Pastikan ID-nya sesuai dengan XML
        btnSate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan saat tombol ditekan
                Intent intent = new Intent(MainActivity.this, menusate.class);
                startActivity(intent);
            }
        });
    }
}
