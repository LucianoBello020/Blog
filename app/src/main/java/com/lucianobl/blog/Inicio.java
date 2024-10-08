package com.lucianobl.blog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Botón "Sobre Mi"

        Button btnSobreMi = findViewById(R.id.btn_ISobremi);
        btnSobreMi.setOnClickListener(v -> {
            Intent intent = new Intent(Inicio.this, SobreMi.class);
            startActivity(intent);
        });

        // Botón "Contacto"

        Button btnContacto = findViewById(R.id.btn_IContacto);
        btnContacto.setOnClickListener(v -> {
            Intent intent = new Intent(Inicio.this, Contacto.class);
            startActivity(intent);
        });
    }
}
