package menu;

import hospital.Hospital;
import usuarios.medicos.Medico;

import java.util.Scanner;

public class MenuMedico {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {


            System.out.println("\n** Sistema Hospital **\n");
            System.out.println("1. Ver mis consultas actuales");
            System.out.println("2. Ver mis usuarios.medicos.pacientes");
            System.out.println("3. Consutar paciente");
            System.out.println("4. Consultar mis datos");
            System.out.println("5. Consultar historial del paciente");
            System.out.println("6.- Completar Consulta");
            System.out.println("7. Salir");

            System.out.println("Selecciona una opcion");
            int opcion = sc.nextInt();
            return opcion;

    }

    public void ProcesarDatosMenu(int opcion, Medico medico, Hospital hospital) {
        switch (opcion){
            case 1:
                System.out.println("\nEstas son tus consultas asignadas: ");
                hospital.verConsultasDoctor(medico.getId());
                break;
            case 2:
                hospital.mostrarPacientes();
                break;
            case 3:
                break;
            case 4:
                System.out.println("Estos son tus datos: ");
                hospital.verMisDatosDoctor(medico.getId());
                break;
            case 5:
                System.out.println("Hasta luego");
                break;
        }
    }
}
