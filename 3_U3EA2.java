import java.util.Scanner;


/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        int a;
        int b;
        int res;
        
        a=tec.nextInt();
        b=tec.nextInt();
        res=a;
        
       for (int i=1; i<b; i++){
       
           res=res*a;
           
       }
       
        System.out.print(a+" elevado a "+b+" es igual a "+res);
       
    }
}
