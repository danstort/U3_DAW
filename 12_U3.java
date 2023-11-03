import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        
       int num = 0; 
       int c2 = 0;
       int c3 = 0;
       int c6 = 0;
       
       Scanner tec = new Scanner(System.in);
       
       for (int i = 0; i<5; i++) {
       
           num = tec.nextInt();
           
           if (num%2 == 0){
           
               c2++;
               
           } else if (num%3 == 0) {
           
               c3++;
               
           } else if (num%6 == 0){
           
               c6++;
               
           }
           
           
           
       
       }
       
       System.out.print("Multiplos de 6: "+c6+".Multiplos de 3: "+c3+".Multiplos de 2: "+c2);
    }
}
