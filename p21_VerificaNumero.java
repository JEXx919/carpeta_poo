import java.util.Scanner;

public class p21_VerificaNumero {
    public static void main(String[] args) {
        System.out.println("Verifica si un número es positivo, negativo o cero\n");
        System.out.print("Dame un número: ");
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n > 0) {
            System.out.println("El número es POSITIVO");
        } else if (n < 0) {
            System.out.println("El número es NEGATIVO");
        } else {
            System.out.println("El número es CERO");
        }

        System.out.println("\nGracias por utilizar este programa\n");
    }
}
