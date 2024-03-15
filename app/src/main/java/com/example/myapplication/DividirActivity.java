package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DividirActivity extends AppCompatActivity {

    private EditText etDividendo;
    private EditText etDivisor;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dividir);

        etDividendo = findViewById(R.id.etDividendo);
        etDivisor = findViewById(R.id.etDivisor);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void calcularDivision(View view) {
        String strDividendo = etDividendo.getText().toString();
        String strDivisor = etDivisor.getText().toString();

        if (strDividendo.isEmpty() || strDivisor.isEmpty()) {
            tvResultado.setText("Por favor ingrese ambos números");
            return;
        }

        double dividendo = Double.parseDouble(strDividendo);
        double divisor = Double.parseDouble(strDivisor);

        if (divisor == 0) {
            tvResultado.setText("Error: División por cero");
        } else {
            double resultado = dividendo / divisor;
            tvResultado.setText(String.valueOf(resultado));
        }
    }

    public void volverPaginaPrincipal(View view) {
        finish();
    }
}