import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int n1, n2, n3, n4, n5, n6, nM, nm;
        n1 = tec.nextInt();
        n2 = tec.nextInt();
        n3 = tec.nextInt();
        n4 = tec.nextInt();
        n5 = tec.nextInt();
        n6 = tec.nextInt();
        nM = 0;
        nm = n1;

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

        if (n6 > nM) {
            nM = n6;
        }

        if (n1 < nm) {
            nm = n1;
        }

        if (n2 < nm) {
            nm = n2;
        }

        if (n3 < nm) {
            nm = n3;
        }

        if (n4 < nm) {
            nm = n4;
        }

        if (n5 < nm) {
            nm = n5;
        }
        
        if (n6 < nm) {
            nm = n6;
        }

        System.out.print("El mayor es " + nM + " y el menor es " + nm);
    }
}
