public class Figura {
    String nombre;
    double area;

    public Figura(){
        system.out.println("se creo una figura");
    }

    public Figura (String nombre, double area){
        this.nombre = nombre;
        this.area = area;
    }

    public void Area (){
        System.out.println("el area de la figura " + nombre + "es: " + area);
    }

    public void Dibujarfigura(){
        system.out.println("dibujar figura " +nombre);
    }
}