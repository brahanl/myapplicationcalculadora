package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FactorialActivity extends AppCompatActivity {

    private EditText etNumero;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        etNumero = findViewById(R.id.etNumero);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void calcularFactorial(View view) {
        if (etNumero.getText().toString().isEmpty()) {
            tvResultado.setText("Por favor ingrese un número");
        } else {
            int n = Integer.parseInt(etNumero.getText().toString());
            int resultado = factorial(n);
            tvResultado.setText(String.valueOf(resultado));
        }
    }

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void volverPaginaPrincipal(View view) {
        finish();
    }
}