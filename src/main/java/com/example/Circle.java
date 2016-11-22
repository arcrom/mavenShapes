package com.example;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return radius + radius;
    }

    public double getHeight() {
        return radius + radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String getName() {
        return "Circle";
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int localNumber = 17;
        result = localNumber * result + (int) this.radius;
        return result;
    }

    @Override
    public String toString() {
        return "Фигура: " + getName() + ", Радиус: " + this.radius;
    }
}
