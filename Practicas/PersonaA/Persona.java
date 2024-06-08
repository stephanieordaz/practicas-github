public class Persona {

    String nombre, domicilio, telefono, curp, rfc;
    float sueldoNeto;
    int edad; 

    public Persona (){
        System.out.println();
    }
    public Persona(String nombre, String domicilio, String curp, int telefono, int rfc, int edad) {
        this.nombre = nom;
        this.domicilio = dom;
        this.curp = curp;
        this.telefono = tel;
        this.rfc = rfc;
        this.edad=ed;
}

    public float CalculodeSueldoNeto(float sb, float imp){
        sueldobase=sb;
       isr=imp;
       sueldoneto=sueldobase-isr;
 return sueldoneto;

}
}