import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        double[] notes = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: ");
            names[i] = sc.nextLine();

            System.out.println("Calificacion: ");
            notes[i] = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: " + names[i]);
            System.out.println("Calificación: " + notes[i]);
            System.out.println();
        }
    }
}
