package com.company;

import java.util.Scanner;

public class Square extends Shape {
    public Square(String name) {
        super(name);
    }

    @Override
    public double getPerimeter(int b) {
        double a = 10;
        return (Math.pow(a, b));

    }

    @Override
    public String toString() {
        return "Square " + super.toString();
    }
}
