package br.edu.ifsp.Heritage.Figure.Interfaces;

public class Rectangle implements Figure {
    private int width;
    private int heigth;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return width * heigth;
    }

    @Override
    public String getFigureName() {
        return width == heigth ? "Quadrado" : "Retangulo";
    }

    @Override
    public int getFigureSides() {
        return 4;
    }
}
