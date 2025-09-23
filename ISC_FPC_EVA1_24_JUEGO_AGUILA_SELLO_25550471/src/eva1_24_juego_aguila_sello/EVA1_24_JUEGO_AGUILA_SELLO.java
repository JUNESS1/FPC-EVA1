/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_juego_aguila_sello;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA1_24_JUEGO_AGUILA_SELLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
       int usuario;
       System.out.println("Aguila o sello? (1/0)");
       usuario = captu.nextInt();
       System.out.println(Math.random());
       //IMPRIMIR QUE CAE LA MONEDA (AGUILA O SELLO) SEGUN ELIJA EL USUARIO
       //EL VALOR DE RAMNDOM
       if( usuario >=1 && usuario <= 0)
            System.out.println("Aguila");
       
       //GENERA UN RESULTADO ALEATORIO 
       int resultado = (Math.random() <= 0.5) ? 0 : 1;
       // Imprimir qué cayó la moneda
        if (resultado == 1) {
            System.out.println("Águila");
        } else {
            System.out.println("Sello");
        }

       //VERIFICA SI GANA O PIERDE EL USUARIO
       if (usuario == resultado) {
            System.out.println("Ganaste!!");
        } else {
            System.out.println("Perdiste!!");

       
    }
    
    }
}
