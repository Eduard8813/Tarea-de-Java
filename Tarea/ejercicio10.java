//Ejercicio 10: Multiplicar dos números enteros
//Declara dos int.
//Crea un método multiplicar(int a, int b) que retorne el resultado.
//Imprime: "El resultado de multiplicar [a] × [b] es: [resultado]"

public class ejercicio10 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado;

        numero1 = 12;
        numero2 = 13;

        resultado = getmultiplicar(numero1, numero2);
        System.out.println("El resultado de la multiplicacion de " + numero1 + " x " + numero2 + " es: " + resultado);


    }

    public static int getmultiplicar(int a, int b){
        return a * b;
    }
}
