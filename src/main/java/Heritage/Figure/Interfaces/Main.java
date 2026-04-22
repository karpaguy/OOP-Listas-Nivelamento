package br.edu.ifsp.src.main.java.Heritage.Figure.Interfaces;

public class Main {
    public void main(String[] args) {
        Figure rectangle = new Rectangle(4, 2);
        if (rectangle instanceof Figure) {
            System.out.println("WORKS!");
        }

        // Funciona de ambas as formas.
        Rectangle rectangle2 = new Rectangle(10, 5);
        System.out.println(rectangle2.getFigureName());

        Figure triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getArea());
    }
}
