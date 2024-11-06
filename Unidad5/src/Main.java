
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Sergio
        Scanner sc = new Scanner(System.in);
        boolean datosValidos = false;

        while (!datosValidos) {
            try {
                System.out.println("Ingresa el nombre del Producto: ");
                String nombre = sc.nextLine();

                System.out.println("Ingresa el precio de cada producto: ");
                double precio = sc.nextDouble();

                System.out.println("Ingresa la cantidad de producto que tienes: ");
                int cantidad = sc.nextInt();

                Producto producto = new Producto(nombre, precio, cantidad);
                producto.calcularValorTotal();
                System.out.println(producto.mostrarDetalles());

                datosValidos = true;

            } catch (ProductoInvalidoException | PrecioInvalidoException | CantidadInvalidaException e) {
                System.out.println("Error!!! " + e.getMessage());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Entrada inválida. Asegúrate de ingresar los datos correctamente.");
                sc.nextLine();
            }
        }
        //Primer intento y solo quise agregar el while
        /* try {
                System.out.println("Ingresa el nombre del Producto: ");
                String nombre = sc.nextLine();
            System.out.println("Ingresa el precio de cada producto: ");
            double precio = sc.nextDouble();
            System.out.println("Ingresa la cantidad de producto que tienes: ");
            int cantidad = sc.nextInt();

            Producto producto = new Producto(nombre, precio, cantidad);
            producto.calcularValorTotal();
            System.out.println(producto.mostrarDetalles());

        }
        catch (ProductoInvalidoException| PrecioInvalidoException| CantidadInvalidaException e) {
            System.out.println("Error!!! "+e.getMessage());
            }*/
    }
}