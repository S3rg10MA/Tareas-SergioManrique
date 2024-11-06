public class Producto {
    //Sergio
    String nombre;
    Double precio;
    int cantidad;
    double total;


    public Producto(String nombre, Double precio, int cantidad) throws ProductoInvalidoException {

        if (nombre.isEmpty()){
            throw new ProductoInvalidoException("El nombre del producto no puede ser nulo");
        }
        if (precio <= 1 ){
            throw new PrecioInvalidoException("El precio del producto debe de ser mayor a 0");
        }
        if (cantidad < 0){
            throw new CantidadInvalidaException("La cantidad de producto que ingresa no puede ser negativa");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }



    public void calcularValorTotal(){

        total = getPrecio()*getCantidad();
    }
    public String mostrarDetalles(){
        return String.format("Nombre del Producto: %s \nPrecio del Producto: $%.2f \nPiezas con las que se cuenta: %d \nValor Total: $%.2f",
                nombre, precio, cantidad, total);
    }
}
