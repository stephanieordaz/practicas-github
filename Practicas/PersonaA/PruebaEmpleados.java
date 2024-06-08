import javax.swing.JOptionPane;
public class PruebaEmpleados {
    public static void main(String[] args) {
        int op;
        String nom, dom, tel, curp, rfc;
        float sb, sn, imp, pph;
        int ed, ht;
    EmpleadoAdministrativo EA1= new EmpleadoAdministrativo();
    EmpleadoOperativo EO1= new EmpleadoOperativo();
    Scanner tec= new Scanner(System.in);

 while (true){
    op=Integer.parseInt(JOptionPane.showInputDialog("Menú de Opciones\n" + 1.- "Alta Empleado Operativo\n " + 
    2.- "Cálculo de Sueldo Empleado Administrativo\n" +
    3.- "Listar datos Empleado Operativo\n"
    + 4.- "Salir"));
 
    switch(op){
    case 1:
 nom=JOptionPane.showInputDialog("Nombre del Empleado: ");
 ed=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
 dom=JOptionPane.showInputDialog("Domicilio: "); 
 tel=JOptionPane.showInputDialog("Teléfono: ");
 ht=Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas:")); 
 pph=Float.parseFloat(JOptionPane.showInputDialog("Precio por Hora:")); 
 curp=JOptionPane.showInputDialog("CURP: ");
 rfc=JOptionPane.showInputDialog("RFC: ");
 sn=ht*pph;
 EO1.altaTrabajador(nom,dom,tel,curp, rfc, ed, sn, sn, pph, sn); 
 break;
    case 2:
 sb=Float.parseFloat(JOptionPane.showInputDialog("Sueldo base:"));
 imp=sb*.32f;
 JOptionPane.showMessageDialog(null,"El Sueldo Neto del Empleado es: "+EA1.CalculodeSueldoNeto(sb, imp));
 break;
    case 3:
 EO1.listarDatos();
 break;
 case 4:
 System.exit(0);

}
}
}
}
