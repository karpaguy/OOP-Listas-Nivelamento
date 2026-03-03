package br.edu.ifsp.maratona;
import java.util.Scanner;
public class Ex03 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[][] matriz;
    int maior = 0;
    matriz = new int[n][m];
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            matriz[i][j]= scanner.nextInt();
        }
    }

    for (int i = 0; i < n; i++) {
        int acc = 0;
        for (int j = 0; j < m; j++) {
            acc += matriz[i][j];
        }
        if (acc >= maior) {
            maior = acc;
        }
    }

    for (int i = 0; i < m; i++) {
        int acc = 0;
        for (int j = 0; j < n; j++) {
            acc += matriz[j][i];
        }
        if (acc >= maior) {
            maior = acc;
        }
    }

    System.out.println(maior);

}
}
