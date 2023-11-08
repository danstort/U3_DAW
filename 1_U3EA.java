import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        String nom;
        int nota;

        Scanner tec = new Scanner(System.in);

        
        for (int i = 0; i < 3; i++) {

            nom = tec.next();
            nota = tec.nextInt();

            if (nota == 5 || nota == 6) {
                System.out.print(nom + " SUFICIENTE,");
            } else if (nota < 5) {
                System.out.print(nom + " SUSPENSO,");
            }

        }

    }
}
