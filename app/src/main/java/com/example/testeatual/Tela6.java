package com.example.testeatual;

import static com.example.testeatual.R.id.*;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela6 extends AppCompatActivity {
    public ImageView menu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);
        setTitle("");
        IniciarComponentes();

        menu6.setOnClickListener(v -> {
            Intent tela6 = new Intent(Tela6.this,Tela1.class);
            startActivity(tela6);
        });
    }

    private void IniciarComponentes() {
        menu6 = findViewById(R.id.menu6);

    }
}