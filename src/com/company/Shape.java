package com.company;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter(int a);

    @Override
    public String toString() {
        return "Shape: " +
                "name - " + name;

    }
}
