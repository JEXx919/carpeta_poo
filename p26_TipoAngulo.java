
import java.util.Scanner;

public class p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("dame un angulo entre 0 y 360 y te dire su tipo");
        int angulo = new Scanner(System.in).nextInt();

        if (angulo < 0 || angulo > 360) {
            System.out.println("de cual fumaste");

        } else {
            System.out.println("el tipo de angul es: ");
            if (angulo < 90)
                System.out.println("Agudo");
            if (angulo == 90)
                System.out.println("recto");
            if (angulo > 90 && angulo < 180)
                System.out.println("obtuso");
            if (angulo == 180)
                System.out.println("llano");
            if (angulo > 180)
                System.out.println("concavo");
            if (angulo == 360)
                System.out.println("completo");
        }
        System.out.println("clean");

    }

}
