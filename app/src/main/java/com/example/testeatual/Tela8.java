package com.example.testeatual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Tela8 extends AppCompatActivity {
    private ImageView imagem2;
    private final Timer timer = new Timer();
    TimerTask timerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela8);

        timerTask =new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        gotoMainActivity();
                    }
                });

            }
        };
        setTitle(" --- Toque na figura para começar ---");
        IniciarComponentes();

        imagem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela8.this,Tela2.class);
                startActivity(intent);

            }
        });
        timer.schedule(timerTask,14000);//splash de 4 segundos




    }
    private void gotoMainActivity() {
        Intent intent = new Intent(getApplicationContext(),Tela2.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void IniciarComponentes() {
        imagem2 = findViewById(R.id.dicas_01);


    }
}