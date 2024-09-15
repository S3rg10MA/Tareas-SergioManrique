import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {




        Estudiante estudiante = new Estudiante("Sergio", "24120376");
        Estudiante estudiante2 = new Estudiante("Rogelio", "22120123");
        Estudiante estudiante3 = new Estudiante("Maximiliano", "20121076");

       Curso curso1 = new Curso("Algebra", "ALG101", "Ing. Dante");
        Curso curso2 = new Curso("Contabilidad", "CON506", "Jesus");
        Curso curso3= new Curso("Historia", "HiS121", "Israel");

        estudiante.agregarCurso(curso1);
        estudiante.agregarCurso(curso2);

        estudiante2.agregarCurso(curso3);
        estudiante2.agregarCurso(curso1);



        estudiante.mostrarInfo();
        estudiante2.mostrarInfo();
        estudiante3.mostrarInfo();

    }
}