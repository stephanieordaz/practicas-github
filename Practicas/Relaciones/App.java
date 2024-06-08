import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Comparaciones comparacion = new Comparaciones(0, 0);
       System.out.println(comparacion.esMayorQue());
       System.out.println(comparacion.esMenorQue());
       System.out.println(comparacion.esIgualQue());
}
}