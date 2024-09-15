import java.util.ArrayList;
import java.util.Random;


public class Estudiante {

       String nombreEstudiante;
       String idEstudiante;

       public ArrayList<Curso> listaCursos= new ArrayList<>();


       public Estudiante(String nombreEstudiante, String idEstudiante) {
              this.nombreEstudiante = nombreEstudiante;
              this.idEstudiante = idEstudiante;

       }

              public void agregarCurso(Curso curso){
                     this.listaCursos.add(curso);
              }

       public void mostrarInfo() {

              System.out.println("\nNombre del Estudiante: " + nombreEstudiante);
              System.out.println("ID del Estudiante: " + idEstudiante);
              System.out.println("Cursos Inscritos: ");
              if (listaCursos.isEmpty()) {
                     System.out.println("El alumno no esta inscrito en ningun curso");
              }else{
                     for (Curso curso : this.listaCursos) {
                            System.out.println(curso.mostrarCurso());

                     }
              }

       }
}