/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA1_20_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner captu = new Scanner(System.in);
        int califa;
       
         System.out.println("Ingresa tu calificacion: ");
         califa = captu.nextInt();
         //Una sola instrucción no necesita llaves, cuando son mas de una se está obligado a ponerle llaves  
        if( califa >=90 && califa <=100)
            System.out.println("A");
         else if( califa >=80 && califa <=89)
                System.out.println("B");
         else if( califa >=70 && califa <=79)
                System.out.println("C");
         else if( califa >=60 && califa <=69)
                System.out.println("D");
         else if( califa >=0 && califa <=50)
                System.out.println("F");
        else
             System.out.println("Tu calificación no es valida!!");
        
        
    }

    }
