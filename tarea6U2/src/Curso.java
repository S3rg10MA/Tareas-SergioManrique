import java.util.ArrayList;

public class Curso {

    public String nombreCurso;
    public String codigoCurso;
    public String instructor;

    public Curso (String nombreCurso, String codigoCurso, String instructor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructor = instructor;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public String getCodigoCurso() {
        return codigoCurso;
    }
    public String getInstructor() {
        return instructor;
    }
 /*   public String mostrarInfo(){
        return String.format("Curso: %s, Codigo del Curso: %s, Maestro: %s",
                nombreCurso, codigoCurso, instructor);
    }*/


    public ArrayList<Curso> listaCursos = new ArrayList<Curso>();


    public void registrarCurso(Curso curso){
        this.listaCursos.add(curso);

    }
        public void mostrarCurso(){
            System.out.println("Cursos disponibles:");

        }
        int iterador =1;
            for(Curso curso  this.listaCursos) {

        System.out.println("Estes es el curso "+ iteradr);
        System.out.println(curso.mostrarCurso());
        iterador++;
    }
}
