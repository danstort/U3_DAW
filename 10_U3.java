public class Ejercicio10 {

    public static void main(String[] args) {

        int cont = 0;
        int a = 0;  //almacena los distintos números evaluados

        while (cont < 5) {

            int cal;
            cal = a % 2;    //resto del número almacenado actualmente
                            //Si el resto de "a" es distinto de cero(Impar), imprime el número por pantalla
            if (cal != 0) {
                System.out.print(a+" ");
                cont++;
            }
            a++;

        }
        
    }
}
