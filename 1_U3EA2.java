import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int n;
        n=tec.nextInt();
        int op=0;
        
        for (int i = 0; i<=n; i++) {
        
            op=op+(i);
        }
        System.out.print(op);
    }
}
