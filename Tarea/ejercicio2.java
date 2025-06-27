//Ejercicio 2: Sumar dos números
//Declara dos variables int.
//Crea un método sumar(int a, int b) que retorne la suma.
//Imprime el resultado con mensaje.

public class ejercicio2{
    public static void main(String[] args) {
        int a;
        int b;

        a = 8;
        b = 8;

    System.out.println("La suma total es: " + getsuma(a, b));
    }

    public static int getsuma(int a, int b){
    return a + b;
}
}