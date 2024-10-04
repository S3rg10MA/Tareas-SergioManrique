package usuarios.administrador;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {
    public String sueldo;
    public String rfc;
    public String aniosTrabajados;
//Sergio Manrique
    public Administrador(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String constrasenia, Rol rol, String sueldo, String rfc, String aniosTrabajados) {
        super(id, nombre, apellido, fechaNacimiento, telefono, constrasenia, Rol.ADMIN);
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
    public String mostrardatosadmin(){
        return String.format("Id del Admin: %d, Nombre: %s, Apellido: %s, Fecha de Nacimiento: %s, Telefono: %s,",id,nombre,
                apellido,fechaNacimiento,telefono);
    }
}
