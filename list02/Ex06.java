package br.edu.ifsp.list02;

import java.util.Scanner;

/*
    Faça um programa que leia um valor inteiro N. Após isso, leia dois vetores A e B de tamanho N. Em seguida, o programa
    deve criar um vetor C com os elementos de A e B intercalados.

    Exemplos de entrada e saída:

    | Entrada                 | Saída                         |
    | -------                 | ------                        |
    | 6                       | 5 10 6 20 3 30 8 40 2 50 0 60 |
    | 5 6 3 8 2 0             |                               |
    | 10 20 30 40 50 60       |                               |
      ---
    | 3                       | 1 1 2 1 3 1                   |
    | 1 2 3                   |                               |
    | 1 1 1                   |                               |

    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
public class Ex06 {
    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui

        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();

        final int[] vetorA = new int[N];
        final int[] vetorB = new int[N];

        for (int i = 0; i < N; i++) {
            vetorA[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            vetorB[i] = scanner.nextInt();
        }

        scanner.close();

        Ex06 ex06 = new Ex06();
        System.out.println(ex06.compute(vetorA, vetorB));
    }

    String compute(int[] arrayA, int[] arrayB) {
        final int[] vetorC = new int[arrayA.length * 2];
        for (int i = 0; i < arrayA.length; i++) {
            vetorC[2*i] = arrayA[i];
            vetorC[2*i+1] = arrayB[i];
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < vetorC.length; i++) {
            output.append(vetorC[i]);
            if (i < vetorC.length-1) {
                output.append(" ");
            }
        }

        return output.toString();
    }
}
