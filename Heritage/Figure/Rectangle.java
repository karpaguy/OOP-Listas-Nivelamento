package br.edu.ifsp.Heritage.Figure;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double x, double y) {
        super(x, y);
        this.width = x;
        this.height = y;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }
}
