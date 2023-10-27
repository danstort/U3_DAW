import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a, b, c5 = 0;
        
        for (int i = 0; i < 5; i++ ){
        
            a=tec.nextInt();
            b=a%5;
            
            if (b == 0) {
            c5++;
            }
            
        }
        System.out.print("Multiplos de 5: "+c5);
        }

    }
