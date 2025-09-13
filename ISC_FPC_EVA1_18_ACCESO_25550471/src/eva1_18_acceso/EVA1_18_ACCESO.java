/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA1_18_ACCESO {
    final static String USUARIO = "junessy";
    final static String PWD = "1234";

    public static void main(String[] args) {
        String usu, contra;
        Scanner input = new Scanner(System.in);
        
        System.out.println("************BIENVENIDO*********** ");
        System.out.println("Sistema de venta de un restaurante ");
        System.out.print("Usuario:");
        usu = input.nextLine();
        System.out.print("Contraseña:");
        contra = input.nextLine();
        
        if(usu.equals(USUARIO)){//COMPARAR CADENAS 
            if (contra.equals(PWD)){
                System.out.println("ACCESO CONCEDIDO!");
            }else{
                System.out.println("ACCESO DENEGADO!");
            }
        }else{
            System.out.println("ACCESO DENEGADO!!");
           
       }
        
    }
    
}
