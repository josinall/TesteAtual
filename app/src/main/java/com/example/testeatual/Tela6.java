package com.example.testeatual;

import static com.example.testeatual.R.id.*;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela6 extends AppCompatActivity {
    public ImageView menu6;
    public ImageView proximo6;
    public ImageView voltar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);


        IniciarComponentes();

        proximo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximo6 = new Intent(Tela6.this,Tela7.class);
                startActivity(proximo6);

            }
        });

        voltar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar6= new Intent(Tela6.this, Tela2.class);
                startActivity(voltar6);
            }
        });
        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu6 = new Intent(Tela6.this,Tela1.class);
                startActivity(menu6);

            }
        });


    }

    private void IniciarComponentes() {
        menu6 = findViewById(R.id.menu6);
        proximo6 = findViewById(R.id.proximo6);
        voltar6 = findViewById(R.id.voltar6);
        //botDica6 = findViewById(R.id.botDica);

    }
}