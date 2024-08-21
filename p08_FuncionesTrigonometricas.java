import java.util.Scanner;

public class p08_FuncionesTrigonometricas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un ángulo en Grados: ");
        double angulog = sc.nextDouble();
        sc.close();
        
        double angulor = Math.toRadians(angulog);
        double sen = Math.sin(angulor);
        double cos = Math.cos(angulor);
        double tan = Math.tan(angulor);
        
        System.out.println(String.format("El ángulo en radianes es: %.2f, Seno: %.2f, Coseno: %.2f, Tangente: %.2f", angulor, sen, cos, tan));
    }
}
