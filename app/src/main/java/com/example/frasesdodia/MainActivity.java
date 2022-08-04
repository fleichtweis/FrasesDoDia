package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "Frase 01",
            "Frase 02",
            "Frase 03",
            "Frase 04"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textFrase);
        int numAleatorio = new Random().nextInt(3);

        texto.setText(frases[numAleatorio]);
    }

    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.textFrase);

        String resultado = "";
        for (String frase : frases) {
            resultado = resultado + frase + "\n";
        }
        texto.setText(resultado);

    }

}