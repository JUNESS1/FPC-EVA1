/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura_25550471;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA1_9_CAPTURA_25550471 {
    
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);//CREA EL SCANNER
        
        System.out.println("Introduce tu nombre completo: ");
        nombre = input.nextLine();//CAPTURA TEXTO (nextLine())
        System.out.println("Introduce tu edad: ");
        edad = input.nextInt();
        System.out.println("Captura tu promedio de la preparatoria: ");
        promedio = input.nextDouble();
        
        System.out.println("El nombre es: ");
        System.out.println(nombre);
        System.out.println("La edad es: ");
        System.out.println(edad);
        System.out.println("El promedio es: ");
        System.out.println(promedio);
       
    }
    
}
