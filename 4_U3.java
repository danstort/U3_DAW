import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n, op;
        n = tec.nextInt();
        op = n % 2;

        if (op == 0) {
            System.out.print("Es par");
        } else {
            System.out.print("Es impar");
        }

    }

}
