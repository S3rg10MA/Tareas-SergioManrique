package usuarios.medicos;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Medico extends Usuario {

    private String rfc;

//Sergio
    public Medico(String idMedico, String nombre, String apellidoDoctor, LocalDate fechaNacimientoDoctor, String telefonoDoctor, String rfc) {
        super(idMedico, nombre, apellidoDoctor, fechaNacimientoDoctor, telefonoDoctor, Rol.MEDICO);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }



    public String informacionDoctor() {
        return String.format("Id: %s, Nombre del Doctor: %s, Apellido: %s, Fecha de Nacimiento: %s, " +
                        "Telefono: %s, RFC. del doctor: %s", id, nombre,apellido,
                fechaNacimiento,telefono,rfc);
    }
}
