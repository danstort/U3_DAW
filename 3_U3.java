import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a, b, n;
        a=tec.nextInt();
        b=tec.nextInt();
        n = 0;
        
        for(int i = b; i>0 ;i--){
            
            n = n + a;
        
        }
        
        
        
        System.out.print("El resultado es "+n);
    }
}
