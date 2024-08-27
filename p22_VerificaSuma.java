import java.util.Scanner;

/**
 * p22_VerificaSuma verifica si la suma de un numeros 1 y numero 2 es igual a numero 3
 */
public class p22_VerificaSuma {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Verificando si la suma de dos números es igual a un tercero");
        System.out.print("Dame número 1: "); 
        n1 = obj.nextInt();
        System.out.print("Dame número 2: "); 
        n2 = obj.nextInt();
        System.out.print("Dame número 3: "); 
        n3 = obj.nextInt();
        obj.close();

        if (n1 + n2 == n3) {
            System.out.println("Son iguales");
            System.out.println(n1 + " + " + n2 + " = " + n3);
        } else {
            System.out.println("Son distintos");
            System.out.println(n1 + " + " + n2 + " != " + n3);
        }

        System.out.println("\nGracias por utilizar este programa\n");
    }
}
