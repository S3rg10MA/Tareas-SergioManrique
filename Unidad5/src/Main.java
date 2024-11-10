import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(new Habitacion("Individual", 50.0, true));
        habitaciones.add(new Habitacion("Doble", 75.0, true));
        habitaciones.add(new Habitacion("Suite", 150.0, true));

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n---Sistema de Reserva de Habitaciones:---\n");
            System.out.println("1.- Mostrar detalles de las habitaciones");
            System.out.println("2.- Realizar una reserva");
            System.out.println("3.- Liberar una habitacion");
            System.out.println("4.- Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    for (Habitacion hab : habitaciones) {
                        hab.mostrarDetalles();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("\nSelecciona el número del tipo de habitación que deseas: \n1.-Individual \n2.- Doble \n3.- Suite");
                        int tipo = sc.nextInt();
                        System.out.println("Ingresa cuántas noches deseas la habitación: ");
                        int noches = sc.nextInt();

                        Habitacion habitacion = habitaciones.get(tipo - 1);
                        habitacion.reservar(noches);
                        habitacion.calcularCosto(noches);
                    } catch (HabitacionNoDisponibleException | NumeroDeNochesInvalidoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el número de la habitación que deseas liberar \n1.-Individual \n2.- Doble \n3.- Suite");
                    int tipo = sc.nextInt();
                    habitaciones.get(tipo - 1).liberar();
                    break;
                case 4:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}