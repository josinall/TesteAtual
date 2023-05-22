package com.example.testeatual;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Scanner;
//import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Tabela extends AppCompatActivity {
    public static void main (String[] args) {

        ArrayList<Colunas> linha = new ArrayList<Colunas>();

        //String x = "3";
        String dig1 = "3";
        String dig2 = "5";
        String dig3 = "9";
        String dig4 = "12";
        String dig5 = "15";
        //Colunas linha0 =  new Colunas("1","2","3");
        Colunas linha1 =  new Colunas("4","5","6");
        Colunas linha2 =  new Colunas("7","8","9");
        Colunas linha3 =  new Colunas("10","11","12");
        Colunas linha4 =  new Colunas("13","14","15");

        //linha.add(linha0);
        linha.add(linha1);
        linha.add(linha2);
        linha.add(linha3);
        linha.add(linha4);
        /*

        for (int i = 0; i<=linha.size();i++) {
            //String bb = linha.get(i).getC();
            if(dig1 == linha.get(i).getA()) {
                System.out.println("acertou -> " + linha.get(i).getA());

            }else {
                //System.out.println("linha 1 não -> " );
            }
            if(dig2 == linha.get(i).getB()) {
                System.out.println("acertou -> " + linha.get(i).getB());

            }else {
                //System.out.println("linha 2 não -> " );
            }
            if(dig3 == linha.get(i).getC()) {
                System.out.println("acertou -> " + linha.get(i).getC());

            }else {
                //System.out.println("linha 3 não -> " );
            }
            if(dig4 == linha.get(i).getC()) {
                System.out.println("acertou -> " + linha.get(i).getC());

            }else {
                //System.out.println("linha 4 não -> " );
            }
            if(dig5 == linha.get(i).getC()) {
                System.out.println("acertou -> " + linha.get(i).getC());
                break;
            }else {
                //System.out.println("linha 5 não -> " );
            }
            */
        //System.out.println("digite seu nome completo");
        //String m2= String.valueOf(mesa.get(0).getVarC());
        //m1 = Integer.parseInt(leitor.nextLine());
        //String j1 = "6";
        //System.out.println(j1 + " josa "+ m2);
        /*if(j1 == m2) {

            System.out.println("encontrado");
        }else{
            System.out.println("Não encontrado");
        }

         */


      //  }


    }

//---------------------------------------------------------------------------------------

   /* public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String a; String b; String c; String d; String e;

        System.out.println("  <- Hibrael informe um nome: ");
        a = leitor.nextLine();
        while(!a.equals("3")) {
            System.out.println("  <- invalido informe primeiro: ");
            a = leitor.nextLine();
        }
        System.out.println("  <- informe segundo: ");
        b = leitor.nextLine();
        while(!b.equals("27")) {
            System.out.println("  <- invalido informe o segundo: ");
            b = leitor.nextLine();
        }
        System.out.println("  <- informe terceiro: ");
        c = leitor.nextLine();
        while(!c.equals("10")) {
            System.out.println("  <- invalido informe terceiro: ");
            c = leitor.nextLine();
        }
        System.out.println("  <- informe quarto: ");
        a = leitor.nextLine();
        while(!a.equals("-1")) {
            System.out.println("  <- invalido informe quarto: ");
            a = leitor.nextLine();
        }
        System.out.println("  <- informe quinto: ");
        c = leitor.nextLine();
        while(!c.equals("17")) {
            System.out.println("  <- invalido informe quinto: ");
            c = leitor.nextLine();
        }
        System.out.println("terminou");
    }

    */
}