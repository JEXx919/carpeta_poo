//p33_NumerosConsecutivos - Dados tres números enteros, verificar si son consecutivos (9,10,11) y mandar mensaje confirmándolo, si no lo son


import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        
        int n1, n2, n3 ;
        Scanner obj = new Scanner(System.in);


        System.out.println("Dame el primero numero ?  "); n1 = obj.nextInt();
        System.out.println("Dame el segundo numero ?  "); n2 = obj.nextInt();
        System.out.println("Dame el tercer numero  ?  "); n3 = obj.nextInt();

        
        if (n1 + 1 == n2  && n2 + 1 == n3) {
            System.out.println(String.format("Los numeros dados son consecutivos %d, %d, %d ",n1,n2,n3));
        }
        else 
        {
            System.out.println("los chilaquiles se enfrian no es consecutivo");
        }

    }
}