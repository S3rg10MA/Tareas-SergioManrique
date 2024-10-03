package usuarios;

import usuarios.utils.Rol;

import java.time.LocalDate;

public class Usuario {
    public String id;
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public String telefono;
    private String contrasenia;
    public Rol rol; //enum

    public Usuario(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String constrasenia, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.contrasenia = constrasenia;
        this.rol = rol;

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }
    protected String getContrasenia(){
        return contrasenia;
    }
    public Rol getRol() {
        return rol;
    }
}
