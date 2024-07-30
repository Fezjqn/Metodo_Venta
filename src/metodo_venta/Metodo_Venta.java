
package metodo_venta;

import javax.swing.JOptionPane;


public class Metodo_Venta {


    public static void main(String[] args) {
        
        int can = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de productos a vender: "));
        int pre = Integer.parseInt(JOptionPane.showInputDialog("Ingresar precio dl producto: "));
        
        // creqación del objeto y de la instancia
        Venta cal = new Venta();
        
        //llamado al método, pero enviando los valores previamente ingresados
        
        int pagar = cal.calculo(pre,can);
        
        //llama al método  para mostrar el monto a pagar
        cal.mostrarPago(pagar);
        




    }
    
}
