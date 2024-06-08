
public class App {

    
    public static void main(String[] args) {
        
        int number = UserInputHandler.getNonNegativeInteger();
        long factorial = FactorialCalculator.calculateFactorial(number);
        System.out.println("El factorial de " + number + " es " + factorial);
    }
}
