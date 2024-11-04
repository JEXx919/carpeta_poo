package p120_Vehiculo;
public class App {
    public static void main(String[] args) {
        Sedan miSedan = new Sedan("Vochito", "Maria Diaz", 4);
        Suv miSuv = new Suv("La mamalona", "Carlos Castañeda", 6);

        System.out.print("\033[H\033[2J");
        System.out.println(miSedan.toString());
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTest();
        miSedan.chasisMonocasco();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();
        System.out.println("");

        System.out.println(miSuv.toString());
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.Traccion4x4();
        miSuv.chasisIndepiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
    }
    
}
