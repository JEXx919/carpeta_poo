import java.util.Scanner;

public class p31_NumerosRomanos {

    public static void main(String[] args) {
        System.out.println("Convierte un número entero de entre 1 y 10 a número romano\n");
        System.out.print("Dame un número ? ");
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();
        scanner.close();

        switch (dia) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Número inválido !!!");
                break;
        }
        System.out.println("\n\nfin hasta la proxima");
    }
}
