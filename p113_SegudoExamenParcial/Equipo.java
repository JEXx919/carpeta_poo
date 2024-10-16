package p113_SegudoExamenParcial;

public class Equipo {
    private String nombre;
    private String liga;
    private Jugador[] jugadores;
    private int numJugadores;

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        this.jugadores = new Jugador[20];
        this.numJugadores = 0;
    }

    public void agregarJugador(Jugador jugador) {
        if (numJugadores < jugadores.length) {
            jugadores[numJugadores] = jugador;
            numJugadores++;
        } else {
            System.out.println("No se pueden agregar más jugadores al equipo.");
        }
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public double getTotalBono() {
        double totalBono = 0;
        for (int i = 0; i < numJugadores; i++) {
            totalBono += jugadores[i].getBono();
        }
        return totalBono;
    }

    public double getTotalSalario() {
        double totalSalario = 0;
        for (int i = 0; i < numJugadores; i++) {
            totalSalario += jugadores[i].getSalario();
        }
        return totalSalario;
    }

    public int getTotalHombres() {
        int totalHombres = 0;
        for (int i = 0; i < numJugadores; i++) {
            if (jugadores[i].getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalMujeres() {
        int totalMujeres = 0;
        for (int i = 0; i < numJugadores; i++) {
            if (jugadores[i].getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println("Equipo [Nombre=" + nombre + ", Liga=" + liga + ", Jugadores=" + numJugadores + ", Bono=" + getTotalBono() + ", Total=" + (getTotalSalario() + getTotalBono()) + ", Hombres=" + getTotalHombres() + ", Mujeres=" + getTotalMujeres() + "]");
        for (int i = 0; i < numJugadores; i++) {
            System.out.println("- " + jugadores[i].toString());
        }
    }
}
