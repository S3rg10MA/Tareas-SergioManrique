package usuarios.pacientes;

import expedientes.Expediente;
import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
//Sergio Manrique

public class Paciente extends Usuario {

    public String tipoSangre;
    public char sexo;
    public Random random = new Random();
    public ArrayList<Expediente> expedientes;

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

    @Override
    public String mostrarInformacion(){
        String datosPaciente = String.format(", tipo de sangre: %s, sexo: %s",tipoSangre,sexo);
        return super.mostrarInformacion()+ datosPaciente;
    }
    public void registrarExpediente(Expediente expediente) {
        this.registrarExpediente(expediente);
    }
}
