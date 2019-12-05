package com.example.proyecto005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private Spinner spinner;
    private TextView tv1;


    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);
        spinner = (Spinner) findViewById(R.id.spinner);

        String[] opciones = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);
    }

    public void operar(View View) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String opcion = spinner.getSelectedItem().toString();

        if (opcion.equals("sumar")) {
            int suma = nro1 + nro2;
            String result = String.valueOf(suma);
            tv1.setText(result);
        } else if (opcion.equals("restar")) {
            int resta = nro1 + nro2;
            String result = String.valueOf(resta);
            tv1.setText(result);
        } else if (opcion.equals("multiplicar")) {
            int x = nro2 * nro1;
            String result = String.valueOf(x);
            tv1.setText(result);
        } else if (opcion.equals("dividir")) {
            int div = nro1 / nro2;
            String result = String.valueOf(div);
            tv1.setText(result);
        }
    }


}
