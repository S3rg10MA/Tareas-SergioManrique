package hospital;

import consultas.Consultas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ValidadorHospital {

//Sergio Manrique
    public boolean validarDisponibilidadEnFechaConsulta(LocalDateTime fechaDeseada, int numeroConsultorio, ArrayList<Consultas> listaConsultas) {




        for (Consultas consulta : listaConsultas) {
            if(consulta.getFechaHora().isEqual(fechaDeseada) && numeroConsultorio == consulta.getConsultorio().getNumeroConsultorio()) {
                return false;
            }
           /* if(consulta.getFechaHora().equals(fechaDeseada) && numeroConsultorio == consulta.getConsultorioNumero().getNumeroConsultorio()){
                return false;
            }*/
        }
        return true;
    }

    public boolean validarDisponibilidadMedico(LocalDateTime fechaDeseada, String idMedico,ArrayList<Consultas> listaConsultas){
        for(Consultas consulta : listaConsultas){
            if (consulta.getFechaHora().isEqual(fechaDeseada) && consulta.getMedico().getId().equals(idMedico)){
                return false;
            }
        }
        return true;
    }

    public boolean validarFechaCorrecta(LocalDateTime fechaDeseada){
        LocalDateTime fechaActual = LocalDateTime.now();

        if(fechaDeseada.isBefore(fechaActual)) return false;
        return true;
    }

}
