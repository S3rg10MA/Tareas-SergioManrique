package hospital;

import consultas.Consultas;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class Hospital {
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public ArrayList<Medico> listaMedicos = new ArrayList<>();

    public ArrayList<Consultas> listaConsultas = new ArrayList<>();

    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();

    public void registrarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }
    private ValidadorHospital validador = new ValidadorHospital();

    public void registrarConsulta(Consultas consulta) {
        //  Consultas consultas= new Consultas(1, "2024-08-10", pac1, med1, cons1);

        //No exista una consulta en la fecha y consultorio deseado
        if(!validador.validarDisponibilidadEnFechaConsulta(consulta.getFechaHora(),
                consulta.getConsultorioNumero().getNumeroConsultorio(),this.listaConsultas)){
            System.out.println("Ya existe una consuta registrada para esa fecha");
            return;
        }

        //validar disponibilidad del medico
        //if(!validador.validarDisponibilidadMedico(consulta.getFechaHora(),consulta.getMedicoNombre().getIdMedico(),this.listaConsultas))
        if(!validador.validarDisponibilidadMedico(consulta.getFechaHora(),consulta.getMedicoNombre().getId(),this.listaConsultas)){
            System.out.println("El medico no tiene disponibilidad en esa fecha");
            return;
        }

        this.listaConsultas.add(consulta);
    }

    public void registrarConsultorios(Consultorio consultorio) {
        this.listaConsultorios.add(consultorio);
    }
    //monkey type
    public void mostrarPacientes(){
        int iterador=1;
        System.out.println("\n Pacientes del Hospital");
        for(Paciente paciente : this.listaPacientes){
            System.out.println("Este es el paciente" + iterador);
            System.out.println(paciente.mostrarDatosPaciente());
            iterador++;
        }
    }

    public void mostrarMedicos(){
        int iterador=1;
        System.out.println("\n Medicos del Hospital");
        for(Medico medico : this.listaMedicos){
            System.out.println("Este es el medico" + iterador);
            System.out.println(medico.informacionDoctor());
            iterador++;
        }
    }
    public void mostrarConsultorios(){
        int iterador=1;
        System.out.println("\n Consultorios del Hospital");
        for(Consultorio consultorio : this.listaConsultorios){
            System.out.println("Este es el consultorio" + iterador);
            System.out.println(consultorio.datosConsultorio());
            iterador++;
        }
    }
    public void mostrarConsultas(){
        int iterador=1;
        System.out.println("\n Consultas del Hospital");
        for(Consultas consultas : this.listaConsultas){
            System.out.println("Este es el paciente" + iterador);
            System.out.println(consultas.mostrarConsulta());
            iterador++;
        }
    }
    public String generarIdPaciente(){
        Random rand = new Random();
        LocalDate fechas = LocalDate.now();
        int anoActual = fechas.getYear();
        int mesActual = fechas.getMonthValue();
        int longitudPacientesMasUNo = this.listaPacientes.size() +1;
        int numeroAleatorio = rand.nextInt(1, 100000);

        return String.format("P%d%d%d%d",anoActual,mesActual,longitudPacientesMasUNo,numeroAleatorio);

    }

    public String generarIdMedico(String apellidoDoctor, String fechaNacimientoDoctor){
        Random rand = new Random();
        LocalDate fechas = LocalDate.now();
        String primerasLetrasDelApellido = apellidoDoctor.substring(0,2).toUpperCase();
        String ultimoanoNacimiento = fechaNacimientoDoctor.substring(fechaNacimientoDoctor.length()-1).toUpperCase();
        int anoActual = fechas.getYear();
        int numeroAleatorio = rand.nextInt(50, 700000);
        int longitudMasUno = this.listaMedicos.size() + 1;
        return String.format("M%s%s%d%d%d", primerasLetrasDelApellido,ultimoanoNacimiento,anoActual,numeroAleatorio,longitudMasUno);

    }

    public String generarIdConsultorio(){
        Random random = new Random();
        LocalDate fechas = LocalDate.now();
        int longitudanoMasUno = this.listaConsultorios.size() + 1;
        int diaActual = fechas.getDayOfMonth();
        int mesActual = fechas.getYear();
        int numeroAleatorio = random.nextInt(1, 500000);
        return String.format("C%d%d%d%d",longitudanoMasUno,diaActual,mesActual,numeroAleatorio);
    }

    public Paciente obtenerpacienteporId(String idPaciente){
        return listaPacientes.stream().filter(paciente -> paciente.getId().equals(idPaciente)).findFirst().get();
    }

    public void mostrarPacienteporID(String idPaciente){

        /*Optional<Paciente> pacienteencontrado = this.listaPacientes.stream().filter(paciente -> paciente.getId().equals(id).findFirst());
        if(pacienteencontrado.isPresent()){
            System.out.println(pacienteencontrado.get().mostrarDatosPaciente());
        }else {
            System.out.println("No se encontro el paciente");
        }*/
        Optional<Paciente> pacienteEncontrado = this.listaPacientes.stream().filter(paciente -> paciente.getId().equals(idPaciente)).findFirst();
        if (pacienteEncontrado.isPresent()){
            System.out.println(pacienteEncontrado.get().mostrarDatosPaciente());
        }else {
            System.out.println("Paciente no encontrado");
        }
/*        for(Paciente paciente : this.listaPacientes){
            if(paciente.getId().equals(idPaciente)){
                System.out.println(paciente.mostrarDatosPaciente());
                return;
            }
        }
        System.out.println("Paciente no encontrado");*/
    }

    public void mostrarMedicoporID(String IdMedico){
        Optional<Medico> medicoEncontrado = this.listaMedicos.stream().filter(medico -> medico.getId().equals(IdMedico)).findFirst();
        if (medicoEncontrado.isPresent()){
            System.out.println(medicoEncontrado.get().informacionDoctor());
        }else{
            System.out.println("No se encontro ningun medico con ese Id: ");
        }
    }

    public void mostrarConsultorioporID(String IdConsultorio){
        Optional<Consultorio> consultorioEncontrado = this.listaConsultorios.stream().filter(consultorio -> consultorio.getIdConsultorio().equals(IdConsultorio)).findFirst();
        if(consultorioEncontrado.isPresent()){
            System.out.println(consultorioEncontrado.get().datosConsultorio());
        }else{
            System.out.println("No se encontro ningun Consultorio son ese Id");
        }
    }


}
