public class FactorialCalculator {

    // Método para calcular el factorial de un número
    public static long calculateFactorial(int n) {
        long result = 1; // Inicializar el resultado a 1
        for (int i = 1; i <= n; i++) { // Bucle desde 1 hasta n
            result *= i; // Multiplicar el resultado por el número actual
        }
        return result; // Devolver el resultado final
    }
}
