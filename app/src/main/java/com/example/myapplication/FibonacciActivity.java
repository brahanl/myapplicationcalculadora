package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FibonacciActivity extends AppCompatActivity {

    private EditText etNumero;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);

        etNumero = findViewById(R.id.etNumero);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void calcularFibonacci(View view) {
        if (etNumero.getText().toString().isEmpty()) {
            tvResultado.setText("Por favor ingrese un número");
        } else {
            int n = Integer.parseInt(etNumero.getText().toString());
            int resultado = fibonacci(n);
            tvResultado.setText(String.valueOf(resultado));
        }
    }

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public void volverPaginaPrincipal(View view) {
        finish();
    }
}