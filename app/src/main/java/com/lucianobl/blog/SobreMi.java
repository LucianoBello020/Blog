package com.lucianobl.blog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SobreMi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sobre_mi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Botón "Contacto"

        Button btnSobreMi = findViewById(R.id.btn_SContacto);
        btnSobreMi.setOnClickListener(v -> {
            Intent intent = new Intent(SobreMi.this, Contacto.class);
            startActivity(intent);
        });

        // Botón "Inicio"

        Button btnContacto = findViewById(R.id.btn_Sinicio);
        btnContacto.setOnClickListener(v -> {
            Intent intent = new Intent(SobreMi.this, Inicio.class);
            startActivity(intent);
        });
    }
}