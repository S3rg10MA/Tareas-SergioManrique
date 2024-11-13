import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

       /* try (BufferedWriter nuevo = new BufferedWriter(new FileWriter(("Prueba.txt")))){

            nuevo.write("Este es el primer archivo creado\n");
            nuevo.write("Hello\n");
            nuevo.write("Tercera linea");

        }catch (IOException e){
            System.out.println("Error al leer el archivo"+e);
        }

        //leer archivo

        try (BufferedReader leer = new BufferedReader(new FileReader("Prueba txt"))) {

            String lectura;

            while ((lectura = leer.readLine()) != null) {
                System.out.println(lectura);
            }

        }catch (IOException e){
            System.out.println("Error al leer el archivo" +e.getMessage());
        }*/
        //escribir binario
       /* byte [] a= {1,2,3,4,5,6,7,8,9};
        try (BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream("pruebaBinario.dat"))){

            bis.write(a);
            System.out.println("Se sgrego la informacion al archivo");

        }catch (Exception e) {
            System.out.println("Error al leer el erchivo"+e.getMessage());
        }

        //leer el archivo binario
        try (BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("pruebaBinario.dat"))){

            int b= 0;

            while ((b=bis2.read())!=-1){
                System.out.println(b);
            }

        }catch (Exception e) {
            System.out.println("Error al leer el erchivo"+e.getMessage());
        }*/
//sobreescribir el archivo
        try (FileWriter writer = new FileWriter("Prueba txt",true); BufferedWriter otro = new BufferedWriter(writer)) {


            otro.write("\nOtra sentencia");

        }catch (Exception e) {
            System.out.println("Error al sobreescribir el archivo "+ e.getMessage());
        }
        //leer
        try (BufferedReader leer = new BufferedReader(new FileReader("Prueba txt"))) {
            String lectura;
            while ((lectura = leer.readLine()) != null) {
                System.out.println(lectura);
            }

        }catch (Exception e) {
            System.out.println("Error al escribir el archivo "+ e.getMessage());
        }
    }
}