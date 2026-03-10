package br.edu.ifsp.list03;

import java.util.Scanner;

/*
Implemente um programa que gere senhas provisórias a partir do nome do usuário, seguindo o mesmo
padrão dos exemplos a seguir:

EXEMPLO 1 Entrada: Java | Saída: J*Ja*Jav*Jav*Ja* J
EXEMPLO 2 Entrada: POOS3 | Saída: P*PO*POO*POOS*POOS*POO*PO*P
EXEMPLO 3 Entrada: KO | Saída: K*K
EXEMPLO 4 Entrada: O | Saída: Invalido
EXEMPLO 5 Entrada: | Saída: Invalido
*/
public class Ex01 {
    public static void main(String[] args) {
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira nome: ");
        String username = scanner.nextLine();
        scanner.close();

        Ex01 ex01 = new Ex01();
        System.out.println(ex01.compute(username));

        // String nome = "José Silveira";
        // String substring = nome.substring(0, 1);
        // System.out.println("String depois da 3º index: " + substring);
    }

    String compute(String input) {
        String output = "";

        if (input.length() < 2) return "Invalido";
        for (int i = 1; i < input.length(); i++) {
            output += input.substring(0, i);
            output += "*";
        }
        for (int i = input.length()-1; i > 0; i--) {
            output += input.substring(0, i);
            if (i != 1) output += "*";
        }

        return output;
    }
}

// https://www.devmedia.com.br/string-em-java-entendendo-e-utilizando-essa-classe/25503
