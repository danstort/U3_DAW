import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int ap, sus, n;
        ap = 0;
        sus = 0;

        for (int i = 0; i < 5; i++) {
            n = tec.nextInt();

            if (n >= 5) {
                ap++;
            } else {

                sus++;

            }
        }
        
        System.out.print("Aprobados "+ap+" Suspensos "+sus);
    }
}
