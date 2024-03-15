package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class RestarActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restar);

        valor1 = findViewById(R.id.etValor1);
        valor2 = findViewById(R.id.etValor2);
        resultado = findViewById(R.id.tvResultado);
    }

    public void restar(View view) {
        if (valor1.getText().toString().isEmpty() || valor2.getText().toString().isEmpty()) {
            resultado.setText("Por favor ingresa valores en ambas casillas.");
        } else {
            int resta = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
            resultado.setText(String.valueOf(resta));
        }
    }

    public void goBack(View view) {

        finish();
    }
}