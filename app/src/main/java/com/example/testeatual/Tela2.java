package com.example.testeatual;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Tela2 extends AppCompatActivity {
    public ImageView botAjuda1;
    public ImageView proximo;
    public ImageView voltar;
    //public ImageView menu;


    TextView va1;TextView va2;TextView va3;TextView va4;TextView va5;
    EditText digA1;EditText digA2;EditText digA3;EditText digA4;EditText digA5;
    EditText digB1;EditText digB2;EditText digB3;EditText digB4;EditText digB5;
    EditText digC1;EditText digC2;EditText digC3;EditText digC4;EditText digC5;

    Button botConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        setTitle("                 boa sorte!...");



        va1 = findViewById(R.id.linha1);  // instancio
        va2 = findViewById(R.id.linha2);
        va3 = findViewById(R.id.linha3);
        va4 = findViewById(R.id.linha4);
        va5 = findViewById(R.id.linha5);
        digA1 = findViewById(R.id.cxA1);digA2 = findViewById(R.id.cxA2);digA3 = findViewById(R.id.cxA3);
        digA4 = findViewById(R.id.cxA4);digA5 = findViewById(R.id.cxA5);
        digB1 = findViewById(R.id.cxB1);digB2 = findViewById(R.id.cxB2);digB3 = findViewById(R.id.cxB3);
        digB4 = findViewById(R.id.cxB4);digB5 = findViewById(R.id.cxB5);
        digC1 = findViewById(R.id.cxC1);digC2 = findViewById(R.id.cxC2);digC3 = findViewById(R.id.cxC3);
        digC4 = findViewById(R.id.cxC4);digC5 = findViewById(R.id.cxC5);

        botConfirmar = findViewById(R.id.botConfirmar);

        botConfirmar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"ResourceType", "SetTextI18n"})
            @Override
            public void onClick(View view) {

                String x1 = digA1.getText().toString();  //transforma em inteiro
                String j1 = "3";
                
                //       caixa A1
                if(!x1.equals(j1)) {
                    digA1.setText("");  //apaga
                    digB1.setText("");
                    digC1.setText("");
                    digA1.requestFocus(); // cursor
                    Toast.makeText(getBaseContext(), "Tente novamente",Toast.LENGTH_LONG).show();

                }else{
                    //digB2.requestFocus();
                    digB1.setText("-");
                    digC1.setText("-");
                    va2.setText(">> B =  3 ** 3");
                    Toast.makeText(getBaseContext(), "Você Acertou1",Toast.LENGTH_LONG).show();

                }
                digB2.requestFocus();

                //       caixa B2
                String x2 = digB2.getText().toString();  //transforma em inteiro
                String b2 = "27";

                if(!x2.equals(b2)) {
                    digA2.setText("");
                    digB2.setText("");
                    digC2.setText("");
                    //digB2.requestFocus();

                }else{
                    //Toast.makeText(getBaseContext(), "Você Acertou2",Toast.LENGTH_LONG).show();
                    digC3.requestFocus();
                    digA2.setText("3");
                    digC2.setText("-");
                    va3.setText(">> C =  B/A+1");

                }
                //       caixa C3
                String x3 = digC3.getText().toString();  //transforma em inteiro
                String b3 = "10";

                if(!x3.equals(b3)) {
                    //Toast.makeText(getBaseContext(), "Tente Outra Vez3",Toast.LENGTH_LONG).show();
                    digA3.setText("");
                    digB3.setText("");
                    digC3.setText("");
                    //digC3.requestFocus();


                }else{
                    Toast.makeText(getBaseContext(), "Você Acertou3",Toast.LENGTH_LONG).show();
                    digA4.requestFocus();
                    digA3.setText("3");
                    digB3.setText("27");
                    va4.setText(">> A =  A - 2");

                }
                //       caixa A4
                String x4 = digA4.getText().toString();  //transforma em inteiro
                String b4 = "1";

                if(!x4.equals(b4)) {
                    //Toast.makeText(getBaseContext(), "Tente Outra Vez4",Toast.LENGTH_LONG).show();
                    //digA4.requestFocus();
                    digA4.setText("");
                    digB4.setText("");
                    digC4.setText("");


                }else{
                    Toast.makeText(getBaseContext(), "Você Acertou4",Toast.LENGTH_LONG).show();
                    digC5.requestFocus();
                    digB4.setText("27");
                    digC4.setText("10");
                    va5.setText(">> C =  B - C");

                }
                //       caixa c5
                String x5 = digC5.getText().toString();  //transforma em inteiro
                String b5 = "17";

                if(!x5.equals(b5)) {
                    //Toast.makeText(getBaseContext(), "Tente Outra Vez5",Toast.LENGTH_LONG).show();
                    //digC5.requestFocus();
                    digA5.setText("");
                    digB5.setText("");
                    digC5.setText("");


                }else{
                    digA5.setText("1");
                    digB5.setText("27");


                }


            }



        });
        IniciarComponentes();

        //----------------------proximo-----------------------------------------------
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximo = new Intent(Tela2.this,Tela3.class);
                startActivity(proximo);

            }
        });
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Tela2.this,Tela1.class);
                startActivity(intent4);

            }
        });
        botAjuda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Tela2.this,Tela6.class);
                startActivity(intent5);

            }
        });
        /*menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //ação para proxima tela
                Intent menu = new Intent(getApplicationContext(),Tela1.class);
                startActivity(menu);

            }
        });
        */


    }
    private void IniciarComponentes() {

        proximo = findViewById(R.id.proximo);
        voltar = findViewById(R.id.voltar);
        botAjuda1 = findViewById(R.id.botAjuda);
        //menu = findViewById(R.id.menu1);
        botConfirmar = findViewById(R.id.botConfirmar);
    }

}