package com.example.testeatual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ImageView imagem1;
    private final Timer timer = new Timer();
    TimerTask timerTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //splash de 4 segundos
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

        imagem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Tela1.class);
                startActivity(intent);

            }
        });
        timer.schedule(timerTask,4000);//splash de 4 segundos

    }
    //splash de 4 segundos
    private void gotoMainActivity() {
        Intent intent = new Intent(getApplicationContext(),Tela1.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void IniciarComponentes() {
        imagem1 = findViewById(R.id.imageView1);


    }
}