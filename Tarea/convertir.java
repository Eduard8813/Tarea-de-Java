//Ejercicio 3: Convertir Celsius a Fahrenheit
//Declara una variable celsius.
//Crea un método convertirAFahrenheit(double c) usando la fórmula F = C * 9/5 + 32.
//Imprime el resultado.

public class convertir {
    
    public static void main(String[] args) {
        double celsius = getconvertirAFahrenheit(88);
        System.out.println("El valor de temperatura es " + celsius);
    }

    public static double getconvertirAFahrenheit(double c){
        double F;
        F = c * 9/5 + 32;
        return F ;
    }
}
