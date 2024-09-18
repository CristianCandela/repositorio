/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana06;

class Animal{
    void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal{
    
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra: Guau!");
    }
}

class Gato extends Animal{
    @Override
    void hacerSonido(){
        System.out.println("El gato maulla: Miau!");
    }
}

class Vaca extends Animal{
    @Override
    void hacerSonido(){
        System.out.println("La vaca muge: Muuuuu!");
    }
    
}

public class Ejercicio3 {
    public static void main (String[]args){
        Animal[] animales = { new Perro(), new Gato(), new Vaca() };
        for (Animal animal : animales) {
         animal.hacerSonido();
        }
        
    }
}
