package br.edu.ifsp.list01;

import java.util.Scanner;

/*
    Alan quer comprar limões para fazer uma limonada. Próximo da sua casa há um mercadinho que vende limões da seguinte
    forma: O primeiro limão é vendido por C centavos, o segundo por C − 1 centavos, o terceiro por C − 2 e assim
    por diante até o menor valor de 1 centavo. Por exemplo, se C = 3 e Alan quiser comprar *5* limões, o preço total
    será 3 + 2 + 1 + 1 + 1 = 8.

    Faça um programa que leia dois inteiros *N* e *C* que indicam respectivamente o número de limões e o valor em
    centavos do primeiro limão. Em seguida imprima o valor total em centavos.

    ### Exemplos de entrada e saída:

    | Entrada  | Saída  |
    | -------  | ------ |
    | 5 3      | 8      |
    | 3 3      | 6      |

    Fonte: Adaptado de https://neps.academy/problem/193
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
*/
public class  Ex08 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int x = scanner.nextInt();
        final int c = scanner.nextInt();

        final Ex08 ex08 = new Ex08();
        System.out.printf("%d\n", ex08.compute(x, c));
    }

    int compute(int n, int c) {
        int output = 0;
        for (int i = 0; i < n; i++) {
            output += c > 1 ? c-- : 1;

        }
        return output;
    }
}
