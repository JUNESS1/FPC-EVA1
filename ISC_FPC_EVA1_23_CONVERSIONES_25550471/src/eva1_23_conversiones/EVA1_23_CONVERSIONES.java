/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_conversiones;

/**
 *
 * @author equipo
 */
public class EVA1_23_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        double tempDecimal;
        tempDecimal = 24.5;
        temp = (int)tempDecimal;
        System.out.print(temp);
        
        String cade, mensaje;
        mensaje = "La temperatura es ";
        cade = mensaje + temp;//concatenacion
        System.out.println(cade);
    }
    
}
