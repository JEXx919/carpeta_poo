import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        double angulo1, angulo2, angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el tercer ángulo de un triángulo:\n");
        System.out.print("Dame el ángulo 1: ");
        angulo1 = obj.nextDouble();
        System.out.print("Dame el ángulo 2: ");
        angulo2 = obj.nextDouble();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println(String.format("\nPara un triángulo de ángulo 1: %.2f y un ángulo 2: %.2f, su ángulo 3 es: %.2f\n", angulo1, angulo2, angulo3));

        obj.close();
    }
}
