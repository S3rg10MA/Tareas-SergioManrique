import java.util.Random;

public class Estudiante {

       String nombreEstudiante;
       int idEstudiante;
       public Random random = new Random();

       public Estudiante(String nombreEstudiante, String idEstudiante) {
              this.nombreEstudiante = nombreEstudiante;
              this.idEstudiante = this.random.nextInt(1, 100);
       }
       public String getNombreEstudiante() {
              return nombreEstudiante;
       }
       public int getIdEstudiante() {
              return idEstudiante;
       }
       public String mEstudiante(){
              return String.format("Nombre del Estudiante: %s, Id del Estudiante: %d",
                      nombreEstudiante, idEstudiante);
       }
}