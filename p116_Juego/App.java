package p116_Juego;

public class App {
    public static void main(String[] args) {
         JuegoDados miDados = new JuegoDados();

         System.out.print("\033[H\033[2J");
         miDados.iniciar();
         miDados.jugar();
         miDados.finalizar();

         JuegoAdivina mAdivina = new JuegoAdivina();
         mAdivina.iniciar();
         mAdivina.jugar();
         mAdivina.finalizar();
    }

    
}
