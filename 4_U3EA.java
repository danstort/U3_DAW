import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        int num;
        int cont = 0;

        num = tec.nextInt();

        while (num != -1) {

            System.out.print(num + "x0=" + (num * 0) + ", "+num + "x1=" + (num * 1) + ", " + num + "x2=" + (num * 2) + ", " + num + "x3=" + (num * 3)+", " + num + "x4=" + (num * 4)+", " + num + "x5=" + (num * 5)+", " + num + "x6=" + (num * 6)+", " + num + "x7=" + (num * 7)+", " + num + "x8=" + (num * 8)+", " + num + "x9=" + (num * 9)+", " + num + "x10=" + (num * 10)+",");
            num = tec.nextInt();

        }

    }
}
