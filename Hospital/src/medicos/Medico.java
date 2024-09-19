package medicos;

import java.util.Random;

public class Medico {
    public int id;
    public String nombreDoctor;
    public String apellidoDoctor;
    public String fechaNacimientoDoctor;
    private String telefonoDoctor;
    private String rfc;
    public Random random = new Random();

    public Medico(String nombreDoctor, String apellidoDoctor, String fechaNacimientoDoctor, String telefonoDoctor, String rfc) {
        this.id = this.random.nextInt(1, 10001);
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.fechaNacimientoDoctor = fechaNacimientoDoctor;
        this.telefonoDoctor = telefonoDoctor;
        this.rfc = rfc;
    }

    public String informacionDoctor() {
        return String.format("Id: %d. Nombre del Doctor: %s, Apellido: %s, Fecha de Nacimiento: %s, " +
                "Telefono: %s, RFC. del doctor: %s", id, nombreDoctor,apellidoDoctor,
                fechaNacimientoDoctor,telefonoDoctor,rfc);
    }
}
