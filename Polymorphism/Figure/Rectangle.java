package br.edu.ifsp.Polymorphism.Figure;

import java.util.Objects;

public final class Rectangle extends Figure {
     private double width;
     private double height;

    Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle of width: %.2f and height: %.2f. Position: x: %.2f y: %.2f. Area: %.2f", getWidth(), getHeight(), super.toString(), area());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(getX(), rectangle.getX()) == 0 &&
                Double.compare(getY(), rectangle.getY()) == 0 &&
                Double.compare(width, rectangle.width) == 0
                && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
