package consultorios;

import java.util.Random;

public class Consultorio {
    public int id;
    public int piso;
    public int numeroConsultorio;
    public Random random = new Random();

    public Consultorio(int piso, int numeroConsultorio) {
        this.id = this.random.nextInt(1, 10001);
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }

    public int getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public String datosConsultorio() {
        return String.format("Id del Consultorio: %d, Piso: %d, Numero del Consultorio: %d",
                id, piso, numeroConsultorio);
    }
}
