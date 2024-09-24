import consultas.Consultas;
import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
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
                    //P-{a;o actual}-{mes actual}-{longitus pacientes +1}-{1,100000}

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
                    System.out.println("Ingresa el Numero de Telefono del Paciente");
                    String telefono = sc.next();
                    System.out.println("Ingresa el tipo de sangre del Paciente");
                    String tipoSangre = sc.next();
                    System.out.println("Ingresa el sexo del Paciente");
                    char sexo = sc.next().charAt(0);

                    Paciente paciente = new Paciente(id,nombre, apellido, fechaNacimiento, telefono, tipoSangre, sexo);
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
                    System.out.println("Ingresa el dia de nacimiento del paciente");
                    int diadoc = sc.nextInt();
                    LocalDate fechaNacDoctor = LocalDate.of(aniodoc, mesdoc, diadoc);
                    System.out.println("Ingresa el Numero de Telefono del doctor");
                    String telefonoDoctor = sc.next();
                    System.out.println("Ingresa el RFC del doctor");
                    String rfc = sc.next();

                    String idMedico = hospital.generarIdMedico(apellidoDoctor, String.valueOf(fechaNacDoctor));
                    // Medico medico = new Medico(idMedico,nombreDoctor, apellidoDoctor, fechaNacDoctor, telefonoDoctor, rfc);
                    Medico medico = new Medico(idMedico, nombreDoctor,apellidoDoctor,fechaNacDoctor,telefonoDoctor,rfc);
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
                    System.out.println("Ingresa el dia de la consulta deseada");
                    int diaconsulta = sc.nextInt();
                    System.out.println("Ingresa el mes de la consulta");
                    int mesconsulta = sc.nextInt();
                    System.out.println("Ingresa el ano de la consulta");
                    int anoconsulta = sc.nextInt();
                    System.out.println("Ingresa la hora de la consulta");
                    int horaconsulta = sc.nextInt();
                    System.out.println("Ingresa los minutos de la consulta");
                    int minutosconsulta = sc.nextInt();

                    System.out.println("Ingresa el nombre del Paciente");
                    String pacienteNombre = sc.next();
                    System.out.println("Ingresa el nombre del medico");
                    String medicoNombre = sc.next();
                    System.out.println("Ingresa el numero del consultorio");
                    int consultorioNumero = sc.nextInt();

                    LocalDateTime fechaconsulta = LocalDateTime.of(anoconsulta, mesconsulta, diaconsulta, horaconsulta, minutosconsulta);
                    System.out.println();
                                        /*    Consultas consultas = new Consultas(fechaHora,pacienteNombre,medicoNombre,consultorioNumero);
                                            hospital.registrarConsulta(consultas);
                                            System.out.println("Consulta registrada correctamente");*/
                    break;
                case 8:
                    System.out.println("Datos de la Consulta");
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