package usuarios.medicos;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Medico extends Usuario {

    private String rfc;

//Sergio Manrique
    public Medico(String idMedico, String nombre, String apellidoDoctor, LocalDate fechaNacimientoDoctor, String telefonoDoctor, String emailMedico,String contrasenia ,String rfc, Rol rol) {
        super(idMedico, nombre, apellidoDoctor, fechaNacimientoDoctor, telefonoDoctor, emailMedico,contrasenia,Rol.MEDICO);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }


    @Override
    public String mostrarInformacion(){
        String datosMedico = String.format(", RFC: %s",rfc);
        return super.mostrarInformacion()+ datosMedico;
    }
}
