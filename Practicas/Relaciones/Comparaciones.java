public class Comparaciones implements EjemploInterfaces {
    int numero1;
    int numero2;
    public Comparaciones(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public boolean esMayorQue(){
        if (this.numero1 <= this.numero2){
            return false;
        }
        return true;
    }

    public boolean esMenorQue(){
        if (this.numero1 >= this.numero2){
            return false;
        }
        return true;
    }
}