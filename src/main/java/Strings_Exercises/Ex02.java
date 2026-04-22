package br.edu.ifsp.src.main.java.Strings_Exercises;

import java.util.Scanner;

public class Ex02 {
    public static void main() {
        final Scanner scanner = new Scanner(System.in);
        final String phrase = scanner.nextLine();
        final String word = scanner.nextLine();

        System.out.println(Ex02WordCount.wordTotalInPhrase(phrase, word));
    }
}

// Crie uma classe com um método que conte quantas vezes uma palavra aparece em uma frase.