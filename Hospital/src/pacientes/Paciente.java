package pacientes;

import java.time.LocalDate;
import java.util.Random;

public class Paciente {
    public String id;
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    private String telefono;
    public String tipoSangre;
    public char sexo;
    public Random random = new Random();

    public Paciente(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String tipoSangre, Character sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
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

    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }

    public Random getRandom() {
        return random;
    }

    public String mostrarDatosPaciente() {
        String datos= String.format("Id del Paciente: %s, Paciente: %s, Apellidos: %s, Fecha de Nacimiento: %s Sexo: %s," +
                "Telefono: %s, Tipo de Sangre: %s", id, nombre, apellido, fechaNacimiento,sexo, telefono, tipoSangre);
        return datos;
    }
}
