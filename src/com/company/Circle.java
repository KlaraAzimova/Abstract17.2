package com.company;

public class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public double getPerimeter(int a) {
        double radius = Math.pow(10, 2);
        return radius;
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString();
    }
}
