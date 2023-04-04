package com.example.testeatual;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela3 extends AppCompatActivity {
    public ImageView botAjuda3;
    public ImageView proximo3;
    public ImageView voltar3;
    public ImageView menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        setTitle("          Sua Ajuda Aqui!");
        IniciarComponentes();
        voltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela3= new Intent(Tela3.this, Tela2.class);
                startActivity(tela3);
            }
        });
        botAjuda3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajuda3 = new Intent(Tela3.this,Tela6.class);
                startActivity(ajuda3);

            }
        });

    }
    private void IniciarComponentes () {
        proximo3 = findViewById(R.id.proximo);
        voltar3 = findViewById(R.id.voltar);
        botAjuda3 = findViewById(R.id.botAjuda);
        //menu3 = findViewById(R.id.menu3);
    }
}


