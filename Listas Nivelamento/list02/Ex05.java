package br.edu.ifsp.list02;

import java.util.Scanner;

/*
    Você está responsável pelo bolo de aniversário da sua priminha e decidiu que o bolo terá uma vela para cada ano da
    idade total dela. Quando ela assopra as velas, ela só é capaz de apagar apenas as velas mais altas. Sua tarefa é fazer
    um programa que leia a idade A da sua sobrinha e a altura das velas. Após isso, seu programa deve imprimir a
    quantidade de velas que ela vai conseguir apagar.

    Por exemplo, se sua sobrina está fazendo 4 anos e o bolo possui 4 velas de tamanhos 4, 4, 1, 3, então ela só vai
    conseguir apagar as duas mais altas, de tamanho 4. Portanto, a resposta deve ser 2.

    ### Exemplos de entrada e saída:

    | Entrada               | Saída  |
    | -------               | ------ |
    | 4    4    4    1    3 | 2      |
    | 4    3    2    1    3 | 2      |

    Fonte: Adaptado de https://www.hackerrank.com/challenges/birthday-cake-candles/problem
    => Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão (ICMC/USP)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute()

        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = new ArrayList<>();
        System.out.println("Digite -1 para interromper");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == -1) break;
            inputList.add(num);
        }
        int[] candlesList = new int[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            candlesList[i] = inputList.get(i);
        }

        scanner.close();
        final Ex05 ex05 = new Ex05();
        System.out.println(ex05.compute(candlesList));
    }

    int compute(int[] velas) {
        int output = 0; int maiorValor = -1;

        for (int i = 1; i < velas.length; i++) {
            if (maiorValor < velas[i] && maiorValor <= velas[0]) {
                maiorValor = velas[i];
                output = 1;
            } else if (maiorValor == velas[i]) output++;
        }

        return output;
    }
}
