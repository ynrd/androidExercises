package com.example.proyecto012;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Actividad2 extends AppCompatActivity {

    WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        web1 = (WebView) findViewById(R.id.web1);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        web1.getSettings().setJavaScriptEnabled(true);
        web1.setWebViewClient(new WebViewClient());
        web1.loadUrl("https://" + dato);
    }

    public void finalizar (View v){
        finish();
    }

}
