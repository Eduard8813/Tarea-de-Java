//Ejercicio 5: Mostrar el doble de un número
//Declara una variable numero.
//Crea un método doble(int n) que retorne el doble.
//Imprime: "El doble de [n] es [resultado]"

public class ejercicio5 {
    public static void main(String[] args) {
        int numero;
        numero = 6;
        int resultado;
        resultado = doble(numero);

        System.out.println("El doble de " + numero + " es " + resultado);

    }

    public static int doble(int n) { 
         return n * 2;
    }
}
