public class Producto2 {

    private String nombreProducto;
    private Double precioProducto;
    private int stock;

    public Producto2(String nombreProducto, Double precioProducto, int stock) {
        setNombreProducto(nombreProducto);
        setPrecioProducto(precioProducto);
        setStock(stock);
    }
    public Producto2(String nombreProducto, Double precioProducto) {
        this(nombreProducto, precioProducto, 0);
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public String setNombreProducto(String nombreProducto) {
        if (nombreProducto == null || nombreProducto.trim().isEmpty()) {
            System.out.println("El nombre del producto no puede estar vacio");
            System.out.println("Intentalo nuevamente");
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }else{
             return this.nombreProducto = nombreProducto;
        }

    }
    public Double getPrecioProducto() {
        return precioProducto;
    }
    public Double setPrecioProducto(Double precioProducto) {
        if (precioProducto < 0 ) {
            System.out.println("El precio del producto no puede ser negativo");
            System.out.println("Intentalo nuevamente");
            throw new IllegalArgumentException("El precio del producto no puede ser negativo.");
        }
         return this.precioProducto = precioProducto;
    }
    public int getStock() {
        return stock;
    }
    public int setStock(int stock) {
        if (stock < 0) {
            System.out.println("El stock del producto no puede ser negativo");
            throw new IllegalArgumentException("El stock del producto no puede ser negativo.");
        }
        return this.stock = stock;
    }

    public void aumentarStock(int cantidad) {
        if (cantidad < 0) {
            System.out.println("El cantidad a aumentar del producto no puede ser negativo");
            throw new IllegalArgumentException("El stock a aumentar no puede ser negativo");
        }
        this.stock += cantidad;
    }

    public void reducirStock(int cantidad2) {
        if (cantidad2 < 0) {
            System.out.println("La cantidad del stock a reducir no puede ser nagativo");
            throw new IllegalArgumentException("El stock a reducir no puede ser negativo.");
        }
        if (cantidad2 > this.stock) {
            System.out.println("La cantidad a reducir el stock no puede ser mayor que la cantidad del stock actual");
            throw new IllegalArgumentException("La cantidad a reducir no debe ser mayor que el stock actual");
        }
        this.stock -= cantidad2;
    }


    public void mostrar() {
        System.out.println("Nombre del producto: " + getNombreProducto());
        System.out.println("Precio del producto: " + getPrecioProducto());
        System.out.println("Stock del producto: " + getStock());
    }
}
