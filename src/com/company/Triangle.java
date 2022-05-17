package com.company;

public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public double getPerimeter(int a) {
        int base = 10;
        int height = 8;
        return (2 * (base * height));
    }

    @Override
    public String toString() {
        return "Triangle " + super.toString();
    }
}
