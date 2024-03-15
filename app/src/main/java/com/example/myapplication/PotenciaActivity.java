package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PotenciaActivity extends AppCompatActivity {

    private EditText etBase;
    private EditText etExponente;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        etBase = findViewById(R.id.etBase);
        etExponente = findViewById(R.id.etExponente);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void calcularPotencia(View view) {
        String strBase = etBase.getText().toString();
        String strExponente = etExponente.getText().toString();

        if (strBase.isEmpty() || strExponente.isEmpty()) {
            tvResultado.setText("Por favor ingrese ambos números");
            return;
        }

        double base = Double.parseDouble(strBase);
        double exponente = Double.parseDouble(strExponente);
        double resultado = Math.pow(base, exponente);

        tvResultado.setText(String.valueOf(resultado));
    }

    public void volverPaginaPrincipal(View view) {
        finish();
    }
}