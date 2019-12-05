package com.example.proyecto015;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2;
    private EditText et1;
    private int num;
    private int puntos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
    }

    public void comprueba(View v) {
        et1 = findViewById(R.id.et1);
        num = (int) Math.floor((Math.random() * 3));
        String valorIntroducido = et1.getText().toString();
        int valor = Integer.parseInt(valorIntroducido);
        if (valor == num) {
            puntos++;
            Toast.makeText(this, "¡Felicidades! Has acertado, tienes " + puntos + " puntos", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Ohh! Sigue intentando" + valor + " " + num, Toast.LENGTH_LONG).show();
        }
        String puntosText = "Puntos: " + puntos;
        tv1.setText(puntosText);
    }
}
