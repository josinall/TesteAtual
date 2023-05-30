package com.example.testeatual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela7 extends AppCompatActivity {
    public ImageView menu7;
    //public ImageView proximo7;
    //public ImageView voltar7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela7);


        IniciarComponentes();
/*
        proximo7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximo6 = new Intent(Tela7.this,Tela8.class);
                startActivity(proximo6);

            }
        });

        voltar7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar6= new Intent(Tela7.this, Tela2.class);
                startActivity(voltar6);
            }
        });*/
        menu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu6 = new Intent(Tela7.this,Tela1.class);
                startActivity(menu6);

            }
        });

    }
    private void IniciarComponentes() {
        menu7 = findViewById(R.id.menu7);
        //proximo7 = findViewById(R.id.proximo6);
        //voltar7 = findViewById(R.id.voltar6);


    }
}