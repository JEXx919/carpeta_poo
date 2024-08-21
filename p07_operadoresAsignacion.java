import java.util.Scanner;

public class p07_operadoresAsignacion {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); // Borrar pantalla de la consola

        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un número: ");
        float num = sc.nextFloat();
        sc.close();

        System.out.printf("El número original es: %.2f \n", num);
        System.out.printf("Incrementar 1: %.2f \n", ++num);
        System.out.printf("Sumar 80: %.2f \n", num += 80);
        System.out.printf("Restar 35: %.2f \n", num -= 35);
        System.out.printf("Multiplicar por 15: %.2f \n", num *= 15);
        System.out.printf("Dividir entre 4: %.2f \n", num /= 4);
        System.out.printf("Decrementar 1: %.2f \n", --num);
    }
}
