package br.edu.ifsp.Strings_Exercises;

import java.util.Scanner;

public class Ex01 {

    public static void main() {
        final Scanner scanner = new Scanner(System.in);
        final String email = scanner.nextLine();

        System.out.println(Ex01Email.isEmail(email, ".com"));
    }
}
