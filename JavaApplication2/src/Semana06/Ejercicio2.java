/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana06;

class Motor{
    String tipo;
    int potencia;
    
    Motor (String tipo, int potencia){
        this.tipo= tipo;
        this.potencia= potencia;
    }
    
    void mostrarDatos(){
        System.out.println("Tipo de motor: "+tipo+" , Potencia: "+potencia+"HP.");
    }
}

class Coche{
    String marca;
    Motor motor;
    
    Coche(String marca, Motor motor) {
        this.marca = marca;
        this.motor = motor;
    }
    
    void mostrarDatos() {
        System.out.println("Marca: " + marca);
        motor.mostrarDatos();
    }       
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Motor motor = new Motor("V8", 450);
        Coche coche = new Coche("Ford Mustang", motor);
        coche.mostrarDatos();
}
}
