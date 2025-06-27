//Ejercicio 4: Calcular el área de un rectángulo
//Declara base y altura.
//Crea un método area(double b, double h) que retorne el área.
//Imprime el resultado con unidades.

public class ejercicio4 {
    public static void main(String[] args) {
        double base;
        double altura;

        base = 10;
        altura = 10;

        System.out.println("El resultado del area fue: " + getarea(base, altura));

    }

    public static double getarea(double b, double h){
        double Area;
        Area = b * h;
        return Area;
    }
}
