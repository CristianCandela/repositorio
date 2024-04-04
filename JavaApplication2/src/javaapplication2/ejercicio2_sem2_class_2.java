/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class ejercicio2_sem2_class_2 {
   
    public static void main(String[]args){
        
        String nombre,producto;
        double precio;
        int cantidad;
        boolean descuento_5, descuento_2;
        
        Scanner lector= new Scanner(System.in);
        
        System.out.println("Ingresa nombre");
        nombre=lector.nextLine();
        
        System.out.println("Ingresa producto");
        producto=lector.nextLine();
        
        System.out.println("Ingresa precio");
        precio=lector.nextDouble();
        
        System.out.println("Ingresa Cantidad");
        cantidad=lector.nextInt();
        
    descuento_5=(nombre.equals("Ana")||nombre.equals("Jose"));
    descuento_2=producto.contains("gamer");
    
        
    }
   
   
   
}
