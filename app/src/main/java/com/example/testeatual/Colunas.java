package com.example.testeatual;


public class Colunas {

    String A;
    String B;
    String C;

    public Colunas(String A, String B, String C) {
        super();
        this.A = A;
        this.B = B;
        this.C = C;

    }
    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return B;
    }

    public void setB(String B) {
        this.B = B;
    }

    public String getC() {
        return C;
    }

    public void setC(String C) {
        this.C = C;
    }

    @Override
    public String toString() {
        return "Matris{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }



}


