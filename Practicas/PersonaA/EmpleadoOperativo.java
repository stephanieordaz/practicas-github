import javax.swing.JOptionPane;

  public class EmpleadoOperativo extends Persona{
  float sueldobase, horastrabajadas, precioporhora;

  public EmpleadoOperativo(){
    System.out.println("se creo un objeto de la clase empleado oper");
  }
  
  public void altaTrabajador(String nom,String dom,String tel,String curp, String rfc, int ed, float sb,float sn, float pph,float ht){
   super.nombre=nom;
   super.domicilio=dom;
   super.telefono=tel;
   super.curp=curp;
   super.rfc=rfc;
  super.edad=ed;
  this.sueldobase=sb;
  this.precioporhora=pph;
  this.horastrabajadas=ht;
 }

 public void listarDatos(){
 JOptionPane.showMessageDialog(null, "Datos del Empleado \n"
 +"Nombre: "+ nombre+"\n Domicilio: " + domicilio
 +"\n Teléfono: "+ telefono
 +"\n CURP: "+ curp
 +"\n RFC: "+ rfc
 +"\n Edad: "+ edad
 +"\n Sueldo Base: "+ sueldobase
 +"\n Horas Trabajadas: "+ horastrabajadas
  +"Precio por Hora: "+ precioporhora
  +"Sueldo Neto: "+ sueldoneto);
}
}