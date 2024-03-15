package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirSumar(View view) {
        Intent intent = new Intent(this, SumarActivity.class);
        startActivity(intent);
    }

    public void abrirRestar(View view) {
        Intent intent = new Intent(this, RestarActivity.class);
        startActivity(intent);
    }

    public void abrirMultiplicar(View view) {
        Intent intent = new Intent(this, MultiplicarActivity.class);
        startActivity(intent);
    }

    public void abrirDividir(View view) {
        Intent intent = new Intent(this, DividirActivity.class);
        startActivity(intent);
    }

    public void abrirPotencia(View view) {
        Intent intent = new Intent(this, PotenciaActivity.class);
        startActivity(intent);
    }

    public void abrirFibonacci(View view) {
        Intent intent = new Intent(this, FibonacciActivity.class);
        startActivity(intent);
    }

    public void abrirFactorial(View view) {
        Intent intent = new Intent(this, FactorialActivity.class);
        startActivity(intent);
    }
}