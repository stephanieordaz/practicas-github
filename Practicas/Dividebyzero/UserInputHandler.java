import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandler {

    // Método para obtener un número entero no negativo del usuario
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        int number = -1; // Inicializar la variable para almacenar el número ingresado

        // Bucle para asegurar la entrada correcta del usuario
        while (true) {
            try {
                // Pedir al usuario que ingrese un número
                System.out.println("Ingrese un número entero no negativo para calcular su factorial:");
                number = scanner.nextInt(); // Leer el número ingresado por el usuario

                // Verificar si el número es no negativo
                if (number < 0) {
                    System.out.println("El número debe ser no negativo. Inténtelo de nuevo.");
                } else {
                    break; // Salir del bucle si la entrada es válida
                }
            } catch (InputMismatchException e) {
                // Capturar la excepción si la entrada no es un entero
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el búfer del scanner
            }
        }
        
        scanner.close(); // Cerrar el objeto Scanner
        return number; // Devolver el número ingresado
    }
}
