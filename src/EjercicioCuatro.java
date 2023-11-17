import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] animalsNames = new String[6];
        double[] animalsWeights = new double[6];
        double total = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Nombre del animal: ");
            animalsNames[i] = sc.next();

            System.out.println("Peso del animal: ");
            animalsWeights[i] = sc.nextDouble();
            total += animalsWeights[i];
        }

        System.out.println("Animales: ");
        for (int i = 0; i < 6; i++) System.out.println(animalsNames[i]);
        System.out.println();

        System.out.println("Pesos: ");
        for (int i = 0; i < 6; i++) System.out.println(animalsWeights[i]);
        System.out.println();

        System.out.println("Total: " + total);
    }
}
