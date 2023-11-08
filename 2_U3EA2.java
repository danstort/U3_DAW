public class Ejercicio2 {

    public static void main(String[] args) {
        int par=0;
        int impar=0;
        
        for (int i=2; i<=100; i+=2){
        
        par=par+i;
            
        }
        
        for (int i=1; i<=100; i+=2){
        
        impar=impar+i;
            
        }
        
        System.out.print("Pares suman "+par+" e impares suman "+impar);
    }
}
