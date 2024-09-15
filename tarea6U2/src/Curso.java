

public class Curso {

    public String nombreCurso;
    public String codigoCurso;
    public String instructor;

    public Curso (String nombreCurso, String codigoCurso, String instructor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructor = instructor;
    }



        public String mostrarCurso(){
        return "Materia: "+nombreCurso+ " Codigo: "+codigoCurso+ " Instructor: "+instructor;
        }

}
