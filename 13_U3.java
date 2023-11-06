import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        double numH = 0;
        double numM = 0;
        double numT = 0;
        String nomH;
        char s;

        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            nomH = tec.next();
            s = tec.next().charAt(0);

            if (s == 'h') {

                numH++;

            } else if (s == 'm') {

                numM++;

            }

            
            
        }
        numT = numH + numM;
            
            double porH = (numH*100)/numT;
            double porM = (numM*100)/numT;
            System.out.printf("Porcentaje Mujeres %.2f%%.Porcentaje Hombres %.2f%%", porM, porH);

        
    }
}
