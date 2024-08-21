import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        double radio, altura, volumen;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalcular el volumen de un cilindro:\n");
        System.out.print("Dame el radio del cilindro: ");
        radio = obj.nextDouble();
        System.out.print("Dame la altura del cilindro: ");
        altura = obj.nextDouble();

        volumen = Math.PI * (radio * radio) * altura;

        System.out.println(String.format("\nPara un cilindro con radio: %.2f y altura: %.2f, el volumen es: %.2f\n", radio, altura, volumen));

        obj.close();
    }
}
