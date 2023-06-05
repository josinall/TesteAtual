package com.example.testeatual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela1 extends AppCompatActivity {
    public ImageView exercicio;
    public ImageView sobre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        IniciarComponentes();

        setTitle("");

        exercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercicios = new Intent(Tela1.this,Tela8.class);
                startActivity(exercicios);

            }
        });

        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercicios = new Intent(Tela1.this,Tela5.class);
                startActivity(exercicios);

            }
        });
    }
    private void IniciarComponentes() {

        exercicio = findViewById(R.id.botIniciar);
        sobre = findViewById(R.id.sobre2);
    }
}