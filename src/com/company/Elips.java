package com.company;

public class Elips extends Shape {
    public Elips(String name) {
        super(name);
    }

    @Override
    public double getPerimeter(int a) {
        double b = 5;
        double c = 5.4;
        return ((a * b) / c);
    }

    @Override
    public String toString() {
        return "Elips " + super.toString();
    }
}
