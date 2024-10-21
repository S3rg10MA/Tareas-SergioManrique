package expedientes;

import consultas.Consultas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Expediente {
    public String id;
    public Consultas consulta;
    public String observaciones;
    public LocalDateTime fechaExpediente;

    public Expediente(Consultas consulta, String observaciones) {
        this.id = generarId();
        this.consulta = consulta;
        this.observaciones = observaciones;
        this.fechaExpediente = LocalDateTime.now();
    }
    public String getId() {
        return id;
    }

    public Consultas getConsulta() {
        return consulta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public LocalDateTime getFechaExpediente() {
        return fechaExpediente;
    }

    public String generarId(){
        Random rand = new Random();
        LocalDate fechas = LocalDate.now();
        int anoActual = fechas.getYear();
        int mesActual = fechas.getMonthValue();

        int numeroAleatorio = rand.nextInt(1, 100000);

        return String.format("E%d%d%d",anoActual,mesActual,numeroAleatorio);

    }
}
