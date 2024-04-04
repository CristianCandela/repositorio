/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dias;
        final double V_LUZ = 299792458;
        double distancia=0;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el número de días");
        dias=lector.nextInt();
        
        distancia= dias*24*Math.pow(60,2)*V_LUZ; 
        
        System.out.println("Número de días es " +dias+" y la distancia"+distancia);
        System.out.printf("El número de dias %d  y" + "la distancia %5.2f", dias, distancia);
    }
    
}
