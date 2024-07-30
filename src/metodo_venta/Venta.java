/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo_venta;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Venta {
    
    
    public int calculo(int precio, int cantidad)
    {
        int pagar = precio * cantidad;
        return pagar;
    }
    
    public void mostrarPago(int pagar)
    {
        JOptionPane.showMessageDialog(null, "El monto a pagar por la venta es: " + pagar + " soles");
    }
    
    
    
    
}
