import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* try {
            String palabra = "hoola";
            int numero;

            numero = Integer.parseInt(palabra);
        }catch (Exception e) {
            System.out.println("Este proceso no se puede hacer, no puedes convertir una palabra a entero");
            System.out.println(e);
        }finally {
            int a = 2;
            int b = 9;
            int suma = a + b;

            System.out.println("La suma es: " + suma);
        }*/

        try {
            int a = 20;
            int b = 0;
        }catch (ArithmeticException e) {
            System.out.println("Division entre 0 "+ e);
        }

        try {
            String text = null;
            System.out.println(text.length());
        }catch (NullPointerException e) {
            System.out.println("Valor null: "+ e);
        }

        try {
            int [] a = new int [3];
            a[0]=0;
            a[1]=3;
            a[2]=3;
            System.out.println("Valor: "+a[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de rango "+ e);
        }

        try {
            Scanner a = new Scanner(new File("archivo.txt"));
        }catch (FileNotFoundException e) {
            System.out.println("Division entre 0 "+ e);
        }//hello
    }
}