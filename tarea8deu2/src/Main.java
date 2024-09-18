import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
//Sergio Manrique Ambriz.
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Registrar Categoria");
            System.out.println("5. Mostrar Categoria");
            System.out.println("6. Mostrar Categorias y Productos");
            System.out.println("7. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if(!inventario.validarExistenciadeCategorias()){
                        System.out.println("No existen categorias en el sistema");
                        break;
                    }
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.println("Ingresa el nombre del producto");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el precio del producto");
                    double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = scanner.nextLine();


                    int idCategoria = scanner.nextInt();
                    Categoria categoria = null;
                    while (categoria == null) {
                        System.out.println("Ingresa el ID de la categoría en la cual registrarás el producto:");
                        int idcategoria = scanner.nextInt();


                        categoria = inventario.buscarCategoriaPorId(idcategoria);
                        if (categoria == null) {
                            System.out.println("Categoría no encontrada. Por favor, intenta nuevamente.");
                        }
                    }

                    scanner.nextLine();

                    System.out.println("Ingresa el stock del producto");
                    int stock = scanner.nextInt();

                    System.out.println(nombre);

                    Producto producto = new Producto(nombre, precio, descripcion, categoria.id, stock);
                    inventario.registrarProducto(producto);

                    categoria.registrarProducto(producto);


                    System.out.println("\nProducto registrado correctamente");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.println("Ingresa el ID del producto: ");
                    int id = scanner.nextInt();

                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;
                case 4:
                    //mostrar solo la categoria
                    System.out.println("Seleccionaste la opcion para agregar una categoria");
                    System.out.println("Ingresa el nombre de la categoria: ");
                    String nombreCategoria= scanner.nextLine();

                    Categoria nuevacategoria = new Categoria(nombreCategoria);
                    inventario.registrarCategoria(nuevacategoria);
                    System.out.println("\nCategoria registrado correctamente");

                    break;
                case 5:
                    System.out.println("Aqui estan las categorias registradas");
                    inventario.mostrarcategorias();

                    break;
                case 6:
                    System.out.println("Aqui estan las categorias con sus productos:");
                    inventario.mostrarCategoriasProductos();
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
}