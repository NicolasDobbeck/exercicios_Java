package org.example.UML;

public class Heptagono extends MinimoPoligno{
    private double l4, l5, l6, l7;

    public Heptagono (double l1, double l2, double l3, double l4, double l5, double l6, double l7) {
        super(l1, l2, l3);
        this.l4 = l4;
        this.l5 = l5;
        this.l6 = l6;
        this.l7 = l7;
    }

    @Override
    public String getTipo(){
        return "Retangulo";
    }

    @Override
    public double getArea() {
        return 0;
    }
}
