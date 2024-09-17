import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Sergio Manrique Ambriz.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre del producto");
        String nombreProducto = sc.nextLine();
        System.out.println("Ingresa el precio del producto");
        double precioProducto = sc.nextDouble();

        int stock=0;


        Producto2 producto = new Producto2(nombreProducto, precioProducto);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n**Deseas modificar el Stock**");
            System.out.println("1. Aumentar Stock");
            System.out.println("2. Reducir Stock");
            System.out.println("3. Mostrar Informacion");
            System.out.println("4. Salir");

            System.out.println("Selecciona una Opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste aumentar Stock");
                    System.out.println("Ingresa la cantidad a aumentar");
                    int cantidad = sc.nextInt();
                    producto.aumentarStock(cantidad);
                    break;
                    case 2:
                        System.out.println("Seleccionaste reducir Stock");
                        System.out.println("Ingresa la cantidad a reducir");
                        int cantidad2 = sc.nextInt();
                        producto.reducirStock(cantidad2);
                        break;
                        case 3:
                            producto.mostrar();
                            break;
                            case 4:
                                System.out.println("Hasta luego");
                                return;
            }

        }
    }
}