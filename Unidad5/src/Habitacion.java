import java.util.ArrayList;

public class Habitacion {

    String tipoHabitacion;
    private double precioPorNoche;
    private boolean disponible;


    public Habitacion() {
        this.tipoHabitacion = "";
        this.precioPorNoche= 0;


    }

    public Habitacion(String tipoHabitacion, double precioPorNoche) {
        this.tipoHabitacion = tipoHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true;

    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public  double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void reservar(int noches) throws HabitacionNoDisponibleException, NumeroDeNochesInvalidoException {
        if (!disponible) {
            throw new HabitacionNoDisponibleException("La habitación ya está ocupada.");
        }
        if (noches < 1) {
            throw new NumeroDeNochesInvalidoException("El número de noches debe ser al menos 1.");
        }
            disponible = false;
            double costoTotal = noches * precioPorNoche;
            System.out.println("Reserva exitosa para " + noches + " noches.");
            System.out.println("Costo total de la reserva: $" + costoTotal);
        }

    public void liberarHabitacion() {
        disponible = true;
        System.out.println("La habitación ha sido liberada y está disponible nuevamente.");
    }

    public void mostrarDetalles() {
        System.out.println("Tipo de habitación: " + getTipoHabitacion());
        System.out.println("Precio por noche: $" + getPrecioPorNoche());
        System.out.println("Disponibilidad: " + (disponible ? "Disponible" : "No Disponible"));
    }
}
