import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];

        System.out.println("Matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplicacion de matrices: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matrizA[i][j] * matrizB[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
