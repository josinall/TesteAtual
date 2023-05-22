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
    public ImageView botAjuda1;
    public ImageView proximo;
    public ImageView voltar;
    //public ImageView menu;

    Tabela linha0;
    TextView va1;TextView va2;TextView va3;TextView va4;TextView va5;
    EditText digA1;EditText digA2;EditText digA3;EditText digA4;EditText digA5;
    EditText digB1;EditText digB2;EditText digB3;EditText digB4;EditText digB5;
    EditText digC1;EditText digC2;EditText digC3;EditText digC4;EditText digC5;


    Button botConfirmar;

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
                int[] numerosLidos = new int[5];
                int[] numerosLidos2 = new int[5];
               /*
              String dig1 = "3";
                String dig2 = "5";
                String dig3 = "9";
                String dig4 = "12";
                String dig5 = "15";

                String b1 = "3";
                String b11 = "1";
                String b2 = "27";
                String b3 = "10";
                String b5 = "17";

                String x1 = "3";
                String x2 = "27";
                String x3 = "10";
                String x4 = "1";
                String x5 = "17";
                */

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
                    digA1.setText("");  //apaga
                    digB1.setText("-");
                    digC1.setText("-");

                } else {// linha 1
                    digA2.requestFocus();//cursor
                    digA1.setText("3");
                    digB1.setText("-");
                    digC1.setText("-");
                    va1.setText(">> A =  5  -  2");
                    numerosLidos[0] = 1;
                    numerosLidos2[0] = 20;
                }
                ///----------------------LINHA 2 A2--------------------------------------
                if (!A2.equalsIgnoreCase(linha.get(1).getA())) {
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    digA2.setText("");  //se errar numero ficar vazio
                    //digA2.requestFocus();
                } else {
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    digB2.requestFocus();//cursor

                }
                //--------------------------LINHA 2 B2------------------------------------
                if (!B2.equalsIgnoreCase(linha.get(1).getB())) {
                    digB2.setText("");  //apaga
                    digC2.setText("-");
                    //digA2.setText("");

                } else {//linha 2
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    if (A2.equalsIgnoreCase(linha.get(1).getA())//se as duas forem certas
                            && B2.equalsIgnoreCase(linha.get(1).getB())) {
                        digA3.requestFocus();
                        digC2.setText("-");
                        va2.setText(">> B =  3 ** 3");
                        numerosLidos[1] = 1;
                        numerosLidos2[1] = 20;
                    }
                }//------------------------LINHA 3 A3 --------------------------------------
                if (!A3.equalsIgnoreCase(linha.get(2).getA())) {
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    digA3.setText("");  //apaga
                } else {
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    digB3.requestFocus();
                }
                //-------------------------LINHA 3 B3 --------------------------------------
                if (!B3.equalsIgnoreCase(linha.get(2).getB())) {
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    digB3.setText("");  //apaga
                } else {
                    if (A1.isEmpty()) {
                        digA1.requestFocus();//cursor
                    }
                    digC3.requestFocus();
                }
                //-------------------------LINHA 3 C3---------------------------------------
                if (!C3.equalsIgnoreCase(linha.get(2).getC())) {
                    digC3.setText("");  //apaga
                    //digB3.setText("");
                    //digA3.setText("");

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
                        numerosLidos[2] = 1;
                        numerosLidos2[2] = 20;
                    }
                }
                //----------------------------LINHA 4 A4--------------------------------
                if (!A4.equalsIgnoreCase(linha.get(3).getA())) {
                    digA4.setText("");  //apaga

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
                    }
                    digB4.requestFocus();
                }
                //-----------------------LINHA 4 B4 -----------------------------------
                if (!B4.equalsIgnoreCase(linha.get(3).getB())) {
                    digB4.setText("");
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
                    }
                    digC4.requestFocus();
                }
                //-----------------------LINHA 4 C4 -----------------------------------
                if (!C4.equalsIgnoreCase(linha.get(3).getC())) {
                    digC4.setText("");

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
                        numerosLidos[3] = 1;
                        numerosLidos2[3] = 20;

                    }
                }
                //-----------------------LINHA 5 A5 -----------------------------------
                if (!A5.equalsIgnoreCase(linha.get(4).getA())) {
                    digA5.setText("");  //apaga

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
                    }
                    digB5.requestFocus();
                }
                //-----------------------LINHA 5 B5 -----------------------------------
                if (!B5.equalsIgnoreCase(linha.get(4).getB())) {
                    digB5.setText("");

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
                    }
                    digC5.requestFocus();
                }
                //-----------------------LINHA 5 C5------------------------------------
                if (!C5.equalsIgnoreCase(linha.get(4).getC())) {
                    digC5.setText("");  //apaga
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
                        numerosLidos[4] = 1;
                        numerosLidos2[4] = 20;
                    }


                }
                for (int i = 0; i < 5; i++) {

                    if (!A1.equalsIgnoreCase(linha.get(0).getA())) {
                        numerosLidos[i] += 1;
                    }

                 /*   if (A2.equalsIgnoreCase(linha.get(1).getA())//se as duas forem certas
                            && B2.equalsIgnoreCase(linha.get(1).getB())) {
                        numerosLidos[i] += 1;
                    }

                    if (A3.equalsIgnoreCase(linha.get(2).getA())
                            && B3.equalsIgnoreCase(linha.get(2).getB())
                            && C3.equalsIgnoreCase(linha.get(2).getC())) {
                        numerosLidos[i] += 1;
                    }


                    if (A4.equalsIgnoreCase(linha.get(3).getA())
                            && B4.equalsIgnoreCase(linha.get(3).getB())
                            && C4.equalsIgnoreCase(linha.get(3).getC())) {
                        numerosLidos[i] += 1;
                    }
                    if (A5.equalsIgnoreCase(linha.get(4).getA())
                            && B5.equalsIgnoreCase(linha.get(4).getB())
                            && C5.equalsIgnoreCase(linha.get(4).getC())) {
                        numerosLidos[i] += 1;

                    }*/


                }
                for (int i = 0; i < 5; i++) {

                }
                //Toast.makeText(getBaseContext(), "vc fez " + numerosLidos[0] + " pontos", Toast.LENGTH_LONG).show();
                //--------------------------mensagem do toast para numLidos---------------

                int soma=0;
                for(int k=0; k<numerosLidos.length; k++) {
                    soma+= numerosLidos2[k];
                }
                if(soma == 100){
                    Toast.makeText(getBaseContext(), "Parabéns Você Concluiu o Exercício 1 ", Toast.LENGTH_LONG).show();
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