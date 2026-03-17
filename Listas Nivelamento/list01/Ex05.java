package br.edu.ifsp.list01;

/*
    A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h.
    Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A
    por cada km acima do limite. Faça um programa que leia o limite L, o valor da multa M,
    o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa.
    Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada	    Saída
    60          200.00
    150.00
    10.00
    65

    Entrada	    Saída
    60          0.00
    150.00
    10.00
    50
*/

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int l = scanner.nextInt();
        final double m = scanner.nextDouble();
        final double a = scanner.nextDouble();
        final int v = scanner.nextInt();

        final Ex05 ex05 = new Ex05();
        System.out.println(ex05.compute(l, m, a, v));
    }

    String compute(int L, double m, double a, int v) {
        String output = null;
        //put your logic here
        double valor = 0.00;

        if (v <= L) output = Double.toString(valor);
        else {
            valor = (v - L) * a + m;
            output = Double.toString(valor);
        }

        return output;
    }
}
