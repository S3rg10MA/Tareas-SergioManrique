package menu;

import hospital.Hospital;
import usuarios.pacientes.Paciente;

import java.util.Scanner;

public class MenuPaciente {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {

                System.out.println("\n** Sistema Hospital **\n");
                System.out.println("1. Ver mis consultas");
                System.out.println("2. Ver mis datos");
                System.out.println("3.- Ver mi expediente");
                System.out.println("4. Salir");

                System.out.println("Selecciona una opcion");
                int opcion = sc.nextInt();
                return opcion;
    }

    public void ProcesarDatosMenu(int opcion, Hospital hospital, Paciente paciente) {
        switch (opcion){
            case 1:
                hospital.verConsultasPaciente(paciente.getId());
                break;
            case 2:
                System.out.println("Estos son tus datos");
                hospital.vermisDatosPaciente(paciente.getId());
                break;
            case 3:
                System.out.println("Hasta Luego");
                break;
        }
    }
}
