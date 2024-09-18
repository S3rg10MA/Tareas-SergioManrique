import java.util.ArrayList;

public class Inventario {

    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public ArrayList<Categoria> listaCategorias = new ArrayList<>();

    public void registrarProducto(Producto producto) {

        this.listaProductos.add(producto);
    }

    public void registrarCategoria(Categoria categoria) {

        this.listaCategorias.add(categoria);
    }

    public void eliminarProducto(int idProductoEliminar) {
        int longitudOriginal = this.listaProductos.size(); // 3

        this.listaProductos.removeIf((producto) -> producto.getId() == idProductoEliminar);

        if (longitudOriginal != this.listaProductos.size()) {
            System.out.println("Se eliminó el prodcuto con el ID: " + idProductoEliminar);
        } else {
            System.out.println("No existe un producto con el ID: " + idProductoEliminar);
        }
    }

    public void mostrarProductos() {
        System.out.println("\n*** PRODUCTOS EN EL SISTEMA ***");

        if (this.listaProductos.size() == 0) {
            System.out.println("\nNo existen productos en el sistema");
            return;
        }

        int iterador = 1;
        for (Producto producto : this.listaProductos) {
            System.out.println("\nEste es el producto: " + iterador);
            System.out.println(producto.mostrarProducto());
            iterador++;
        }
    }
    public void mostrarcategorias(){
        System.out.println("\n*** CATEGORIAS EN EL SISTEMA ***");
        if (this.listaCategorias.size() == 0) {
            System.out.println("\nNo existen categorias");
            return;

        }
        for (Categoria categoria : this.listaCategorias) {
            System.out.println(categoria.mostrarsoloCategoria());
        }
    }

    public void mostrarCategoriasProductos() {
        System.out.println("\n*** CATEGORIA ***");
        if (this.listaCategorias.size() == 0) {
            System.out.println("\nNo existen categorias");
            return;
        }
        for (Categoria categoria : this.listaCategorias) {
            System.out.println(categoria.mostrarsoloCategoria());

            if (categoria.listaProductos.size() == 0) {
                System.out.println("\nNo existen productos registrado en esta categoria");

            }else{
                for (Producto producto : categoria.listaProductos) {
                    System.out.println("**Productos**");
                    System.out.println(producto.mostrarProducto());
                }
            }
        }
    }
    public Categoria buscarCategoriaPorId(int idCategoria) {
        for (Categoria categoria : this.listaCategorias) {
            if (categoria.id == idCategoria) {
                return categoria;
            }
        }
        return null;
    }

    public boolean validarExistenciadeCategorias() {
        return this.listaCategorias.size() > 0;
    }
}