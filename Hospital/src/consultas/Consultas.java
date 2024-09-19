package consultas;

import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.util.Random;

public class Consultas {
    public int id;
    public String fechaHora;
    public Paciente pacienteNombre;
    public Medico medicoNombre;
    public Consultorio consultorioNumero;
    public Random random = new Random();

    public Consultas(String fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.id = this.random.nextInt(1, 10001);
        this.fechaHora = fechaHora;
        this.pacienteNombre = paciente;
        this.medicoNombre = medico;
        this.consultorioNumero = consultorio;
    }

    public int getId() {
        return id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public Paciente getPacienteNombre() {
        return pacienteNombre;
    }

    public Medico getMedicoNombre() {
        return medicoNombre;
    }

    public Consultorio getConsultorioNumero() {
        return consultorioNumero;
    }
}
