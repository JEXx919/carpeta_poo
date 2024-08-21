import java.util.Scanner;

public class p06_PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cal1, cal2, cal3, prom;
        float sum = 0;
        float max = -1, min = 11;

        System.out.println("Calculando el promedio de tres calificaciones, calculando también la mayor y la menor.\n");
        System.out.print("Dame calificación 1: "); cal1 = sc.nextFloat();
        System.out.print("Dame calificación 2: "); cal2 = sc.nextFloat();
        System.out.print("Dame calificación 3: "); cal3 = sc.nextFloat();

        sum = cal1 + cal2 + cal3;
        prom = sum / 3;
        min = Math.min(Math.min(cal1, cal2), cal3);
        max = Math.max(Math.max(cal1, cal2), cal3);

        System.out.printf("\nLas calificaciones introducidas son: %.2f, %.2f, %.2f\n", cal1, cal2, cal3);
        System.out.printf("La suma: %.2f\n", sum);
        System.out.printf("El promedio: %.2f\n", prom);
        System.out.printf("La menor: %.2f\n", min);
        System.out.printf("La mayor: %.2f\n", max);

        sc.close();
    }
}
