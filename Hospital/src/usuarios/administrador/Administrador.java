package usuarios.administrador;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {
    public String sueldo;
    public String rfc;
    public String aniosTrabajados;
//Sergio Manrique
    public Administrador(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String emailAdmin,String constrasenia, Rol rol, String sueldo, String rfc, String aniosTrabajados) {
        super(id, nombre, apellido, fechaNacimiento, telefono, emailAdmin,constrasenia, Rol.ADMIN);
        this.sueldo = sueldo;
        this.rfc = rfc;
        this.aniosTrabajados = aniosTrabajados;
    }
    public String getSueldo() {
        return sueldo;
    }
    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    public String getRfc() {
        return rfc;
    }

    @Override
    public String mostrarInformacion(){
        String datosadmin = String.format(", RFC: %s, Sueldo: $%s, anios Trabajados: %s",rfc,sueldo,aniosTrabajados);
        return super.mostrarInformacion()+ datosadmin;
    }
}
