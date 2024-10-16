package consultas;

import consultas.utils.Status;
import consultorios.Consultorio;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;

import java.time.LocalDateTime;

//Sergio Manrique
public class Consultas {
    public String idConsulta;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;
    public Status status;


    public Consultas(String idConsulta, LocalDateTime fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.idConsulta = idConsulta;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
        this.status = Status.PENDIENTE;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public LocalDateTime getFechaHora() {

        return fechaHora;
    }

    public Paciente getPaciente() {

        return paciente;
    }

    public Medico getMedico() {

        return medico;
    }

    public Consultorio getConsultorio() {

        return consultorio;
    }

    public Status getStatus() {
        return status;
    }

    public String mostrarConsulta() {
        return String.format("Id: %s, Fecha: %s, Id Paciente: %s, nombre Paciente: %s, Id Medico: %s, Nombre Medico: %s, Num.Consultorio: %d, Piso Consultorio %d",
                idConsulta,fechaHora, paciente.getId(), paciente.getNombre(), medico.getId(), medico.getNombre(),consultorio.getNumeroConsultorio(), consultorio.getPiso());
    }
}