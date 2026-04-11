package br.edu.ifsp.Heritage.Figure;

public class Main {
    public void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println(rectangle.area());

        Circle circle = new Circle(3, 2.5, 3);
        System.out.println(circle.area());

        Triangle triangle = new Triangle(2, 2, 2, 2, 2);
        System.out.println(triangle.area());
    }
}
