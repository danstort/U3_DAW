import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num1;
        int num2;
        int cont = 0;

        num1 = tec.nextInt();
        num2 = tec.nextInt();

        while (num2 != 0) {
            if (num2 > num1) {

                cont++;

            }
            num2 = tec.nextInt();

        }

        System.out.print("Hay "+cont+" mayores que "+num1);
    }
}
