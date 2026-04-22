package br.edu.ifsp.src.main.java.Figure;

public class Main {
    public void main(String[] args) {
        Figure[] figureL = new Figure[150];
        double bigArea = 0;

        for (int i = 0; i < 150; i += 3) {
            figureL[i] = new Rectangle(i, i, i+1, i+1);
            figureL[i+1] = new Triangle(i+1, i+1, i+1, i+1, i+1);
            figureL[i+2] =  new Circle(i+2, i+2, i+1);

            bigArea += figureL[i].area() + figureL[i+1].area() + figureL[i+2].area();
        }

        System.out.println(bigArea);
    }
}
