import consultas.Consultas;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion=0;

        while (opcion != 9){
            System.out.println("**Bienvenido**");
            System.out.println("1.Ingresar datos del Paciente");
            System.out.println("2. Mostrar datos del Paciente");
            System.out.println("3.Ingresar datos del Doctor");
            System.out.println("4. Mostrar datos del Doctor");
            System.out.println("5. Registrar Consultorio");
            System.out.println("6. Mostrar Datos del Consultorio");
            System.out.println("7. Registrar Consultas");
            System.out.println("8. Mostrar Datos del Consultas");
            System.out.println("9. Salir");

            System.out.println("**Selecciona una opcion**");
            opcion = sc.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Ingresa los datos del Paciente");
                    System.out.println("Ingresa el Nombre del Paciente");
                    String nombre = sc.next();
                    System.out.println("Ingresa el Apellido del Paciente");
                    String apellido = sc.next();
                    System.out.println("Ingresa la fecha de Nacimiento del Paciente");
                    String fechaNacimiento = sc.next();
                    System.out.println("Ingresa el Numero de Telefono del Paciente");
                    String telefono = sc.next();
                    System.out.println("Ingresa el tipo de sangre del Paciente");
                    String tipoSangre = sc.next();
                    System.out.println("Ingresa el sexo del Paciente");
                    Character sexo = sc.next().charAt(0);

                    Paciente paciente = new Paciente(nombre, apellido, fechaNacimiento, telefono, tipoSangre, sexo);
                    System.out.println("Datos del Paciente registrados Correctamente");
                    break;
                    case 2:
                        System.out.println("Aqui estan los datos del paciente");

                        break;
                        case 3:
                            System.out.println("Ingresa los datos del doctor");
                            System.out.println("Ingresa el Nombre del doctor");
                            String nombreDoctor = sc.next();
                            System.out.println("Ingresa el Apellido del doctor");
                            String apellidoDoctor = sc.next();
                            System.out.println("Ingresa la fecha de Nacimiento del doctor");
                            String fechaNacDoctor = sc.next();
                            System.out.println("Ingresa el Numero de Telefono del doctor");
                            String telefonoDoctor = sc.next();
                            System.out.println("Ingresa el RFC del doctor");
                            String rfc = sc.next();

                            Medico medico = new Medico(nombreDoctor, apellidoDoctor, fechaNacDoctor, telefonoDoctor, rfc);
                            System.out.println("Datos del Doctor registrados Correctamente");
                            break;
                            case 4:
                                System.out.println("Datos del Doctor:");

                                break;
                                case 5:
                                    System.out.println("Ingresa los datos del Consultorio:");
                                    System.out.println("Ingresa el Piso del Consultorio");
                                    int piso = sc.nextInt();
                                    System.out.println("Ingresa el numero del consultorio");
                                    int numeroConsultorio = sc.nextInt();

                                    Consultorio consultorio = new Consultorio(piso, numeroConsultorio);
                                    System.out.println("Datos del Consultorio registrados correctamente");
                                    break;
                                    case 6:
                                        System.out.println("Datos del Consultorio:");

                                        break;
                                        case 7:
                                            System.out.println("Ingresa los datos de la consulta");
                                            System.out.println("Ingresa la Fecha y Hora");
                                            String fechaHora = sc.next();
                                            System.out.println("Ingresa el nombre del Paciente");
                                            String pacienteNombre = sc.next();
                                            System.out.println("Ingresa el nombre del medico");
                                            String medicoNombre = sc.next();
                                            System.out.println("Ingresa el numero del consultorio");
                                            int consultorioNumero = sc.nextInt();
                                            break;
                                            case 8:
                                                System.out.println("Datos de la Consulta");
                                                break;
                                                case 9:
                                                    System.out.println("Hasta Luego");
                                                    return;
            }
        }

    }
}