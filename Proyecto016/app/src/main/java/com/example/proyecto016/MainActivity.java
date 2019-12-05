package com.example.proyecto016;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        String [] archivos = fileList();

        if (existe(archivos, "notas.txt")) {
            try {
                InputStreamReader archivo = new InputStreamReader(
                        openFileInput("notas.txt"));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String todo = "";
                while (linea != null) {
                    todo = todo + linea + "\n";
                    linea = br.readLine();
                }
                br.close();
                archivo.close();
                et1.setText(todo);
            } catch (IOException e) {

            }
            }
        }



    private boolean existe (String[] archivos, String buscaArch) {
        for (int i = 0; i < archivos.length; i++) {
            if (buscaArch.equals(archivos[i])) {
                return true;
            }
            return false;
        }

    public void grabar (View v){
            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput
                        ("notas.txt", Activity.MODE_PRIVATE));
                archivo.write(et1.getText().toString());
                archivo.flush();
                archivo.close();
            } catch (IOException e) {
            }
            Toast t = Toast.makeText(this, "Los datos fueron grabados", Toast.LENGTH_LONG);
            t.show();
            finish();
        }
}
