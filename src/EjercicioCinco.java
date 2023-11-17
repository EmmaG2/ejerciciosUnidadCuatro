import java.util.Arrays;
import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, total = 0;

        System.out.println("Ingresa el valor de n: ");
        n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Ingresa los " + n + " números: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            total += numbers[i];
        }

        Arrays.sort(numbers);

        System.out.println("Mínimo: " + numbers[0]);
        System.out.println("Máximo: " + numbers[n - 1]);
        System.out.println("Media: " + (total / n));

    }
}
