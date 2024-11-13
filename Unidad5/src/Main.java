
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int opcion = 0;
        while (opcion !=3){
            System.out.println("\n****Bienvenido****");
            System.out.println("1.- Escribir tarea.");
            System.out.println("2.- Leer tareas.");
            System.out.println("3.- Salir.");
            System.out.println("Selecciona una opcion:");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1:
                    System.out.println("Has seleccionado la opcion de escribir tarea.");
                    System.out.println("Escribe la tarea que deseas: ");
                    try (FileWriter writer = new FileWriter("Tareas.txt",true); BufferedWriter Tareas = new BufferedWriter(writer)){

                        String Tarea = sc.nextLine();
                        Tareas.write(Tarea+"\n");

                    }catch (Exception e){
                        System.out.println("Error al tratar de escribir el archivo "+e.getMessage());
                    }
                    break;
                    case 2:
                        System.out.println("Aqui estan las tareas registradas:\n");

                        try (BufferedReader Leer = new BufferedReader(new FileReader("Tareas.txt"))) {
                            String lectura;
                            while ((lectura = Leer.readLine()) != null) {
                                System.out.println(lectura+"\n");
                            }

                        }catch (Exception e){
                            System.out.println("\nError al intentar leer el archivo "+e.getMessage());
                        }
                        break;
                        case 3:
                            System.out.println("Hasta Luego");
                            return;
                            default:
                                System.out.println(" ERROR!!!!! Ingresa una opcion valida");
                                break;
            }
        }
    }
}