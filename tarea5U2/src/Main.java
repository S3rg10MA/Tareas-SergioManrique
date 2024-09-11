import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los datos del rectangulo del rectangulo");

        System.out.println("Ingresa la altura del rectangulo");
        Double alturaUno = sc.nextDouble();
        //int alturaUno = sc.nextInt();

        System.out.println("Ingresa la base del rectangulo");
        Double ladoUno = sc.nextDouble();
        //int ladoUno = sc.nextInt();

        System.out.println("\nCuadradoUno \n");
        Cuadrado rectanguloUno = new Cuadrado(ladoUno, alturaUno);
        System.out.println(rectanguloUno.perimetrorectangulo());
        System.out.println(rectanguloUno.arearectangulo());
        System.out.println("\n \n"+rectanguloUno.perimetrorectangulo());
        System.out.println(rectanguloUno.arearectangulo());

    }
}