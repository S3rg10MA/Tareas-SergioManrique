package hospital;

import consultas.Consultas;
import consultorios.Consultorio;
import usuarios.administrador.Administrador;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
//Sergio Manrique
public class Hospital {
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public ArrayList<Medico> listaMedicos = new ArrayList<>();

    public ArrayList<Consultas> listaConsultas = new ArrayList<>();

    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();

    public ArrayList<Administrador> listaAdministradores = new ArrayList<>();

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
                consulta.getConsultorio().getNumeroConsultorio(),this.listaConsultas)){
            System.out.println("Ya existe una consuta registrada para esa fecha");
            return;
        }

        //validar disponibilidad del medico
        //if(!validador.validarDisponibilidadMedico(consulta.getFechaHora(),consulta.getMedicoNombre().getIdMedico(),this.listaConsultas))
        if(!validador.validarDisponibilidadMedico(consulta.getFechaHora(),consulta.getMedico().getId(),this.listaConsultas)){
            System.out.println("El medico no tiene disponibilidad en esa fecha");
            return;
        }

        this.listaConsultas.add(consulta);
    }

    public void registrarConsultorios(Consultorio consultorio) {
        this.listaConsultorios.add(consultorio);
    }
    public void registrarAdministrador(Administrador administrador) {
        this.listaAdministradores.add(administrador);
    }

    public void mostrarPacientes(){
        int iterador=1;
        System.out.println("\n--Pacientes del Hospital--");
        for(Paciente paciente : this.listaPacientes){
            System.out.println("Este es el paciente" + iterador);
            System.out.println(paciente.mostrarDatosPaciente());
            iterador++;
        }
    }

    public void mostrarMedicos(){
        int iterador=1;
        System.out.println("\n-- Medicos del Hospital--");
        for(Medico medico : this.listaMedicos){
            System.out.println("Este es el medico" + iterador);
            System.out.println(medico.informacionDoctor());
            iterador++;
        }
    }
    public void mostrarConsultorios(){
        int iterador=1;
        System.out.println("\n--Consultorios del Hospital--");
        for(Consultorio consultorio : this.listaConsultorios){
            System.out.println("Este es el consultorio" + iterador);
            System.out.println(consultorio.datosConsultorio());
            iterador++;
        }
    }
    public void mostrarConsultas(){
        if(this.listaConsultas.isEmpty()){
            System.out.println("\nNo se cuenta con consultas registradas");
            return;
        }
        System.out.println("---Lista de Consultas---");
        for(Consultas consulta : this.listaConsultas){
            System.out.println(consulta.mostrarConsulta());
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

    public String generarIdConsulta(){
        Random random = new Random();
        int diaActual = LocalDate.now().getDayOfMonth();
        int numeroAleatorio = random.nextInt(1, 100000);
        int longitudMasUno = this.listaConsultorios.size() + 1;
        return String.format("CO%d%d%d", longitudMasUno,diaActual,numeroAleatorio);

    }
    public String generarIdAdmin(){
        Random random = new Random();
        int diaActual = LocalDate.now().getDayOfMonth();
        int numeroAleatorio = random.nextInt(1, 100000);
        int longitudMasUno = this.listaAdministradores.size()+1;
        return String.format("AD%d%d%d", diaActual,numeroAleatorio,longitudMasUno);
    }

    public Paciente obtenerpacienteporId(String idPaciente){
        return listaPacientes.stream().filter(paciente -> paciente.getId().equals(idPaciente)).findFirst().orElse(null);
    }

    public void mostrarPacienteporID(String idPaciente){

        Paciente paciente = obtenerpacienteporId(idPaciente);
        if(paciente != null){
            System.out.println(paciente.mostrarDatosPaciente());
        }else{
            System.out.println("Paciente no encontrado");
        }

    }
    public Paciente obtenerTelefonodePaciente(String telefono){
        return listaPacientes.stream().filter(paciente -> paciente.getTelefono().equals(telefono)).findFirst().orElse(null);
    }
    public boolean telefonoPaciente(String telefono){
        Paciente paciente = obtenerTelefonodePaciente(telefono);
        return paciente != null;
    }

    public Medico obtenerMedicoPorID(String IdMedico){
        return listaMedicos.stream().filter(medico -> medico.getId().equals(IdMedico)).findFirst().orElse(null);
    }

    public void mostrarMedicoporID(String IdMedico){

        Medico medico = obtenerMedicoPorID(IdMedico);
        if (medico != null){
            System.out.println(medico.informacionDoctor());
        }else{
            System.out.println("Medico no encontrado");
        }
    }
    public Medico obtenertelefonoMedico(String telefonoDoctor){
        return listaMedicos.stream().filter(medico -> medico.getTelefono().equals(telefonoDoctor)).findFirst().orElse(null);
    }
    public boolean telefonoMedico(String telefonoDoctor){
        Medico medico = obtenertelefonoMedico(telefonoDoctor);
        return medico != null;
    }
    public Medico obtenerRfcMedico(String rfc){
        return listaMedicos.stream().filter(medico -> medico.getRfc().equals(rfc)).findFirst().orElse(null);
    }
    public boolean rfcMedico(String rfc){
        Medico medico = obtenerRfcMedico(rfc);
        return medico != null;
    }


    public Consultorio obtenerConsultorioPorID(String IdConsultorio){
        return listaConsultorios.stream().filter(consultorio -> consultorio.getIdConsultorio().equals(IdConsultorio)).findFirst().orElse(null);
    }

    public void mostrarConsultorioporID(String IdConsultorio){
        Consultorio consultorio = obtenerConsultorioPorID(IdConsultorio);
        if(consultorio != null){
            System.out.println(consultorio.datosConsultorio());
        }else{
            System.out.println("Consultorio no encontrado");
        }
    }
    public Consultas obtenerConsultasporID(String IdConsultas){
        return listaConsultas.stream().filter(consultas -> consultas.getIdConsulta().equals(IdConsultas)).findFirst().orElse(null);
    }
    public void mostrarConsultasporID(String IdConsultas){
        Consultas consultas = obtenerConsultasporID(IdConsultas);
        if(consultas != null){
            System.out.println(consultas.mostrarConsulta());
        }else{
            System.out.println("Consulta no encontrada");
        }
    }


    public boolean validarFechaConsulta(LocalDateTime fechaDeseada){
        return this.validador.validarFechaCorrecta(fechaDeseada);
    }


}
