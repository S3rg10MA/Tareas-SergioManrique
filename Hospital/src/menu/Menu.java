package menu;

import consultas.Consultas;
import consultorios.Consultorio;
import hospital.Hospital;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
//Sergio
public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Hospital hospital = new Hospital();
    private static final String USUARIO = "Juan123";
    private final String CONTRASENIA = "12345";
    private static final String USUARIO_MEDICO = "ale123";
    private final String CONTRASENIA_MEDICO = "12345*";
    private static final String USUARIO_ADMINISTRADOR = "admin123";
    private final String CONTRASENIA_ADMINISTRADOR = "54321*";

    public void login(){
        int intentosMaximos=5, intentosUsuario = 0;
        while(intentosUsuario < intentosMaximos){
            System.out.println("\n**Bienvenido**\n");
            System.out.println("Inicia sesion para continuar");
            System.out.println("Ingrese su usuario");
            String usuario = sc.next();

            System.out.println("Ingresa tu contrasenia");
            String contrasenia = sc.next();

            if (usuario.equals(this.USUARIO)){
                if(contrasenia.equals(CONTRASENIA)){
                    this.mostrarMenuPaciente();
                    intentosUsuario = 0;
                }
            } else if (usuario.equals(this.USUARIO_MEDICO)) {
                if(contrasenia.equals(CONTRASENIA_MEDICO)){
                    this.mostrarMenuMedico();
                    intentosUsuario = 0;
                }
                intentosUsuario = mostrarErrorInicioSesion(intentosUsuario);
            }

             if (usuario.equals(this.USUARIO_ADMINISTRADOR) && contrasenia.equals(this.CONTRASENIA_ADMINISTRADOR)){
                System.out.println("\nInicio de sesion exitoso");
                this.mostrarMenuAndimistrador();
                intentosUsuario = 0;
            }else {
                intentosUsuario = mostrarErrorInicioSesion(intentosUsuario);

            }
        }
        System.out.println("Intentos maximos permitidos alcanzados");
    }
    private int mostrarErrorInicioSesion(int intentosUsuario){
        System.out.println("\nUsuario o contrasenia incorrectos");
        return intentosUsuario +1;

    }

    private void mostrarMenuPaciente(){
        int opcion=0;
        while(opcion != 2){
            System.out.println("\n** Sistema Hospital **\n");
            System.out.println("1. Ver mis consultas");
            System.out.println("2. Salir");

            System.out.println("Selecciona una opcion");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingresa el Id de la consulta");
                    String IdConsulta = sc.next();
                    hospital.mostrarConsultasporID(IdConsulta);

                    break;
                        default:
                        System.out.println("Hasta Luego");
                        return;
            }
        }
    }
    private void mostrarMenuMedico(){
        int opcion=0;
        while(opcion != 4){
            System.out.println("\n** Sistema Hospital **\n");
            System.out.println("1. Ver mis consultas");
            System.out.println("2. Ver mis usuarios.medicos.pacientes");
            System.out.println("3. Consutar paciente");
            System.out.println("4. Salir");

            System.out.println("Selecciona una opcion");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    hospital.mostrarConsultas();
                    break;
                    case 2:
                        hospital.mostrarPacientes();
                        break;
                        case 3:
                            break;
                            case 4:
                                System.out.println("Hasta luego");
                                return;
            }
        }

    }

    private void mostrarMenuAndimistrador() {

        int opcion=0;

        while (opcion != 12){
            System.out.println("\n**Bienvenido**");
            System.out.println("1.Ingresar datos del Paciente");
            System.out.println("2. Mostrar datos del Paciente");
            System.out.println("3.Ingresar datos del Doctor");
            System.out.println("4. Mostrar datos del Doctor");
            System.out.println("5. Registrar Consultorio");
            System.out.println("6. Mostrar Datos del Consultorio");
            System.out.println("7. Registrar Consultas");
            System.out.println("8. Mostrar Datos del Consultas");
            System.out.println("9. Mostrar Paciente por Id");
            System.out.println("10. Mostrar Medico por ID");
            System.out.println("11. Mostrar Consultorio por ID");
            System.out.println("12. Salir");

            System.out.println("**Selecciona una opcion**");
            opcion = sc.nextInt();


            switch (opcion){
                case 1:
                    //P-{a;o actual}-{mes actual}-{longitus usuarios.medicos.pacientes +1}-{1,100000}

                    String id = hospital.generarIdPaciente();

                    System.out.println("Ingresa los datos del Paciente");
                    System.out.println("Ingresa el Nombre del Paciente");
                    String nombre = sc.next();
                    System.out.println("Ingresa el Apellido del Paciente");
                    String apellido = sc.next();
                    System.out.println("Ingresa el año de nacimiento del paciente");
                    int anio = sc.nextInt();
                    System.out.println("Ingresa el mes de nacimiento del paciente");
                    int mes = sc.nextInt();
                    System.out.println("Ingresa el dia de nacimiento del paciente");
                    int dia = sc.nextInt();

                    LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);


                    String telefono = null;
                    while(telefono == null){
                        System.out.println("Ingresa el Numero de Telefono del Paciente");
                        telefono = sc.next();

                        System.out.println("Ingresa tu contrasenia");
                        String contrasenia = sc.next();

                        if(hospital.telefonoPaciente(telefono)){
                            System.out.println("ingresa otro numero, ya que este ya esta registrado");
                            telefono = null;
                        }
                    }



                    System.out.println("Ingresa el tipo de sangre del Paciente");
                    String tipoSangre = sc.next();
                    System.out.println("Ingresa el sexo del Paciente");
                    char sexo = sc.next().charAt(0);

                    Paciente paciente = new Paciente(id,nombre, apellido, fechaNacimiento, telefono, tipoSangre, sexo, CONTRASENIA);
                    hospital.registrarPaciente(paciente);
                    System.out.println("Datos del Paciente registrados Correctamente");
                    break;
                case 2:
                    System.out.println("Aqui estan los datos del paciente");
                    hospital.mostrarPacientes();
                    break;
                case 3:



                    System.out.println("\nIngresa los datos del doctor");
                    System.out.println("Ingresa el Nombre del doctor");
                    String nombreDoctor = sc.next();
                    System.out.println("Ingresa el Apellido del doctor");
                    String apellidoDoctor = sc.next();
                    System.out.println("Ingresa el año de nacimiento del medico");
                    int aniodoc = sc.nextInt();
                    System.out.println("Ingresa el mes de nacimiento del medico");
                    int mesdoc = sc.nextInt();
                    System.out.println("Ingresa el dia de nacimiento del medico");
                    int diadoc = sc.nextInt();
                    LocalDate fechaNacDoctor = LocalDate.of(aniodoc, mesdoc, diadoc);

                    String telefonoDoctor = null;
                    while(telefonoDoctor == null){
                        System.out.println("Ingresa el Numero de Telefono del doctor");
                        telefonoDoctor = sc.next();
                        if(hospital.telefonoMedico(telefonoDoctor)){
                            System.out.println("ingresa otro numero, ya que esta registrado");
                            telefonoDoctor = null;
                        }
                    }
                    System.out.println("Ingresa una Contrasenia");
                    String contrasenia = sc.next();

                    String rfc = null;
                    while(rfc == null){
                        System.out.println("Ingresa el RFC del doctor");
                        rfc = sc.next();
                        if(hospital.rfcMedico(rfc)){
                            System.out.println("Revisa el rfc, ya que el que deseas registrar, ya a sido registrado por otro medico");
                            rfc = null;
                        }
                    }

                    String idMedico = hospital.generarIdMedico(apellidoDoctor, String.valueOf(fechaNacDoctor));
                    Medico medico = new Medico(idMedico, nombreDoctor,apellidoDoctor,fechaNacDoctor,telefonoDoctor,contrasenia,rfc);
                    hospital.registrarMedico(medico);
                    System.out.println("Datos del Doctor registrados Correctamente");

                    break;
                case 4:
                    System.out.println("Datos del Doctor:");
                    hospital.mostrarMedicos();
                    break;
                case 5:
                    System.out.println("Ingresa los datos del Consultorio:");
                    System.out.println("Ingresa el Piso del Consultorio");
                    int piso = sc.nextInt();
                    System.out.println("Ingresa el numero del consultorio");
                    int numeroConsultorio = sc.nextInt();
                    String idConsultorio = hospital.generarIdConsultorio();

                    Consultorio consultorio = new Consultorio(idConsultorio, piso, numeroConsultorio);
                    hospital.registrarConsultorios(consultorio);
                    System.out.println("Datos del Consultorio registrados correctamente");
                    break;
                case 6:
                    System.out.println("Datos del Consultorio:");
                    // consultorio.datosConsultorio();
                    hospital.mostrarConsultorios();
                    break;
                case 7:


                    System.out.println("Ingresa los datos de la consulta");
                    String idConsulta = hospital.generarIdConsulta();

                    LocalDateTime fechaHora = null;
                    while(fechaHora == null){
                        System.out.println("Ingresa el dia de la consulta");
                        int diaConsulta = sc.nextInt();
                        System.out.println("Ingresa el mes de la consulta");
                        int mesConsulta = sc.nextInt();

                        System.out.println("Ingresa el anio de la consulta");
                        int anioConsulta = sc.nextInt();
                        System.out.println("Ingresa la hora de la consulta");
                        int horaConsulta = sc.nextInt();
                        System.out.println("Ingresa los minutos de la consulta");
                        int minutosConsulta = sc.nextInt();

                        fechaHora = LocalDateTime.of(anioConsulta, mesConsulta, diaConsulta, horaConsulta, minutosConsulta);
                        if (!hospital.validarFechaConsulta(fechaHora)){
                            System.out.println("La fecha no es correcta intenta nuevamente, recuerda que la fecha no puede estar en el pasado");
                            fechaHora = null;
                        }
                    }

                    Paciente pacienteConsulta = null;
                    while(pacienteConsulta == null){

                        System.out.println("Ingresa el Id  del Paciente:");
                        String pacienteId = sc.next();

                        pacienteConsulta = hospital.obtenerpacienteporId(pacienteId);

                        if(pacienteConsulta == null){
                            System.out.println("\nNo se encontro ningun paciente, intenta nuevamente");
                        }
                    }

                    Medico medicoConsulta = null;
                    while(medicoConsulta == null){

                        System.out.println("Ingresa el Id del medico");
                        String medicoId = sc.next();

                        medicoConsulta = hospital.obtenerMedicoPorID(medicoId);

                        if(medicoConsulta == null){
                            System.out.println("\nNo se encontro ningun medico, intenta nuevamente:");
                        }
                    }

                    Consultorio consultorioConsulta = null;
                    while (consultorioConsulta == null){

                        System.out.println("Ingresa el Id del consultorio");
                        String consultorioId = sc.next();

                        consultorioConsulta = hospital.obtenerConsultorioPorID(consultorioId);

                        if(consultorioConsulta == null){
                            System.out.println("No se encontro ningun consultorio, intenta nuevamente");
                        }
                    }


                    Consultas consulta = new Consultas(idConsulta,fechaHora,pacienteConsulta,medicoConsulta,consultorioConsulta);
                    hospital.registrarConsulta(consulta);
                    System.out.println("Consulta registrada correctamente");



                    break;
                case 8:
                    System.out.println("Datos de la Consulta");
                    hospital.mostrarConsultas();
                    break;
                case 9:
                    System.out.println("\nMostrar Paciente");
                    System.out.println("Ingresa el Id del paciente que deseas buscar");
                    String idPaciente = sc.next();

                    hospital.mostrarPacienteporID(idPaciente);
                    break;
                case 10:
                    System.out.println("\nMostrar Medico por ID");
                    System.out.println("Ingresa el Id del medico que deseas buscar");
                    String IdMedico = sc.next();
                    hospital.mostrarMedicoporID(IdMedico);
                    break;
                case 11:
                    System.out.println("\nMostrar Consultorio por ID");
                    System.out.println("Ingresa el Id del consultorio que deseas buscar");
                    String IdConsultorio= sc.next();
                    hospital.mostrarConsultorioporID(IdConsultorio);
                    break;
                case 12:
                    System.out.println("Hasta Luego");
                    return;
            }
        }
    }
}
