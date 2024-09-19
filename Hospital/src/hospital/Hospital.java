package hospital;

import consultas.Consultas;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.util.ArrayList;

public class Hospital {
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public ArrayList<Medico> listaMedicos = new ArrayList<>();

    public ArrayList<Consultas> listaConsultas = new ArrayList<>();
    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();

    public void registrarPaaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }

    public void registrarConsulta(Consultas consulta) {
        //  Consultas consultas= new Consultas(1, "2024-08-10", pac1, med1, cons1);
        //No exista una consulta en la fecha y consultorio deseado
        if(!validarDisponibilidadEnFechaConsulta(consulta.getFechaHora(), consulta.getConsultorioNumero().getNumeroConsultorio())){
            System.out.println("Ya existe una consuta registrada para esa fecha");
            return;
        }


        this.listaConsultas.add(consulta);
    }

    public void registrarConsultorios(Consultorio consultorio) {
        this.listaConsultorios.add(consultorio);
    }

    private boolean validarDisponibilidadEnFechaConsulta(String fechaDeseada, int numeroConsultorio){
        for (Consultas consulta : listaConsultas) {
            if(consulta.getFechaHora().equals(fechaDeseada) && numeroConsultorio == consulta.getConsultorioNumero().getNumeroConsultorio()){
                return false;
            }
        }
        return true;
    }
}
