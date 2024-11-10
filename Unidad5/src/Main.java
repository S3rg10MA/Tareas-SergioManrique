
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Sergio
        Scanner sc = new Scanner(System.in);

        Habitacion habitacion = new Habitacion();

        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(new Habitacion("Individual", 50.0));
        habitaciones.add(new Habitacion("Doble", 75.0));
        habitaciones.add(new Habitacion("Suite", 150.0));

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n---Sistema de Reserva de Habitaciones:---\n");
            System.out.println("1.- Mostrar detalles de las habitaciones");
            System.out.println("2.- Realizar una reserva");
            System.out.println("3.- Liberrar una habitacion");
            System.out.println("4.- Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    for (Habitacion habitacions : habitaciones) {
                        habitacion.mostrarDetalles();
                    }
                    break;
                    case 2:

                        try {
                            System.out.println("\nSelecciona el numero del tipo de habitacion que deseas: \n1.-Individual. \n2.- Doble. \n3.- Suite");
                            String tipo = sc.next();
                            System.out.println("Ingresa cuantas noches deseas la habitacion ");
                            int Noche = sc.nextInt();

                            habitacion = new Habitacion(tipo, Noche);

                        } catch (HabitacionNoDisponibleException | NumeroDeNochesInvalidoException e) {
                            System.out.println(e.getMessage());
                            }
                        System.out.println("Reservacion hecha correctamente");

                        break;
                        case 3:

                            break;
                            case 4:
                                System.out.println("Hasta Luego");
                                return;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
            }
        }
    }
}