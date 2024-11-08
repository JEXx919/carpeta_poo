package p113_SegudoExamenParcial;

public class JugadorActivo extends Jugador {
    private int partidos;
    private int goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        this.partidos = partidos;
        this.goles = goles;
    }

    @Override
    public double getBono() {
        return (getSalario() * 0.10) + (partidos * 50) + (goles * 5);
    }

    public int getGoles() {
        return goles;
    }

    @Override
    public String toString() {
        return "JugadorActivo [" + super.toString() + ", Partidos=" + partidos + ", Goles=" + goles + ", Bono=" + getBono() + ", Total=" + (getSalario() + getBono()) + "]";
    }
}
