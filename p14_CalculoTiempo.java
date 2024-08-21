import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {
        double dias, minutos, segundos, horas; 

        Scanner obj = new Scanner(System.in);
        System.out.println("\nCalculando el equivalente\n");
        System.out.print("Dame las horas: ");
        horas = obj.nextDouble();

        dias = horas / 24;
        minutos = horas * 60;
        segundos = horas * 3600;

        System.out.println(String.format("Estas horas %.2f en días son %.2f, en minutos son %.2f y en segundos son %.2f", horas, dias, minutos, segundos));

        obj.close();
    }
}
