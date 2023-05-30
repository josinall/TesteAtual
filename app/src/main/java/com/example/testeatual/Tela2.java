package com.example.testeatual;

import java.util.ArrayList;
//import java.util.Scanner;
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
    public ImageView botDica;
    public ImageView proximo;
    public ImageView voltar;
    //public ImageView menu;

    Tabela linha0;
    TextView va1;TextView va2;TextView va3;TextView va4;TextView va5;
    EditText digA1;EditText digA2;EditText digA3;EditText digA4;EditText digA5;
    EditText digB1;EditText digB2;EditText digB3;EditText digB4;EditText digB5;
    EditText digC1;EditText digC2;EditText digC3;EditText digC4;EditText digC5;

    Button botConfirmar;

    ArrayList<Colunas> x= new ArrayList<Colunas>();
    ArrayList<Colunas> y = new ArrayList<Colunas>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
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
        /*
        x.add(linha0);

        Colunas x1 = new Colunas("a1", "b1", "c1");
        Colunas x2 = new Colunas("a2", "b2", "c2");
        Colunas x3 = new Colunas("a3", "b3", "c3");
        Colunas x4 = new Colunas("a4", "b4", "c4");
        Colunas x5 = new Colunas("a5", "b5", "c5");

        */

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

                //String B1 = digB1.getText().toString();
                String B2 = digB2.getText().toString();
                String B3 = digB3.getText().toString();
                String B4 = digB4.getText().toString();
                String B5 = digB5.getText().toString();

                //String C1 = digC1.getText().toString();
                //String C2 = digC2.getText().toString();
                String C3 = digC3.getText().toString();
                String C4 = digC4.getText().toString();
                String C5 = digC5.getText().toString();

                ArrayList<Colunas> linha = new ArrayList<Colunas>();
                int[] numerosLidos1 = new int[5];
                int[] numerosLidos2 = new int[5];
                int[] numerosLidos3 = new int[5];


                Colunas linha0 = new Colunas("3", "-", "-");
                Colunas linha1 = new Colunas("3", "27", "-");
                Colunas linha2 = new Colunas("3", "27", "10");
                Colunas linha3 = new Colunas("1", "27", "10");
                Colunas linha4 = new Colunas("1", "27", "17");

                linha.add(linha0);
                linha.add(linha1);
                linha.add(linha2);
                linha.add(linha3);
                linha.add(linha4);

                //--------------------------LINHA 1 A1----------------------------------

                if (!A1.equalsIgnoreCase(linha.get(0).getA())) {
                    //digA1.setError(" preencha o campo novamente");
                    digA1.setText("");  //apaga
                    digB1.setText("-");
                    digC1.setText("-");
                    digA1.setError(" preencha o campo");
                    Toast.makeText(Tela2.this, "você errou a1", Toast.LENGTH_SHORT).show();
                    numerosLidos1[0] = 1;

                } else {// linha 1
                    Toast.makeText(Tela2.this, "vocè acertou a letra A e lina 1", Toast.LENGTH_LONG).show();
                    digA2.requestFocus();//cursor
                    digA1.setText("3");
                    digB1.setText("-");
                    digC1.setText("-");
                    va1.setText(">> A =  5  -  2");

                    numerosLidos1[0] = 5;

                }
                ///----------------------LINHA 2 A2--------------------------------------
                if (!A2.equalsIgnoreCase(linha.get(1).getA())) {
                    if (A1.isEmpty()){
                        digA1.setError(" preencha ");
                        digA1.requestFocus();//cursor

                    }if (A2.isEmpty()){
                        digA2.setError(" preencha o campo");
                        //
                    }else{
                    digA2.setText("");  //se errar numero ficar vazio
                    Toast.makeText(Tela2.this, "josa", Toast.LENGTH_SHORT).show();
                    numerosLidos1[0] = 2;
                    }


                } else {
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    digB2.requestFocus();//cursor
                    numerosLidos1[0] = 10;
                }
                //--------------------------LINHA 2 B2------------------------------------
                if (!B2.equalsIgnoreCase(linha.get(1).getB())) {
                    //digA1.setError(" preencha o campo novamente");

                    digC2.setText("-");
                    //digA2.setText("");
                    if (B2.isEmpty()){
                        digB2.setError(" preencha o campo");
                    }else {
                        digB2.setText("");
                        Toast.makeText(Tela2.this, "josa", Toast.LENGTH_SHORT).show();
                        numerosLidos1[0] = 3;
                    }

                } else {//linha 2
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    if (A2.equalsIgnoreCase(linha.get(1).getA())//se as duas forem certas
                            && B2.equalsIgnoreCase(linha.get(1).getB())) {

                        digA3.requestFocus();
                        digC2.setText("-");
                        va2.setText(">> B =  3 ** 3");
                     //   Toast.makeText(Tela2.this, "vocè acertou a letra B e lina 2", Toast.LENGTH_LONG).show();
                        numerosLidos1[0] = 15;

                    }
                }//------------------------LINHA 3 A3 --------------------------------------
                if (!A3.equalsIgnoreCase(linha.get(2).getA())) {
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    if (A3.isEmpty()){
                        digA3.setError(" preencha o campo");
                    }else {
                        digA3.setText("");  //apaga
                        numerosLidos1[0] =  4;
                    }
                } else {
                    //Toast.makeText(Tela2.this, "vocè acertou a letra A e lina 3", Toast.LENGTH_LONG).show();
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    digB3.requestFocus();
                    numerosLidos1[0] = 20;
                }
                //-------------------------LINHA 3 B3 --------------------------------------
                if (!B3.equalsIgnoreCase(linha.get(2).getB())) {
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    if (B3.isEmpty()){
                        digB3.setError(" preencha o campo");
                    }else {
                        digB3.setText("");  //apaga
                        numerosLidos1[0] = 6;
                    }
                } else {

                    //Toast.makeText(Tela2.this, "vocè acertou a letra B e lina 3", Toast.LENGTH_LONG).show();
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    digC3.requestFocus();
                    numerosLidos1[0] = 25;
                }
                //-------------------------LINHA 3 C3---------------------------------------
                if (!C3.equalsIgnoreCase(linha.get(2).getC())) {
                    digC3.setText("");  //apaga
                    //digB3.setText("");
                    //digA3.setText("");
                    if (C3.isEmpty()){
                        digC3.setError(" preencha o campo");
                    }else {
                        digC3.setText("");  //apaga
                        numerosLidos1[0] = 7;
                    }

                } else {// linha 3
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    } else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (B2.isEmpty()) {
                        digB2.requestFocus();//cursor
                    } else if (A3.isEmpty()) {
                        digA3.requestFocus();//cursor
                    } else if (B3.isEmpty()) {
                        digB3.requestFocus();//cursor
                    }
                    if (A3.equalsIgnoreCase(linha.get(2).getA())
                            && B3.equalsIgnoreCase(linha.get(2).getB())
                            && C3.equalsIgnoreCase(linha.get(2).getC())) {
                        digA4.requestFocus();
                        va3.setText(">> C =  B/A+1");
                     //   Toast.makeText(Tela2.this, "vocè acertou a letra C e lina 3", Toast.LENGTH_LONG).show();
                        numerosLidos1[0] = 30;;
                    }
                }
                //----------------------------LINHA 4 A4--------------------------------
                if (!A4.equalsIgnoreCase(linha.get(3).getA())) {
                      //apaga
                    if (A4.isEmpty()){
                        digA4.setError(" preencha o campo");
                    }else {
                        digA4.setText("");
                        numerosLidos1[0] = 8;
                    }
                } else {//linha 4
                   // Toast.makeText(Tela2.this, "vocè acertou a letra A e lina 4", Toast.LENGTH_LONG).show();
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    } else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (B2.isEmpty()) {
                        digB2.requestFocus();//cursor
                    } else if (C3.isEmpty()) {
                        digC3.requestFocus();//cursor
                    } else if (A4.isEmpty()) {
                        digA4.requestFocus();//cursor
                    }
                    digB4.requestFocus();
                    numerosLidos1[0] = 35;
                }
                //-----------------------LINHA 4 B4 -----------------------------------
                if (!B4.equalsIgnoreCase(linha.get(3).getB())) {

                    if (B4.isEmpty()){
                        digB4.setError(" preencha o campo");
                    }else{
                        digB4.setText("");
                        numerosLidos1[0] = 9;
                    }

                } else {//linha 4
                   // Toast.makeText(Tela2.this, "vocè acertou a letra B e lina 4", Toast.LENGTH_LONG).show();
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    } else if (A2.isEmpty()) {
                        digA2.requestFocus();//cursor
                    } else if (B2.isEmpty()) {
                        digB2.requestFocus();//cursor
                    } else if (C3.isEmpty()) {
                        digC3.requestFocus();//cursor
                    } else if (A4.isEmpty()) {
                        digA4.requestFocus();//cursor
                    }
                    digC4.requestFocus();
                    numerosLidos1[0] = 40;
                }
                //-----------------------LINHA 4 C4 -----------------------------------
                if (!C4.equalsIgnoreCase(linha.get(3).getC())) {

                    if (C4.isEmpty()){
                        digC4.setError(" preencha o campo");
                    }else {
                        digC4.setText("");
                        numerosLidos1[0] = 11;
                    }
                } else {//linha 4

                    if (A1.isEmpty()) {
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
                    }

                    if (A4.equalsIgnoreCase(linha.get(3).getA())
                            && B4.equalsIgnoreCase(linha.get(3).getB())
                            && C4.equalsIgnoreCase(linha.get(3).getC())) {
                        digA5.requestFocus();
                        va4.setText(">> A =  A - 2");
                       // Toast.makeText(Tela2.this, "vocè acertou a letra C e lina 4", Toast.LENGTH_LONG).show();
                        numerosLidos1[0] = 45;

                    }
                }
                //-----------------------LINHA 5 A5 -----------------------------------
                if (!A5.equalsIgnoreCase(linha.get(4).getA())) {

                    if (A5.isEmpty()){
                        digA5.setError(" preencha o campo ");
                    }else {
                        digA5.setText("");
                        numerosLidos1[0] = 12;
                    }
                } else { // linha 5
                   // Toast.makeText(Tela2.this, "vocè acertou a letra A e lina 5", Toast.LENGTH_LONG).show();
                    if (A1.isEmpty()) {
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
                    }
                    digB5.requestFocus();
                    numerosLidos1[0] = 50;
                }
                //-----------------------LINHA 5 B5 -----------------------------------
                if (!B5.equalsIgnoreCase(linha.get(4).getB())) {

                    if (B5.isEmpty()){
                        digB5.setError(" preencha o campo ");
                    }else {
                        digB5.setText("");
                        numerosLidos1[0] = 13;
                    }
                } else { // linha 5
                   // Toast.makeText(Tela2.this, "vocè acertou a letra B e lina 5", Toast.LENGTH_LONG).show();
                    if (A1.isEmpty()) {
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
                    }
                    digC5.requestFocus();
                    numerosLidos1[0] = 55;
                }
                //-----------------------LINHA 5 C5------------------------------------
                if (!C5.equalsIgnoreCase(linha.get(4).getC())) {

                    if (C5.isEmpty()){
                        digC5.setError(" preencha o campo");
                    }
                    else {
                        digC5.setText("");
                        numerosLidos1[0] = 14;
                    }
                } else { // linha 5
                    if (A1.isEmpty()) {
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
                    } else if (B5.isEmpty()) {
                        digB5.requestFocus();//cursor
                    }
                    if (A5.equalsIgnoreCase(linha.get(4).getA())
                            && B5.equalsIgnoreCase(linha.get(4).getB())
                            && C5.equalsIgnoreCase(linha.get(4).getC())) {
                        va5.setText(">> C =  B - C");

                     //   Toast.makeText(Tela2.this, "vocè acertou a letra C e lina 5", Toast.LENGTH_LONG).show();
                        numerosLidos1[0] = 60;
                    }


                }
                for (int i = 0; i < 5; i++) {

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
                    Toast.makeText(getBaseContext(), "caixa A1 tente novamente", Toast.LENGTH_LONG).show();
                }
                if(soma == 2) {
                    Toast.makeText(getBaseContext(), "caixa A2 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 3) {
                    Toast.makeText(getBaseContext(), "caixa B2 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 4) {
                    Toast.makeText(getBaseContext(), "caixa A3 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 6) {
                    Toast.makeText(getBaseContext(), "caixa B3 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 7) {
                    Toast.makeText(getBaseContext(), "caixa C3 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 8) {
                    Toast.makeText(getBaseContext(), "caixa A4 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 9) {
                    Toast.makeText(getBaseContext(), "caixa B4 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 11) {
                    Toast.makeText(getBaseContext(), "caixa C4 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 12) {
                    Toast.makeText(getBaseContext(), "caixa A5 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 13) {
                    Toast.makeText(getBaseContext(), "caixa B5 tente novamente ", Toast.LENGTH_LONG).show();
                }
                if(soma == 14) {
                    Toast.makeText(getBaseContext(), "caixa C5 tente novamente ", Toast.LENGTH_LONG).show();
                }

                if(soma == 5) {
                    Toast.makeText(getBaseContext(), "Primeira Linha , letra (A)  Ok, 5 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 10) {
                    Toast.makeText(getBaseContext(), "Segunda linha - Letra (A) ,10 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 15) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 2 - Letra (B) ,15 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 20) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 3 - Letra (A) ,20 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 25) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 3 - Letra (B) ,25 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 30) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 3 - Letra (C) ,30 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 35) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 4 - Letra (A) ,35 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 40) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 4 - Letra (B) ,40 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 45) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 4 - Letra (C) ,45 Pontos ", Toast.LENGTH_LONG).show();
                }
                if(soma == 50) {
                    Toast.makeText(getBaseContext(), "Acertou Linha 5 - Letra (A) ,50 Pontos ", Toast.LENGTH_LONG).show();
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

        //----------------------proximo-----------------------------------------------
        proximo.setOnClickListener(v -> {
            Intent proximo = new Intent(Tela2.this,Tela3.class);
            startActivity(proximo);

        });
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Tela2.this,Tela1.class);
                startActivity(intent4);

            }
        });
        botDica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent botDica = new Intent(Tela2.this,Tela6.class);
                startActivity(botDica);

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
        botDica = findViewById(R.id.dica1);
        //menu = findViewById(R.id.menu1);
        botConfirmar = findViewById(R.id.botConfirmar);
    }

}