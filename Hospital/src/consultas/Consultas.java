package consultas;

import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDateTime;
import java.util.Random;

public class Consultas {
    public int id;
    public LocalDateTime fechaHora;
    public Paciente pacienteId;
    public Medico medicoId;
    public Consultorio consultorioId;
    public Random random = new Random();

    public Consultas(LocalDateTime fechaHora, Paciente pacienteId, Medico medicoId, Consultorio consultorioId) {
        this.id = this.random.nextInt(1, 10001);
        this.fechaHora = fechaHora;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.consultorioId = consultorioId;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {

        return fechaHora;
    }

    public Paciente getPacienteId() {

        return pacienteId;
    }

    public Medico getMedicoId() {

        return medicoId;
    }

    public Consultorio getConsultorioId() {

        return consultorioId;
    }

    public String mostrarConsulta() {
        return String.format("Fecha: %s, Paciente: %s, Medico: %s, Num.Consultorio: %d", fechaHora, pacienteId, medicoId, consultorioId);
    }
}