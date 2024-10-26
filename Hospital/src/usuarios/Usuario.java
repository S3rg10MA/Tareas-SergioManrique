package usuarios;

import usuarios.utils.Rol;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Sergio Manrique
public class Usuario {
    public String id;
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public String telefono;
    public String email;
    private String contrasenia;
    public Rol rol; //enum

    public Usuario(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String email,String constrasenia, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.contrasenia = constrasenia;
        this.rol = rol;

    }

    protected String mostrarInformacion(){
        String nombreCompleto= this.nombre+ " " + this.apellido;
        String datos = String.format("\n Id %s, nombre Completo: %s, fecha de Nacimiento: %s, telefono: %s, email: %s", id, nombreCompleto, fechaNacimiento, telefono, email);
        return datos;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }
    public String getEmail() {
        return email;
    }
    public String getContrasenia(){
        return contrasenia;
    }
    public Rol getRol() {
        return rol;
    }


}
