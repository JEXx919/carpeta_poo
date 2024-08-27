//p27_AceptarEstudiante - Acepta un estudiante en base a su edad y dos calificaciones

import java.util.Scanner;

public class p27_AceptarEstudiante {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double c1, c2;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Universidad patito \n sistema de Admision\n");
        System.out.print("Dame tu nombre ? ");
        nombre = obj.nextLine();
        System.out.print("Dame tu edad ? ");
        edad = obj.nextInt();

        if (edad < 18)
            System.out.println("No aceptamos menores de edad en esta universidad \n");

        else {
            System.out.println("Dame tu calificacion 1 ? ");
            c1 = obj.nextFloat();
            System.out.println("Dame tu calificacion 2 ? ");
            c2 = obj.nextFloat();
            if (c1 < 8 || c2 < 8)
                System.out.println("\nNo tiene el promedio para estar emn esta Universidad");
            else
                System.out.printf("%s Bienvenido a la Universidad siente como en tu casa  cal %.2f y %.2f  lo permiten",
                        nombre, c1, c2);
        }

        System.out.println("\nGracias por usar este sistema...");

    }
}