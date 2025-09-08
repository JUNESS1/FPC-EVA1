/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura_25550471;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA1_10_CAPTURA_25550471 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VELOCIDAD = DISTANCIA / TIEMPO
        //m / s
        double distancia, tiempo, velocidad;
        Scanner captu = new Scanner(System.in);
        distancia = 28;
        tiempo = 120;
        velocidad = distancia / tiempo;
        
        System.out.println("Introduce la distancia: ");
        distancia = captu.nextDouble();
        System.out.println("Introduce el tiempo: ");
        tiempo = captu.nextDouble();
        //CÁLCULO:
        velocidad = distancia / tiempo;
        
        System.out.println("La velocidad es: ");
        System.out.print(velocidad);
        System.out.print("m/s");
    }
    
}

