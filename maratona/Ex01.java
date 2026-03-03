package br.edu.ifsp.maratona;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teste = scanner.nextLine();

        char[] valorArray = teste.toCharArray();
        char[] vagais = {'a', 'e', 'i', 'o', 'u'};

        String s1 = "";
        String s2 = "";
        int i = 0;

        for (i = 0; i < valorArray.length; i++) {
            for (int j = 0; j < vagais.length; j++) {
                if (valorArray[i] == vagais[j]) {
                    s1 += vagais[j];
                }
            }
        }

        for (i = valorArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < vagais.length; j++) {
                if (valorArray[i] == vagais[j]) {
                    s2 += vagais[j];
                }
            }
        }

        if (s1.equals(s2)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }
}
