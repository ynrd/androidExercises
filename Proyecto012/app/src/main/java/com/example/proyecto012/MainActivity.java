package com.example.proyecto012;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
    }

    public void ver (View v){
        Intent ver = new Intent(this, Actividad2.class);
        ver.putExtra("direccion",et1.getText().toString());
        startActivity(ver);
    }
}
