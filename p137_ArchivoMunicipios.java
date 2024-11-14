import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p137_ArchivoMunicipios {
    public static void main(String[] args) {
        String[] deportes = {"Fútbol", "Béisbol", "Ciclismo", "Atletismo", "Natación", "Motociclismo"};
        String nombreArchivo = "deportes.txt";

        // Crear el archivo en la misma carpeta del código
        File archivo = new File(nombreArchivo);

        // Escribir en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (String deporte : deportes) {
                writer.write(deporte);
                writer.newLine();
            }
            System.out.println("Los datos han sido escritos en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Leer del archivo
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("Leyendo datos del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer del archivo: " + e.getMessage());
        }
    }
}
