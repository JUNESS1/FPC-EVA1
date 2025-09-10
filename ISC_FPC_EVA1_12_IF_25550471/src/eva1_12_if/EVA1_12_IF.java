/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
       int califa;
       
       System.out.println("Introduce la calificación: ");
       califa = captu.nextInt();
       //ESTRUCTURA DE CONTROL IF
       if (califa >= 70){//bloque verdadero -->SI
           System.out.println("ACREDITASTE LA MATERIA");
       } else {//bloque falso ---> opcional SI-NO 
           System.out.println("NO ACREDITASTE LA MATERIA");
       }
    }
    
}
