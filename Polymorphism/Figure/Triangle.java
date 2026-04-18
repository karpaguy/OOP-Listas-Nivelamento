package br.edu.ifsp.Polymorphism.Figure;

import java.util.Objects;

public final class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return String.format("Triangle of a: %.2f b: %.2f c: %.2f. Position: x: %.2f y: %.2f. Area: %.2f.", getA(), getB(), getC(), super.toString(), area());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(a, triangle.a) == 0 &&
                Double.compare(b, triangle.b) == 0 &&
                Double.compare(c, triangle.c) == 0 &&
                Double.compare(getX(), triangle.getX()) == 0 &&
                (Double.compare(getY(), triangle.getY())) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public double getA() { return a; }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
