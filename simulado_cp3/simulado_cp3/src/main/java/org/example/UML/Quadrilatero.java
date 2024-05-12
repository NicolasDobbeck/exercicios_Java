package org.example.UML;

public class Quadrilatero extends MinimoPoligno {
    private double l4;

    public Quadrilatero(double l1, double l2, double l3, double l4) {
        super(l1, l2, l3);
        this.l4 = l4;
    }

    public String getTipo(){
        return "Retangulo";
    }

    @Override
    public double getArea(){
        return 0;
    }

    public double getl4(){
        return 0;
    }
}
