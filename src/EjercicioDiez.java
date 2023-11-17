import java.util.Random;

public class EjercicioDiez {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[5][5];
        int diagonal1 = 0, diagonal2 = 0, lastRow = 0;
        double mean = 0;

        for (int i = 0; i < 5; i++) for (int j = 0; j < 5; j++) matriz[i][j] = random.nextInt(0, 40);

        System.out.println("Matriz original: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) System.out.print(matriz[i][j] + " ");
            System.out.println();
        }

        for (int i = 0; i < 5; i++) for (int j = 0; j < 5; j++) mean += matriz[i][j];
        mean /= 25;

        System.out.println("Promedio: " + mean);

        System.out.println("Mostrando solo pares: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) System.out.print(matriz[i][j] % 2 == 0 ? matriz[i][j] + " " : "x ");
            System.out.println();
        }

        for (int i = 0; i < 5; i++) diagonal1 += matriz[i][i];
        for (int x = 0; x < 5; x++) for (int k = 4; k >= 0; k--) if (x + k == 4) diagonal2 += matriz[k][x];
        for (int l = 0; l < 5; l++) lastRow += matriz[4][l];

        System.out.println("Primera diagonal: " + diagonal1);
        System.out.println("Segunda diagonal: " + diagonal2);
        System.out.println("Última fila: " + lastRow);

    }
}
