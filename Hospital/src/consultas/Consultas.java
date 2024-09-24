package consultas;

import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDateTime;
import java.util.Random;

public class Consultas {
    public int id;
    public LocalDateTime fechaHora;
    public Paciente pacienteNombre;
    public Medico medicoNombre;
    public Consultorio consultorioNumero;
    public Random random = new Random();

    public Consultas(LocalDateTime fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.id = this.random.nextInt(1, 10001);
        this.fechaHora = fechaHora;
        this.pacienteNombre = paciente;
        this.medicoNombre = medico;
        this.consultorioNumero = consultorio;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {

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

    public String mostrarConsulta() {
        return String.format("Fecha: %s, Paciente: %s, Medico: %s, Num.Consultorio: %d", fechaHora, pacienteNombre, medicoNombre, consultorioNumero);
    }
}