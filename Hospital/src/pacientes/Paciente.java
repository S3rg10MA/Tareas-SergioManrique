package pacientes;

import java.util.Random;

public class Paciente {
    public int id;
    public String nombre;
    public String apellido;
    public String fechaNacimiento;
    private String telefono;
    public String tipoSangre;
    public char sexo;
    public Random random = new Random();

    public Paciente(String nombre, String apellido, String fechaNacimiento, String telefono, String tipoSangre, Character sexo) {
        this.id = this.random.nextInt(1, 10001);
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
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
        return String.format("Id del Paciente: %d, Paciente: %s, Apellidos: %s, Fecha de Nacimiento: %s," +
                "Telefono: %s, Tipo de Sangre: %s", id, nombre, apellido, fechaNacimiento, telefono, tipoSangre);
    }
}
