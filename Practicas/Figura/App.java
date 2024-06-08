public class App {
   
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(null, 0, 0);
        Circulo circulo = new Circulo(null, 0);
        Rectangulo rectangulo = new Rectangulo(null, 0);

        triangulo.Area();
        circulo.Area();
        rectangulo.Area();
    }
}
