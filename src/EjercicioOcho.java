import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[2][3];

        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz A   + Matriz B   =   Matriz C");

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.print("       ");
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.print("         ");
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matrizA[i][j] + matrizB[i][j]) + " ");
            }
            System.out.print("       ");
        }
        System.out.println();

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.print("       ");
        }

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.print("         ");
        }

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matrizB[i][j] + matrizA[i][j]) + " ");
            }
            System.out.print("       ");
        }
    }
}
