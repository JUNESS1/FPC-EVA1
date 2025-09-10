/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
       int añoNac;
       
       System.out.println("Introduce tu edad: ");
       añoNac = captu.nextInt();
       //ESTRUCTURA DE CONTROL IF
       if (añoNac <= 2007){
           System.out.println("ES MAYOR DE EDAD, PUEDE COMPRAR ALCOHOL");
       } else {
           System.out.println("ES MENOR DE EDAD, NO PUEDE COMPRAR ALCOHOL");
       }
    
    }
    
}
