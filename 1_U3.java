import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a,b;
        a = tec.nextInt();
        b = tec.nextInt();
        int suma, resta, mult;
        suma=a+b;
        resta=a-b;
        mult=a*b;
        System.out.print(suma+""+resta+""+mult);
    }
}
