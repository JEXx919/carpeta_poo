import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Introduce la temperatura inicial en grados centígrados: ");
            int tempInicial = scanner.nextInt();

            System.out.print("Introduce la temperatura final en grados centígrados: ");
            int tempFinal = scanner.nextInt();

            // Validar que la temperatura final no sea menor que la inicial
            while (tempFinal < tempInicial) {
                System.out.println("La temperatura final no puede ser menor que la inicial. Inténtalo de nuevo.");
                System.out.print("Introduce la temperatura final en grados centígrados: ");
                tempFinal = scanner.nextInt();
            }

            System.out.println("------------------------------------");
            System.out.println("Centígrados\tFahrenheit");
            System.out.println("------------------------------------");

            for (int i = tempInicial; i <= tempFinal; i++) {
                double fahrenheit = (i * 9.0 / 5.0) + 32;
                System.out.printf("%d\t\t%.1f\n", i, fahrenheit);
            }

            System.out.println("------------------------------------");

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
