//Ejercicio 6: Concatenar nombre completo
//Declara nombre y apellido.
//Crea un método nombreCompleto(String n, String a) que retorne el nombre completo.
//Imprime el resultado.

public class concatenar {
    public static void main(String[] args) {
        String nombre;
        String apellido;

        nombre = "Eduard";
        apellido = "Mora";

        nombreCompleto(nombre, apellido);

    }

    public static String nombreCompleto(String n, String a){
        String resultado = n + " " + a;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }
}
