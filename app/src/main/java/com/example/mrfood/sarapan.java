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
