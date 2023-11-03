import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        double par = 0;
        int cPar = 0;

        double Im = 0;
        int cIm=0;

        int cZ = 0;

        double num = 0;

        while (num != -1) {

            num = tec.nextDouble();

            if (num == 0) {

                cZ++;

            } else if (num % 2 == 0) {

                par = par + num;
                cPar++;

            } else if (num % 2 != 0 && num != -1){

                Im = Im + num;
                cIm++;

            }

        }
        String a = String.format("%.2f", par / cPar);
        String b = String.format("%.2f", Im / cIm);
        System.out.print("La media de los numeros pares es " + a + ".La media de los numeros impares es " + b + ".El numero de ceros es "+cZ);

    }
}
