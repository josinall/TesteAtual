package com.example.testeatual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela5 extends AppCompatActivity {
    public ImageView voltar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
        setTitle("");
        IniciarComponentes();

        voltar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela5 = new Intent(Tela5.this,Tela1.class);
                startActivity(tela5);

            }
        });
    }
    private void IniciarComponentes() {
        voltar5 = findViewById(R.id.voltar5);

    }
}