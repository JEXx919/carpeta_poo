import java.util.Scanner;

public class p12_ConvertirTemperatura {

    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nConvertir grados Fahrenheit a Celsius:\n");
        System.out.print("Dame los grados Fahrenheit: ");
        fahrenheit = obj.nextDouble();

        celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println(String.format("\nPara convertir unos grados Fahrenheit: %.2f a grados Celsius: %.2f\n", fahrenheit, celsius));

        obj.close();
    }
}
