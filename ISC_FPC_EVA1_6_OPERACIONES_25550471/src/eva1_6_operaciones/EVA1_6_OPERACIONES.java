/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_operaciones;

/**
 *
 * @author equipo
 */
public class EVA1_6_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double area, p, radio; // TODAS SON DOUBLES
        //ES LO MISMO QUE:
        //double p;
        //double area;
        //double radio;
        //inicialización:
        
        p = 3.1416;
        radio = 10;
        //OPERACIÓN:
        area = p * (radio * radio);
        //SALIDA DE DATOS:
        System.out.println("El área de un círculo de radio 10 es:");
        System.out.println(area);
        
    }
    
}
