package br.edu.ifsp.list02;

/*
    Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os armazene em um vetor de 10 posições.
    A partir daí, leia um número por vez. Se o número ainda não estiver no conjunto, faça a inclusão após o último número.
    Caso ele esteja no conjunto, remova o número e libere espaço no array. A cada iteração imprima o vetor. O programa
    acaba quando o array ficar totalmente cheio ou vazio. Veja o exemplo na imagem anexa.

    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Ex03 {
    public static final int NUM_VALUES = 5;

    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
        final Scanner scanner = new Scanner(System.in);

        final int[] firstFive = new int[NUM_VALUES];
        for (int i = 0; i < firstFive.length; i++) {
            if (scanner.hasNextInt()) {
                firstFive[i] = scanner.nextInt();
            }
        }

        List<Integer> otherIntsList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == -1) break;
            otherIntsList.add(num);
        }
        int[] otherInts = new int[otherIntsList.size()];
        for (int i = 0; i < otherIntsList.size(); i++) {
            otherInts[i] = otherIntsList.get(i);
        }

        scanner.close();

        final Ex03 ex3 = new Ex03();
        System.out.println(ex3.compute(firstFive, otherInts));

    }

    String compute(int[] firstFive, int[] otherInts) {
        //put your logic here
        if (firstFive.length != 5) return "Erro";
        for (int i = 0; i < firstFive.length-1; i++) {
            for (int j = i+1; j < firstFive.length; j++) {
                if (firstFive[i] == firstFive[j]) return "Erro";
            }
        }

        int[] vetor = new int[10];
        int acc = 0;

        for (int n : firstFive) {
            vetor[acc] = n;
            acc++;
        }

        StringBuilder output = new StringBuilder();
        output.append(formatArray(vetor, acc));

        for (int n : otherInts) {
            int flagIndex = -1;

            for (int i = 0; i < acc; i++) {
                if(vetor[i] == n) {
                    flagIndex = i;
                    break;
                }
            }

            if (flagIndex != -1) {
                for (int j = flagIndex; j < acc-1; j++) {
                    vetor[j] = vetor[j+1];
                } acc--;
            } else if (acc < 10){
                vetor[acc] = n;
                acc++;
            }

            if (acc == 0) break;

            output.append("\n").append(formatArray(vetor, acc));

            if (acc == 10) break;
        }

        return output.toString();
    }

    private String formatArray(int[] v, int n) {
        StringJoiner nString = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            nString.add(String.valueOf(v[i]));
        }
        return nString.toString();
    }
}
