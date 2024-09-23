package hospital;

import consultas.Consultas;

import java.util.ArrayList;

public class ValidadorHospital {


    public boolean validarDisponibilidadEnFechaConsulta(String fechaDeseada, int numeroConsultorio, ArrayList<Consultas> listaConsultas) {
        for (Consultas consulta : listaConsultas) {
            if(consulta.getFechaHora().equals(fechaDeseada) && numeroConsultorio == consulta.getConsultorioNumero().getNumeroConsultorio()){
                return false;
            }
        }
        return true;
    }

    public boolean validarDisponibilidadMedico(String fechaDeseada, String idMedico,ArrayList<Consultas> listaConsultas){
        for(Consultas consulta : listaConsultas){
            if (consulta.getFechaHora().equals(fechaDeseada) && consulta.getMedicoNombre().getId().equals(idMedico)){
                return false;
            }
        }
        return true;
    }

}
