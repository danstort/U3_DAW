import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int n1, n2, n3, n4, n5, nM;
        n1 = tec.nextInt();
        n2 = tec.nextInt();
        n3 = tec.nextInt();
        n4 = tec.nextInt();
        n5 = tec.nextInt();
        nM = 0;

        if (n1 > nM) {
            nM = n1;
        }

        if (n2 > nM) {
            nM = n2;
        }
        
        if (n3 > nM) {
            nM = n3;
        }
        
        if (n4 > nM) {
            nM = n4;
        }
        
        if (n5 > nM) {
            nM = n5;
        }
        
        System.out.println("El mayor es "+nM);
    }
}
