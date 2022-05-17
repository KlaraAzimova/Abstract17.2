package com.company;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(" Circle ");
        System.out.println("1. Circule " + circle.getPerimeter(10));
        Shape elips = new Elips("Elips ");
        System.out.println("2. Elips " + elips.getPerimeter(12));
        Shape rectangle = new Rectangle("Rectangle ");
        System.out.println("3. Rectangle " + rectangle.getPerimeter(8));
        Shape square = new Square("Square ");
        System.out.println("4. Square " + square.getPerimeter(6));
        Shape triangle = new Triangle("Triangle ");
        System.out.println("5. Triangle " + triangle.getPerimeter(20));


    }
}
