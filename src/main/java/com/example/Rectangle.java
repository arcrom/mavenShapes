package com.example;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }

    public String getName() {
        return "Rectangle";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            Rectangle other = (Rectangle) obj;
            return width == other.width && height == other.height;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 1;
        int localNumber = 15;
        result = localNumber * result + (int) this.height;
        result = localNumber * result + (int) this.width;
        return result;
    }

    @Override
    public String toString() {
        return "Фигура: " + getName() + ", Высота: " + this.height + ", Ширина: " + this.width;
    }
}