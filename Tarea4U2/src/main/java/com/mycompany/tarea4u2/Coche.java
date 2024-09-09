
package com.mycompany.tarea4u2;

public class Coche {
     public String marca;
    public String modelo;
    public int año;
    
    public Coche(String marca, String modelo, int año){
    
    
    this.marca = marca;
    this.modelo = modelo;
    this.año= año;
    
    }
    
   /* public void mostrarInformacion(){
    
        System.out.println( "Marca: "+ this.marca
                + "Modelo: " + this.modelo
                + "Año: "+ this.año);
    
    }*/
    
    public String mostrarInformacion(){
    
        return "Marca: "+ this.marca
                + "\nModelo: " + this.modelo
                + "\nAño: "+ this.año + "\nEl coche tiene "+(2024-this.año)+" años";
    
    }
}
