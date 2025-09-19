/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA1_19_ANTRO {
    
    public static void main(String[] args) {
        int edad;
        boolean credencial;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Captura tu edad: ");
        edad = captu.nextInt();
        
        System.out.print("Cuenta con credencial de elector?(true/false)");
        credencial = captu.nextBoolean();
        
        if((edad >= 18)&& (credencial == true)){//COMPARAR CADENAS 
                System.out.println("ACCESO CONCEDIDO!");
            }else{
                System.out.println("ACCESO DENEGADO!");
             }
       
}
        
    }

    
    

