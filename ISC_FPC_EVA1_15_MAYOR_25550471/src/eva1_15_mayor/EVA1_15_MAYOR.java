/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA1_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el primer número: ");
        numero1 = captu.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        numero2 = captu.nextInt();
        
        if(numero1 > numero2){
            System.out.println("El valor mayor es");
            System.out.println(numero1);
       } else {
            if (numero2 > numero1){
            System.out.println("El valor mayor es ");
            System.out.println(numero2);
            }else{
           System.out.println("Los valores son iguales");
       
            } 
        }
    }
    
}
