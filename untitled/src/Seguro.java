public abstract class Seguro {

    private String nombre;
    private double valorAsegurado;
    protected double pagoFinal;

    public Seguro(String nombre, double valorAsegurado) {
        this.nombre = nombre;
        this.valorAsegurado = valorAsegurado;
        this.pagoFinal = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public double getValorAsegurado() {
        return valorAsegurado;
    }

    public abstract void calcularPrima();

    public String detallesSeguro() {
        return String.format("Nombre: %s\nValor asegurado: %.2f\nPrima Total: $%.2f",
                nombre, valorAsegurado, pagoFinal);
    }
}
