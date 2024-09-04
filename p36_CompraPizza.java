import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios de las pizzas
        final int PRECIO_CHICA = 5;
        final int PRECIO_MEDIANA = 10;
        final int PRECIO_GRANDE = 20;

        // Solicitar tamaño de la pizza
        System.out.println("Elige el tamaño de la pizza (chica, mediana, grande): ");
        String tamaño = scanner.nextLine().toLowerCase();

        // Solicitar cantidad de pizzas
        System.out.println("Elige la cantidad de pizzas: ");
        int cantidad = scanner.nextInt();

        // Calcular el precio total sin descuento
        int precioUnitario = 0;
        switch (tamaño) {
            case "chica":
                precioUnitario = PRECIO_CHICA;
                break;
            case "mediana":
                precioUnitario = PRECIO_MEDIANA;
                break;
            case "grande":
                precioUnitario = PRECIO_GRANDE;
                break;
            default:
                System.out.println("Tamaño no válido.");
                return;
        }

        int totalCompra = precioUnitario * cantidad;

        // Calcular descuento
        double descuento = 0;
        if (totalCompra > 2000) {
            descuento = totalCompra * 0.15;
        }

        double totalConDescuento = totalCompra - descuento;

        // Imprimir resultados
        System.out.println("Tamaño de la pizza: " + tamaño);
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total con descuento: $" + totalConDescuento);

        scanner.close();
    }
}
