import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n = tec.nextInt();
        if (n>0) {
            System.out.print("Es mayor que 0");
        
        } else if (n==0){
            System.out.print("Es 0");
        } else if (n<0) {
            
            System.out.print("Es menor que 0");
        
        }

    }
}
