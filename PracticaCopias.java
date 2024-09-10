import java.util.Scanner;

public class PracticaCopias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables para el total de ventas y copias
        int ventasRealizadas = 0;
        int totalCopias = 0;
        double totalVentas = 0;

        // Variables para contar las ventas por tipo
        int totalCarta = 0, totalOficio = 0, totalDobleOficio = 0;
        double montoCarta = 0, montoOficio = 0, montoDobleOficio = 0;

        String continuar;

        System.out.println("---------------------------------");
        System.out.println("Papelería del papu brayan, SA. de CV.");
        System.out.println("Sistema de ventas");
        System.out.println("---------------------------------");

        // Estructura do-while para ingresar ventas
        do {
            ventasRealizadas++;

            System.out.println("Venta: " + ventasRealizadas);
            System.out.print("Tipo de copia (C)arta $3, (O)ficio $4, (D)oble Of. $6? ");
            char tipoCopia = sc.next().toUpperCase().charAt(0);
            
            System.out.print("Cantidad ? ");
            int cantidad = sc.nextInt();

            // Variables para precios por tipo
            int precioCarta = 3, precioOficio = 4, precioDobleOficio = 6;

            // Actualizar contadores según el tipo de copia
            switch (tipoCopia) {
                case 'C':
                    totalCarta += cantidad;
                    montoCarta += cantidad * precioCarta;
                    totalVentas += cantidad * precioCarta;
                    break;
                case 'O':
                    totalOficio += cantidad;
                    montoOficio += cantidad * precioOficio;
                    totalVentas += cantidad * precioOficio;
                    break;
                case 'D':
                    totalDobleOficio += cantidad;
                    montoDobleOficio += cantidad * precioDobleOficio;
                    totalVentas += cantidad * precioDobleOficio;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    ventasRealizadas--;  // Para no contar la venta inválida
                    break;
            }

            totalCopias += cantidad;

            // Preguntar si se desea hacer otra venta
            System.out.print("Otra venta (S/N) ? ");
            continuar = sc.next().toUpperCase();

        } while (continuar.equals("S"));

        // Mostrar resumen de ventas sin usar arreglos
        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Ventas realizadas: " + ventasRealizadas);
        System.out.println("-------------------------");

        // Mostrar las ventas de cada tipo de copia
        System.out.println("Carta : " + totalCarta + " - $ " + montoCarta);
        System.out.println("Oficio : " + totalOficio + " - $ " + montoOficio);
        System.out.println("Doble Of. : " + totalDobleOficio + " - $ " + montoDobleOficio);

        System.out.println("-------------------------");
        System.out.println("Tot. Ventas : " + totalCopias + " - $ " + totalVentas);

        // Mostrar mensaje según el total de ventas
        if (totalVentas < 50) {
            System.out.println("venta moderada");
        } else if (totalVentas >= 50 && totalVentas <= 100) {
            System.out.println("venta frecuente");
        } else {
            System.out.println("venta superada");
        }

        sc.close();
    }
}
