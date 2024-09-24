package medicos;

import java.time.LocalDate;

public class Medico {
    public String idMedico;
    public String nombreDoctor;
    public String apellidoDoctor;
    public LocalDate fechaNacimientoDoctor;
    private String telefonoDoctor;
    private String rfc;


    public Medico(String idMedico, String nombreDoctor, String apellidoDoctor, LocalDate fechaNacimientoDoctor, String telefonoDoctor, String rfc) {
        this.idMedico = idMedico;
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.fechaNacimientoDoctor = fechaNacimientoDoctor;
        this.telefonoDoctor = telefonoDoctor;
        this.rfc = rfc;
    }

    public String getId() {
        return idMedico;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public String getApellidoDoctor() {
        return apellidoDoctor;
    }

    public LocalDate getFechaNacimientoDoctor() {
        return fechaNacimientoDoctor;
    }

    public String getTelefonoDoctor() {
        return telefonoDoctor;
    }

    public String getRfc() {
        return rfc;
    }



    public String informacionDoctor() {
        return String.format("Id: %s, Nombre del Doctor: %s, Apellido: %s, Fecha de Nacimiento: %s, " +
                        "Telefono: %s, RFC. del doctor: %s", idMedico, nombreDoctor,apellidoDoctor,
                fechaNacimientoDoctor,telefonoDoctor,rfc);
    }
}
