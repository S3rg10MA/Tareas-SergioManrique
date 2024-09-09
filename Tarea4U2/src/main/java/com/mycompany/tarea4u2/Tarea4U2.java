
package com.mycompany.tarea4u2;

public class Tarea4U2 {

    public static void main(String[] args) {
         System.out.print("\nCoche Uno:\n");
        Coche cocheUno = new Coche("Toyota", "Avanza",2021);
      /*  System.out.println("Marca coche Uno: " + cocheUno.marca );
        System.out.println("Modelo coche Uno: "+ cocheUno.modelo);
        System.out.println("Año coche Uno: "+ cocheUno.año);*/
      System.out.println(cocheUno.mostrarInformacion());
        
        System.out.println("\nCoche Dos:");
        Coche cocheDos= new Coche("Nisan", "Civic",2019);
        System.out.println(cocheDos.mostrarInformacion());
        
        System.out.println("\nCoche Tres");
        Coche cocheTres = new Coche("Ford", "Mustang",2020);
        System.out.println(cocheTres.mostrarInformacion());
    }
}
