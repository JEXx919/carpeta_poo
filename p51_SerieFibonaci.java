import java.util.Scanner;

public class p51_SerieFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("¿Número de términos que deseas imprimir?: ");
            int n = scanner.nextInt();

            System.out.println("Los primeros " + n + " términos de la sucesión Fibonacci son:");
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
            }
            System.out.println();

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
