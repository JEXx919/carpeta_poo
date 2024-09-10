//jesus Ibarr Valdez _ jIV
import java.util.Scanner;

public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rechazadosTotales = 0;
        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0;
        int totalHombres = 0, totalMujeres = 0;
        int dineroRecaudadoAlumnos = 0, dineroRecaudadoDocentes = 0, dineroRecaudadoTrabajadores = 0;
        int sumaEdades = 0;
        int totalParticipantes = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        
        System.out.println("-------------------------------------");
        System.out.println("Curso Programacion Avanzada");
        System.out.println("Sistema de INscripcciones");
        System.out.println("-------------------------------------");

        while (true) {
            System.out.println("Ingrese el nombre del participante (o 's' para terminar y salir): ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("s"))
                break;

            System.out.println("Ingrese la edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el sexo del participante (Hombre/ Mujers): ");
            String sexo = scanner.nextLine();

            System.out.println("Ingrese el tipo de participante (Alumno / Docente / Trabajador/): ");
            String tipo = scanner.nextLine();

            if (edad < 23) {
                rechazadosTotales++;
                System.out.println("El participante " + nombre + " ha sido rechazado por ser menor de 23 años.");
                continue;
            }

            sumaEdades += edad;
            totalParticipantes++;

            switch (tipo.toLowerCase()) {
                case "alumno":
                    totalAlumnos++;
                    dineroRecaudadoAlumnos += 40;
                    break;
                case "docente":
                    totalDocentes++;
                    dineroRecaudadoDocentes += 60;
                    break;
                case "trabajador":
                    totalTrabajadores++;
                    dineroRecaudadoTrabajadores += 80;
                    break;
            }

            if (sexo.equalsIgnoreCase("Hombre")) {
                totalHombres++;
            } else if (sexo.equalsIgnoreCase("Mujer")) {
                totalMujeres++;
            }

            System.out.println("Bienvenido " + nombre + ", edad: " + edad + ", sexo: " + sexo + ", tipo: " + tipo);
        }

        double promedioEdad = totalParticipantes > 0 ? (double) sumaEdades / totalParticipantes : 0;
        int dineroTotalRecaudado = dineroRecaudadoAlumnos + dineroRecaudadoDocentes + dineroRecaudadoTrabajadores;

        System.out.println("\nResumen de Inscripciones:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres: " + totalHombres);
        System.out.println("Total de Mujeres: " + totalMujeres);
        System.out.println("Total de Participantes: " + totalParticipantes);
        System.out.println("Promedio de Edad de los Participantes: " + promedioEdad);
        System.out.println("Total de Rechazados: " + rechazadosTotales);
        System.out.println("Dinero Total Recaudado de Alumnos: $" + dineroRecaudadoAlumnos);
        System.out.println("Dinero Total Recaudado de Docentes: $" + dineroRecaudadoDocentes);
        System.out.println("Dinero Total Recaudado de Trabajadores: $" + dineroRecaudadoTrabajadores);
        System.out.println("Dinero Total Recaudado: $" + dineroTotalRecaudado);

        if (dineroTotalRecaudado < 50) {
            System.out.println("El evento concluye con ganancias BAJAS.");
        } else if (dineroTotalRecaudado >= 50 && dineroTotalRecaudado < 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS.");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias.");
        }
    }
}
