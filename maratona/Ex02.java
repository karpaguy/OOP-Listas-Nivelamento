package br.edu.ifsp.maratona;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int m = scanner.nextInt();

        int[] carimbadas = new int[c];
        int[] coletadas = new int[m];
        for (int i = 0; i < c; i++){
            carimbadas[i] = scanner.nextInt();

        }


        for (int i = 0; i < m; i++){
            coletadas[i] = scanner.nextInt();

        }


        int acc = c;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < c; j++) {
                if (coletadas[i] == carimbadas[j]) {
                    carimbadas[j] = -1;
                    acc--;
                }
            }
        }

        System.out.println(acc);

    }
}
