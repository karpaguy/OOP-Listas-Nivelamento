package br.edu.ifsp.Polymorphism.Figure;

import java.util.Objects;

public final class Circle extends Figure {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3 * getRadius();
    }

    @Override
    public String toString() {
        return String.format("Circle of radius: %.2f. Position: x: %.2f y: %.2f. Area: %.2f", getRadius(), super.toString(), area());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(getRadius(), circle.radius) == 0
                && Double.compare(getX(), circle.getX()) == 0
                && (Double.compare(getY(), circle.getY())) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    public double getRadius() {
        return radius;
    }

}
