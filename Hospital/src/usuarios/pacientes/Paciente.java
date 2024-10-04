package usuarios.pacientes;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;
import java.util.Random;
//Sergio Manrique

public class Paciente extends Usuario {

    public String tipoSangre;
    public char sexo;
    public Random random = new Random();

    public Paciente(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String tipoSangre, Character sexo, String contrasenia) {
        super(id, nombre, apellido, fechaNacimiento, telefono,contrasenia ,Rol.PACIENTE);
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
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
                " Telefono: %s, Tipo de Sangre: %s", id, nombre, apellido, fechaNacimiento, sexo, telefono, tipoSangre);
        return datos;
    }
}
