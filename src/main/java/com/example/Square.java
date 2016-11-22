package com.example;

public class Square implements Shape {
    public static final int COUNT_SIDE_TO_SQUARE = 4;

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getWidth() {
        return side;
    }

    public double getHeight() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * COUNT_SIDE_TO_SQUARE;
    }

    public String getName() {
        return "Square";
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
            Square other = (Square) obj;
            return side == other.side;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 1;
        int localNumber = 19;
        result = localNumber * result + (int) this.side;
        return result;
    }

    @Override
    public String toString() {
        return "Фигура: " + getName() + ", Сторона: " + this.side;
    }
}