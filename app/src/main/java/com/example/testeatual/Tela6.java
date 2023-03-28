package com.example.testeatual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela6 extends AppCompatActivity {
    public ImageView voltar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);
        IniciarComponentes();

        voltar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela6 = new Intent(Tela6.this,Tela2.class);
                startActivity(tela6);

            }
        });
    }
    private void IniciarComponentes() {
        voltar6 = findViewById(R.id.voltar6);

    }
}