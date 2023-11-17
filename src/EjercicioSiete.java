import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] Matriz1 = new int[3][3];
        int[][] Matriz2 = new int[3][3];
        int[][] MatrizTraspuesta = new int[3][3];

        System.out.println("Matriz 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz 2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplicacion de matrices: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((Matriz1[i][j] * Matriz2[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println("Suma de matrices: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((Matriz1[i][j] + Matriz2[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println("Traspuesta da la matriz 1: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatrizTraspuesta[j][i] = Matriz1[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(MatrizTraspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
