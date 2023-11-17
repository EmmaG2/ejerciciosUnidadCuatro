import java.util.Locale;
import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String[] descriptions = new String[5];
        String[] names = new String[5];
        double[] prices = new double[5];
        int[] stock = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre del producto");
            names[i] = sc.nextLine();

            System.out.println("Descripción del producto: ");
            descriptions[i] = sc.nextLine();

            System.out.println("Precio del produto: ");
            prices[i] = sc.nextDouble();
            sc.nextLine();

            System.out.println("Stock disponible: ");
            stock[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre: " + names[i]);
            System.out.println("Descripción: " + descriptions[i]);
            System.out.println("Precio: " + prices[i]);
            System.out.println("Stock: " + stock[i]);
            System.out.println();
        }
    }
}
