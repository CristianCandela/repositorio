
package Semana06;

class Vehiculo {
    int año;
    String marca;
    
    Vehiculo (int año, String marca){
        this.año=año;
        this.marca=marca;
    }
    
    void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Año: " + año);
    }
}
    
 class Coche extends Vehiculo{
        int puertas;
        
    Coche (String marca, int año, int puertas){
           super(año,marca);
           this.puertas = puertas;
        }
    @Override
    void mostrarDetalles() {
    super.mostrarDetalles();
    System.out.println("Puertas: " + puertas);
    }
}
       
  class Bicicleta extends Vehiculo{
        int ruedas;
        
    Bicicleta (String marca, int año, int ruedas){
           super(año,marca);
           this.ruedas = ruedas;
        }
    @Override
    void mostrarDetalles() {
    super.mostrarDetalles();
    System.out.println("Ruedas: " + ruedas);
    }
}

class Motocicleta extends Vehiculo{
        String color;
        
    Motocicleta (String marca, int año, String color){
           super(año,marca);
           this.color = color;
        }
    @Override
    void mostrarDetalles() {
    super.mostrarDetalles();
    System.out.println("Color: " + color);
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
      
      Coche coche=new Coche("Nissan",2019,4);
      Bicicleta bici=new Bicicleta("Giant",2020,2);
      Motocicleta moto=new Motocicleta("Honda",2010,"negro");
      
      coche.mostrarDetalles();
      bici.mostrarDetalles();
      moto.mostrarDetalles();
    }
}
