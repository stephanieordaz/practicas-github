public class Triangulo extends Figura {
    double base;
    double altura;

    public Triangulo(String nombre, double base, double altura){
        super(nombre, area:0);
        this.base = base;
        this.altura = altura;
    }

}