package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicarActivity extends AppCompatActivity {

    private EditText etValor1;
    private EditText etValor2;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);

        etValor1 = findViewById(R.id.etValor1);
        etValor2 = findViewById(R.id.etValor2);
        tvResultado = findViewById(R.id.tvResultado);
    }

    public void multiplicar(View view) {
        if (etValor1.getText().toString().isEmpty() || etValor2.getText().toString().isEmpty()) {
            tvResultado.setText("Por favor ingrese ambos valores");
        } else {
            int valor1 = Integer.parseInt(etValor1.getText().toString());
            int valor2 = Integer.parseInt(etValor2.getText().toString());
            int resultado = valor1 * valor2;
            tvResultado.setText(String.valueOf(resultado));
        }
    }

    public void volverPaginaPrincipal(View view) {
        finish();
    }
}