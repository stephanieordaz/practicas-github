public class EmpleadoAdministrativo extends Persona {
    float sueldoBase, isr;

    public EmpleadoAdministrativo(){
        System.out.println("se creo un objeto de la clase empleado admin");
    }
    public void altaTrabajador(String nom, String dom, String tel, String curp, String rfc, int ed, float sb, float sn,float isr){
        super.nombre=nom;
        super.domicilio=dom;
        super.telenofo=tel;
        super.curp=curp;
        super.rfc=rfc;
        super.edad=ed;
        this.sueldoBase=sb;
        this.sueldoNeto=sn;
        this.isr=isr;
    }
    public void altaTrabajador(){
        System.out.println("dando de alta un trabajador admin");
    }
}