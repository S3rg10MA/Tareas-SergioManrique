import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       /* System.out.println("Ingresa el nombre del curso");
        String nombreCurso = sc.nextLine();
        System.out.println("Ingresa el codigo del curso");
        String codigoCurso = sc.nextLine();
        System.out.println("Ingresa el nombre del instructor");
        String nombreInstructor = sc.nextLine();*/

        Curso curso1 = new Curso("Algebra", "ALG101", "Ing. Dante");
        Curso curso2 = new Curso("Contabilidad", "CON506", "Jesus");
        Curso curso3= new Curso("Historia", "HiS121", "Israel");



    }
}