//p34_NumeroMayor - Dados tres números enteros, verificar cual es el mayor.

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        float n1, n2, n3, max ;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();


        System.out.println("Dame el primero numero ?  "); n1 = obj.nextFloat();
        System.out.println("Dame el segundo numero ?  "); n2 = obj.nextFloat();
        System.out.println("Dame el tercer numero  ?  "); n3 = obj.nextFloat();

        max = Math.max(Math.max(n1, n2), n3);

        System.out.printf("La mayor    : %.2f \n",max);

    
    

        
    }
    
}