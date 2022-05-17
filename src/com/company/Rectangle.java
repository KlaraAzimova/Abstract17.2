package com.company;

public class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public double getPerimeter(int a) {
        return (a * 2);

    }

    @Override
    public String toString() {
        return "Rectangle " + super.toString();
    }
}
