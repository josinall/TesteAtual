package com.example.testeatual;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Tela3 extends AppCompatActivity {
    public ImageView botDica3;
    public ImageView proximo3;
    public ImageView voltar3;
    //public ImageView menu3;

    Tabela linha0;
    TextView va1;TextView va2;TextView va3;TextView va4;TextView va5;
    EditText digA1;EditText digA2;EditText digA3;EditText digA4;EditText digA5;
    EditText digB1;EditText digB2;EditText digB3;EditText digB4;EditText digB5;
    EditText digC1;EditText digC2;EditText digC3;EditText digC4;EditText digC5;

    Button botConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        setTitle("");
        //Toast t1 = Toast.makeText(getBaseContext(), "Você Acertou",Toast.LENGTH_LONG);
        //Toast t2 = Toast.makeText(getBaseContext(), "tente novamente outro número",Toast.LENGTH_LONG);
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

                //transforma em inteiro
                String A1 = digA1.getText().toString();
                String A2 = digA2.getText().toString();
                String A3 = digA3.getText().toString();
                String A4 = digA4.getText().toString();
                String A5 = digA5.getText().toString();

                String B1 = digB1.getText().toString();
                String B2 = digB2.getText().toString();
                String B3 = digB3.getText().toString();
                String B4 = digB4.getText().toString();
                String B5 = digB5.getText().toString();

                String C1 = digC1.getText().toString();
                String C2 = digC2.getText().toString();
                String C3 = digC3.getText().toString();
                String C4 = digC4.getText().toString();
                String C5 = digC5.getText().toString();

                ArrayList<Colunas> linha = new ArrayList<Colunas>();
                int[] numerosLidos1 = new int[5];
                int[] numerosLidos2 = new int[5];


                Colunas linha0 = new Colunas("-", "-", "49");
                Colunas linha1 = new Colunas("7", "-", "49");
                Colunas linha2 = new Colunas("7", "4", "49");
                Colunas linha3 = new Colunas("7", "4", "9");
                Colunas linha4 = new Colunas("64", "4", "9");

                linha.add(linha0);
                linha.add(linha1);
                linha.add(linha2);
                linha.add(linha3);
                linha.add(linha4);

                //--------------------------LINHA 1 C1----------------------------------

                if (!C1.equalsIgnoreCase(linha.get(0).getC())) {
                    digA1.setText("-");
                    digB1.setText("-");
                    digC1.setText("");
                    digC1.setError(" preencha o campo");
                    numerosLidos1[0] = 1;

                } else {
                    digA1.setText("-");
                    digB1.setText("-");
                    digC1.setText("49");
                    va1.setText(">> C =  49");
                    digC2.requestFocus();
                    numerosLidos1[0] = 5;
                }
                ///----------------------LINHA 2 C2--------------------------------------
                if (!C2.equalsIgnoreCase(linha.get(1).getC())) {
                    if (C1.isEmpty()) {//SE C1 TIVER VAZIO

                        digC1.requestFocus();//cursor C1
                    }
                    if(C2.isEmpty()){
                        digC2.setError(" preencha o campo");
                    } else {
                        digC2.setText("");
                        numerosLidos1[0] = 2;
                    }
                } else {
                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }
                    digA2.requestFocus();
                    numerosLidos1[0] = 10;

                }
                //--------------------------LINHA 2 A2------------------------------------
                if (!A2.equalsIgnoreCase(linha.get(1).getA())) {//se for falso
                    if(C1.isEmpty()){
                        digC1.setError(" preencha ");
                        digC1.requestFocus();//cursor

                    }if (A2.isEmpty()){
                        digA2.setError(" preencha o campo");
                        //
                    }else{
                        digA2.setText("");  //se errar numero ficar vazio
                        numerosLidos1[0] = 3;
                    }
                    digA2.setText("");
                    digB2.setText("-");


                } else {//linha 2
                   /* if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }*/
                    if (C2.equalsIgnoreCase(linha.get(1).getC())//se as duas forem certas
                            && A2.equalsIgnoreCase(linha.get(1).getA())) {
                        digC3.requestFocus();
                        digB2.setText("-");
                        va2.setText(">> A =(C-7)/6");
                        numerosLidos1[0] = 15;

                    }
                }//------------------------LINHA 3 C3 --------------------------------------
                if (!C3.equalsIgnoreCase(linha.get(2).getC())) {
                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }
                    if (C3.isEmpty()){
                        digC3.setError(" preencha o campo");
                        //
                    }else{
                        digC3.setText("");  //se errar numero ficar vazio
                        numerosLidos1[0] = 4;
                    }
                    digC3.setText("");  //apaga
                } else {
                  /*  if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }*/
                    numerosLidos1[0] = 20;
                    digB3.requestFocus();
                }
                //-------------------------LINHA 3 B3 --------------------------------------
                if (!B3.equalsIgnoreCase(linha.get(2).getB())) {
                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }if (B3.isEmpty()){
                        digB3.setError(" preencha o campo");
                        //
                    }else {
                        numerosLidos1[0] = 6;
                        digB3.setText("");
                    }

                } else {
                  /*  if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }*/
                    numerosLidos1[0] = 25;
                    digA3.requestFocus();
                }
                //-------------------------LINHA 3 A3---------------------------------------
                if (!A3.equalsIgnoreCase(linha.get(2).getA())) {

                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }if (A3.isEmpty()){
                        digA3.setError(" preencha o campo");
                        //
                    }else {
                        numerosLidos1[0] = 7;
                        digA3.setText("");
                    }


                } else {// linha 3
                   /* if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    } else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (B2.isEmpty()) {
                        digB2.requestFocus();//cursor
                    } else if (A3.isEmpty()) {
                        digA3.requestFocus();//cursor
                    } else if (B3.isEmpty()) {
                        digB3.requestFocus();//cursor
                    }*/
                    if (A3.equalsIgnoreCase(linha.get(2).getA())
                            && B3.equalsIgnoreCase(linha.get(2).getB())
                            && C3.equalsIgnoreCase(linha.get(2).getC())) {
                        digC4.requestFocus();
                        va3.setText(">> B =  C % 5");

                        numerosLidos1[0] = 30;
                    }
                }
                //----------------------------LINHA 4 C4--------------------------------
                if (!C4.equalsIgnoreCase(linha.get(3).getC())) {
                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }if (C4.isEmpty()){
                        digC4.setError(" preencha o campo");
                        //
                    }else {
                        numerosLidos1[0] = 8;
                        digC4.setText("");
                    }


                } else {//linha 4
                  /*  if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    } else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (B2.isEmpty()) {
                        digB2.requestFocus();//cursor
                    } else if (C3.isEmpty()) {
                        digC3.requestFocus();//cursor
                    } else if (A4.isEmpty()) {
                        digA4.requestFocus();//cursor
                    }*/
                    numerosLidos1[0] = 35;
                    digB4.requestFocus();
                }
                //-----------------------LINHA 4 B4 -----------------------------------
                if (!B4.equalsIgnoreCase(linha.get(3).getB())) {
                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }if (B4.isEmpty()){
                        digB4.setError(" preencha o campo");
                        //
                    }else {
                        numerosLidos1[0] = 9;
                        digB4.setText("");
                    }

                } else {//linha 4
                  /*  if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    } else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (B2.isEmpty()) {
                        digB2.requestFocus();//cursor
                    } else if (C3.isEmpty()) {
                        digC3.requestFocus();//cursor
                    } else if (A4.isEmpty()) {
                        digA4.requestFocus();//cursor
                    }*/
                    numerosLidos1[0] = 40;
                    digA4.requestFocus();
                }
                //-----------------------LINHA 4 A4 -----------------------------------
                if (!A4.equalsIgnoreCase(linha.get(3).getA())) {

                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }if (A4.isEmpty()){
                        digA4.setError(" preencha o campo");
                        //
                    }else {
                        numerosLidos1[0] = 11;
                        digA4.setText("");
                    }

                } else {//linha 4
                  /*  if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    } else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (B2.isEmpty()) {
                        digB2.requestFocus();//cursor
                    } else if (C3.isEmpty()) {
                        digC3.requestFocus();//cursor
                    } else if (A4.isEmpty()) {
                        digA4.requestFocus();//cursor
                    } else if (B4.isEmpty()) {
                        digB4.requestFocus();//cursor
                    }*/

                    if (A4.equalsIgnoreCase(linha.get(3).getA())
                            && B4.equalsIgnoreCase(linha.get(3).getB())
                            && C4.equalsIgnoreCase(linha.get(3).getC())) {
                        digC5.requestFocus();
                        va4.setText(">> C =  C/A+2");

                        numerosLidos1[0] = 45;

                    }
                }
                //-----------------------LINHA 5 C5 -----------------------------------
                if (!C5.equalsIgnoreCase(linha.get(4).getC())) {
                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }if (C5.isEmpty()){
                        digC5.setError(" preencha o campo");
                        //
                    }else {
                        numerosLidos1[0] = 12;
                        digC5.setText("");
                    }


                } else { // linha 5
                   /* if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    } else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (B2.isEmpty()) {
                        digB2.requestFocus();//cursor
                    } else if (C3.isEmpty()) {
                        digC3.requestFocus();//cursor
                    } else if (A4.isEmpty()) {
                        digA4.requestFocus();//cursor
                    } else if (B4.isEmpty()) {
                        digB4.requestFocus();//cursor
                    } else if (C4.isEmpty()) {
                        digC4.requestFocus();//cursor
                    }*/
                    numerosLidos1[0] = 50;
                    digB5.requestFocus();
                }
                //-----------------------LINHA 5 B5 -----------------------------------
                if (!B5.equalsIgnoreCase(linha.get(4).getB())) {
                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }if (B5.isEmpty()){
                        digB5.setError(" preencha o campo");
                        //
                    }else {
                        numerosLidos1[0] = 13;
                        digB5.setText("");
                    }


                } else { // linha 5
                  /*  if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    } else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (B2.isEmpty()) {
                        digB2.requestFocus();//cursor
                    } else if (C3.isEmpty()) {
                        digC3.requestFocus();//cursor
                    } else if (A4.isEmpty()) {
                        digA4.requestFocus();//cursor
                    } else if (B4.isEmpty()) {
                        digB4.requestFocus();//cursor
                    } else if (C4.isEmpty()) {
                        digC4.requestFocus();//cursor
                    } else if (A5.isEmpty()) {
                        digA5.requestFocus();//cursor
                    }*/
                    numerosLidos1[0] = 55;
                    digA5.requestFocus();
                }
                //-----------------------LINHA 5 A5------------------------------------
                if (!A5.equalsIgnoreCase(linha.get(4).getA())) {
                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }if (A5.isEmpty()){
                        digA5.setError(" preencha o campo");
                        //
                    }else {
                        numerosLidos1[0] = 14;
                        digA5.setText("");
                    }

                } else { // linha 5
                    if (C1.isEmpty()) {
                        digC1.requestFocus();//cursor
                    }else if (C2.isEmpty()) {
                        digC2.requestFocus();//cursor
                    }else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (C3.isEmpty()) {
                        digC3.requestFocus();//cursor
                    } else if (B3.isEmpty()) {
                        digB3.requestFocus();//cursor
                    } else if (A3.isEmpty()) {
                        digA3.requestFocus();//cursor
                    } else if (C4.isEmpty()) {
                        digC4.requestFocus();//cursor
                    } else if (B4.isEmpty()) {
                        digB4.requestFocus();//cursor
                    } else if (A4.isEmpty()) {
                        digA4.requestFocus();//cursor
                    } else if (B5.isEmpty()) {
                        digB5.requestFocus();//cursor
                    } else if (A5.isEmpty()) {
                        digA5.requestFocus();//cursor
                    }
                    if (A5.equalsIgnoreCase(linha.get(4).getA())
                            && B5.equalsIgnoreCase(linha.get(4).getB())
                            && C5.equalsIgnoreCase(linha.get(4).getC())) {
                        va5.setText(">> A =  B**3");

                        numerosLidos1[0] = 60;
                    }


                }
                for (int K = 0; K < 5; K++) {

                }
                Toast.makeText(getBaseContext(), "vc fez " + numerosLidos1[0] + " pontos", Toast.LENGTH_LONG).show();
                //--------------------------mensagem do toast para numLidos---------------

                int soma=0;
                for(int k=0; k<numerosLidos1.length; k++) {
                    soma+= numerosLidos1[k];
                }

                if(soma == 0) {
                    Toast.makeText(getBaseContext(), "Tente Novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 1) {
                    Toast.makeText(getBaseContext(), "caixa C1 tente novamente", Toast.LENGTH_LONG).show();
                }
                if(soma == 2) {
                    Toast.makeText(getBaseContext(), "caixa C2 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 3) {
                    Toast.makeText(getBaseContext(), "caixa A2 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 4) {
                    Toast.makeText(getBaseContext(), "caixa C3 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 6) {
                    Toast.makeText(getBaseContext(), "caixa B3 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 7) {
                    Toast.makeText(getBaseContext(), "caixa A3 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 8) {
                    Toast.makeText(getBaseContext(), "caixa C4 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 9) {
                    Toast.makeText(getBaseContext(), "caixa B4 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 11) {
                    Toast.makeText(getBaseContext(), "caixa A4 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 12) {
                    Toast.makeText(getBaseContext(), "caixa C5 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 13) {
                    Toast.makeText(getBaseContext(), "caixa B5 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 14) {
                    Toast.makeText(getBaseContext(), "caixa A5 tente novamente ", Toast.LENGTH_LONG).show();
                }

                if(soma == 5) {
                    Toast.makeText(getBaseContext(), "Primeira Linha , letra (C)  Ok, 5 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 10) {
                    Toast.makeText(getBaseContext(), "Segunda linha - Letra (C) ,10 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 15) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 2 - Letra (A) ,15 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 20) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 3 - Letra (C) ,20 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 25) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 3 - Letra (B) ,25 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 30) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 3 - Letra (A) ,30 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 35) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 4 - Letra (C) ,35 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 40) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 4 - Letra (B) ,40 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 45) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 4 - Letra (A) ,45 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 50) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 5 - Letra (C) ,50 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 55) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 5 - Letra (B) ,55 Pontos ", Toast.LENGTH_LONG).show();
                }

                if(soma == 60){
                    Toast.makeText(getBaseContext(), "Parabéns! Você acertou todos os valores  ", Toast.LENGTH_LONG).show();
                }

            }
        });


        IniciarComponentes();
        proximo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent proximo3 = new Intent(Tela3.this,Tela4.class);
                startActivity(proximo3);

            }
        });

        voltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela3= new Intent(Tela3.this, Tela2.class);
                startActivity(tela3);
            }
        });
        botDica3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botDica3 = new Intent(Tela3.this,Tela6.class);
                startActivity(botDica3);

            }
        });


    }
    private void IniciarComponentes () {
        proximo3 = findViewById(R.id.proximo);
        voltar3 = findViewById(R.id.voltar);
        botDica3 = findViewById(R.id.botDica);
        //button_sair= findViewById(R.id.button_sair);
        botConfirmar = findViewById(R.id.botConfirmar);
        //menu3 = findViewById(R.id.menu3);
    }
}


