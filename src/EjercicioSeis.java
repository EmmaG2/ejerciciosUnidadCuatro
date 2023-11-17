import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x, times = 0;


        System.out.println("Ingresa el valor de n: ");
        n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Ingresa los " + n + " números: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Ingresa el valor de x: ");
        x = sc.nextInt();

        for (int i = 0; i < n; i++) System.out.println(numbers[i]);

        System.out.println("Posiciones en las que aparece x: ");

        for (int i = 0; i < n; i++) {
            if (numbers[i] == x) {
                System.out.println(i);
                times++;
            }
        }

        System.out.println("Apariciones de x: " + times);

    }
}
