import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[4];
        String[] diseases = new String[4];
        String[] specialistAsigned = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa tu nombre: ");
            names[i] = sc.next();

            System.out.println("Ingresa tu enfermedad: ");
            diseases[i] = sc.next();
            specialistAsigned[i] = getSpecialist(diseases[i]);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Nombre: " + names[i]);
            System.out.println("Especialista asignado: " + specialistAsigned[i]);
        }
    }

    public static String getSpecialist(String disease) {
        if (disease.equals("Gastritis")) return "Especialista de gastro";
        if (disease.equals("Carie")) return "Odontologo";
        if (disease.equals("Esquizofrenia")) return "Psicólogo";
        if (disease.equals("Juanetes")) return "Podólogo";

        return "Lamentablemente por el momento no hay un especialista que pueda atender tu enfermedad";
    }
}