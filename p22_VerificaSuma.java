import java.util.Scanner;

/**
 * p22_VerificaSuma verifica si la suma de un numeros 1 y numero 2 es igual a numero 3
 */
public class p22_VerificaSuma {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("verificando si la suma de dos numeros es igual a un tercero");
        System.out.print("dame numero 1 : "); n1 = obj.nextInt();
        System.out.print("dame numero 2 : "); n2 = obj.nextInt();
        System.out.print("dame numero 3 : "); n3 = obj.nextInt();


        if (n1 + n2 == n3) {
            System.out.println("son iguales");
            System.out.println(n1 + " + " + n2 + " = " + n3 );

            
        }
        else
        {
            System.out.println("son distintos");
            System.out.println(n1 + " + " + n2 + " != " + n3 );
        }

        



    }
    
}
