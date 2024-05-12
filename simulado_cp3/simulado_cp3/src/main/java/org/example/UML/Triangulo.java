package org.example.UML;

public class Triangulo extends MinimoPoligno{
    public Triangulo(double l1, double l2, double l3) {
        super(l1, l2, l3);
    }

    @Override
    public String getTipo(){
        return "Retangulo";
    }

    @Override
    public double getArea(){
        return 3;
    }
}
