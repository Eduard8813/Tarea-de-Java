// Declaración de la clase principal llamada "tarea"
public class tarea {

    // Método principal: punto de entrada del programa
    public static void main(String[] args) {

        // Declaración de variables para almacenar información personal
        String Nombre, Apellido, Direccion, Correo, Cedula;
        Integer Edad, Numero;

        // Asignación de valores a las variables
        Nombre = "Eduard";
        Apellido = "Mora";
        Direccion = "Cuidad jardin";
        Correo = "Eduard123@gmail.com";
        Edad = 21;
        Cedula = "001-200903-1017J";
        Numero = 88136473;

        // Mensaje de presentación y espacio adicional en consola
        System.out.println("Hola, Mucho gusto" + " " + "Aqui te dejo mi tarea con mis datos personales.");
        System.out.println("");

        // Llamada a las funciones para mostrar los datos personales y numéricos
        Datos(Nombre, Apellido, Direccion, Correo, Cedula);
        Numeros(Edad, Numero);
    }

    // Método que recibe y muestra los datos personales
    public static void Datos(String Nombre, String Apellido, String Direccion, String Correo, String Cedula) {
        System.out.println("Mi nombre es: " + Nombre + " " + Apellido);
        System.out.println("Mi Direccion es: " + Direccion);
        System.out.println("Mi cedula es: " + Cedula);
        System.out.println("Mi correo es: " + Correo);
    }

    // Método que recibe y muestra la edad y el número de teléfono
    public static void Numeros(Integer Edad, Integer Numero) {
        System.out.println("Mi Edad es: " + Edad);
        System.out.println("Mi numero es: " + Numero);
    }
}
