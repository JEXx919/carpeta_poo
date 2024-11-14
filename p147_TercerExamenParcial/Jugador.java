package p147_TercerExamenParcial;


import java.io.Serializable;

public class Jugador implements Serializable{
    public String Nombre;
    public int edad;
    public char Sexo;
    public String EstadoCivil;
    public String Descripcion; 
    public double Salario;
    
    public Jugador() {}

    public Jugador(String nombre, int edad, char sexo, String estadoCivil, String descripcion, double salario) {
        Nombre = nombre;
        this.edad = edad;
        Sexo = sexo;
        EstadoCivil = estadoCivil;
        Descripcion = descripcion;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        EstadoCivil = estadoCivil;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    
    

    
    
}
