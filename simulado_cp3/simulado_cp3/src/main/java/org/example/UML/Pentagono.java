package org.example.UML;

public class Pentagono extends MinimoPoligno {
    private double l4, l5;

    public Pentagono(double l1, double l2, double l3, double l4, double l5) {
        super(l1, l2, l3);
        this.l4 = l4;
        this.l5 = l5;
    }

    public double getL4() {
        return l4;
    }

    public double getL5() {
        return l5;
    }

    @Override
    public double getArea(){
        return 0;
    }

    @Override
    public String getTipo(){
        return "Regular";
    }
}
