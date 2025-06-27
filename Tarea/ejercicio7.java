//Ejercicio 7: Calcular el perímetro de un cuadrado
//Declara una variable lado.
//Crea un método perimetro(int lado) que retorne el perímetro (4 × lado).
//Imprime: "El perímetro del cuadrado es: [resultado]"

public class ejercicio7 {
    public static void main(String[] args) {
        int lado;
        lado = 77;

        getperimetro(lado);
        System.out.println("El perimetro del cuadrado es: " + getperimetro(lado));
    }

    public static int getperimetro(int lado){
        int resultado;
        resultado = 4 * lado;
        return resultado;
    }
}
