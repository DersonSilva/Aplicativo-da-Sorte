package com.example.numerodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private Button buttonApostar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        buttonApostar = findViewById(R.id.buttonApostar);

        buttonApostar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int numerosSorteados = new Random().nextInt(5);

                textResultado.setText("O número sorteado é: " + numerosSorteados);





            }
        });
    }
}