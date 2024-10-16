package p113_SegudoExamenParcial;

public abstract class Jugador {
    private String nombre;
    private char sexo;
    private String descripcion;
    private double salario;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public abstract double getBono();

    public double getSalario() {
        return salario;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Jugador [Nombre=" + nombre + ", Sexo=" + sexo + ", Descripcion=" + descripcion + ", Salario=" + salario + "]";
    }
}
