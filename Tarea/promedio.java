//Ejercicio 8: Calcular promedio de tres notas
//Declara tres notas tipo double.
//Crea un método promedio(double n1, double n2, double n3) que retorne el promedio.
//Imprime el resultado con dos decimales.

public class promedio {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;

        nota1 = 68.9;
        nota2 = 45.9;
        nota3 = 32.99;
        double resultado;
        resultado = getpromedio(nota1, nota2, nota3);

        System.out.println("El promedio es: " + resultado);

    }

    public static double getpromedio(double n1, double n2, double n3){ 
    return  (n1 + n2 + n3) / 3;
    }
}
