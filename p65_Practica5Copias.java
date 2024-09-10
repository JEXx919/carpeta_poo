import java.util.Scanner;

public class p65_Practica5Copias {
    public static void main(String[] args) {
        // Variables
        char Tamaño, resp;
        int cantidad, preciototal, carta, oficio, doble, cantcarta, cantoficio, cantdoble;
        Scanner obj = new Scanner(System.in);
        
        cantidad = preciototal = carta = oficio = doble = cantcarta = cantoficio = cantdoble = 0;
        System.out.print("\033[H\033[2J"); System.out.flush();

        // Encabezado del sistema
        System.out.println("-------------------------------------");
        System.out.println("Papelería SA. de CV.");
        System.out.println("Sistema de ventas");
        System.out.println("-------------------------------------");

        // Ciclo do-while para múltiples ventas
        do {
            // Solicitar al usuario que copia nesesita
            System.out.print("Tipo de copia (C)arta $3, (O)ficio $4, (D)oble Of. $6? ");
            Tamaño = obj.next().toUpperCase().charAt(0);

            // Solicitar la cantidad de copias
            System.out.print("Cantidad de copias: ");
            cantidad = obj.nextInt();

            // Precios fijos de las copias
            int precioCarta = 3, precioOficio = 4, precioDobleOficio = 6;

            // Lógica del switch para determinar tipo de copia y calcular total
            switch (Tamaño) {
                case 'C':
                    cantcarta += cantidad;  // Sumar a la cantidad total de copias tipo Carta
                    carta += cantidad * precioCarta;  // Calcular el monto de las copias tipo Carta
                    preciototal += cantidad * precioCarta;  // Actualizar el total de ventas
                    break;
                case 'O':
                    cantoficio += cantidad;  // Sumar a la cantidad total de copias tipo Oficio
                    oficio += cantidad * precioOficio;  // Calcular el monto de las copias tipo Oficio
                    preciototal += cantidad * precioOficio;  // Actualizar el total de ventas
                    break;
                case 'D':
                    cantdoble += cantidad;  // Sumar a la cantidad total de copias tipo Doble Oficio
                    doble += cantidad * precioDobleOficio;  // Calcular el monto de las copias tipo Doble Oficio
                    preciototal += cantidad * precioDobleOficio;  // Actualizar el total de ventas
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            // Preguntar si desea realizar otra venta
            System.out.print("¿Desea realizar otra venta? (S/N): ");
            resp = obj.next().toUpperCase().charAt(0);

        } while (resp == 'S');

        // Mostrar el resumen de ventas
        System.out.println("---------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("---------------------------------------");
        System.out.println("Copias Carta: " + cantcarta + " - $ " + carta);
        System.out.println("Copias Oficio: " + cantoficio + " - $ " + oficio);
        System.out.println("Copias Doble Oficio: " + cantdoble + " - $ " + doble);
        System.out.println("-------------------------");
        System.out.println("Total de copias: " + (cantcarta + cantoficio + cantdoble));
        System.out.println("Monto total: $ " + preciototal);

        // Mostrar mensaje según el total de ventas
        if (preciototal < 50) {
            System.out.println("Venta moderada");
        } else if (preciototal >= 50 && preciototal <= 100) {
            System.out.println("Venta frecuente");
        } else {
            System.out.println("Venta superada");
        }

        obj.close();
    }
}
