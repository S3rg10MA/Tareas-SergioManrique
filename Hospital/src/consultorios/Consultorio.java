package consultorios;

import java.util.Random;

public class Consultorio {
    public String idConsultorio;
    public int piso;
    public int numeroConsultorio;
    public Random random = new Random();

    public Consultorio(String idConsultorio,int piso, int numeroConsultorio) {
        this.idConsultorio = idConsultorio;
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getIdConsultorio() {
        return idConsultorio;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public String datosConsultorio() {
        return String.format("Id del Consultorio: %s, Piso: %d, Numero del Consultorio: %d",
                idConsultorio, piso, numeroConsultorio);
    }
}
