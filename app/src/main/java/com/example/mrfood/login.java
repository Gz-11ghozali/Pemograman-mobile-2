package com.example.mrfood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText phoneEditText, passwordEditText;
    private Button loginButton;
    private TextView registerTextView;

    // Kredensial untuk pengujian
    private final String TEST_PHONE = "08581234567";
    private final String TEST_PASSWORD = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        phoneEditText = findViewById(R.id.phoneEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        registerTextView = findViewById(R.id.registerTextView);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = phoneEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Cek kredensial
                if (phone.equals(TEST_PHONE) && password.equals(TEST_PASSWORD)) {
                    Toast.makeText(login.this, "Login berhasil!", Toast.LENGTH_SHORT).show();
                    // Lanjutkan ke MainActivity
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Tutup activity login
                } else {
                    Toast.makeText(login.this, "Nomor telepon atau kata sandi salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Arahkan ke RegisterActivity (atau activity lain yang sesuai)
        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, register.class); // Ganti dengan activity tujuan
                startActivity(intent);
            }
        });
    }
}
