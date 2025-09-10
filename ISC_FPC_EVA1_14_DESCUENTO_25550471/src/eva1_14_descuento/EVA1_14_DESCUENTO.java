/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;

import java.util.Scanner;



/**
 *
 * @author equipo
 */
public class EVA1_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double montoVenta, montoPagar;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Monto de la compra del usuario: ");
        montoVenta = captu.nextDouble();
       
       //ESTRUCTURA DE CONTROL IF
       if ( montoVenta > 1000){
           montoPagar = montoVenta - (montoVenta * 0.15);
           //montoPagar = montoVenta * 0.85;
        System.out.print("Debes pagar: ");
        System.out.println(montoPagar);
       }
        
    }
    
}
