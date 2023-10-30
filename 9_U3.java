public class Ejercicio9 {

    public static void main(String[] args) {
       
        int cont = 0;
        
        for(int i = 0; i < 5; i++){
        
            int a = i%2;
            if (a==0){
            cont++;
            }
        }
        System.out.print("Cantidad de números pares:"+cont);
    }
}
