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
        long dias;
        long luz=299792458;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el número de días");
        dias=lector.nextInt();
        
        dias*=luz;
        
        System.out.printf("Distancia que reccore la luz:\n" +dias);
        System.out.println("");
        
    }
    
}
