public class SeguroVida extends Seguro {

    private int edad;

    public SeguroVida(String nombre, double valorAsegurado, int edad) {
        super(nombre, valorAsegurado);
        this.edad = edad;
    }

    @Override
    public void calcularPrima() {
        pagoFinal = 400 + (getValorAsegurado() * 0.015);
        if (edad > 60) {
            pagoFinal *= 1.25; // Aplica recargo del 25% si el titular tiene más de 60 años
        }
    }

    @Override
    public String detallesSeguro() {
        calcularPrima();
        return String.format("Seguro de Vida:\n%s\nEdad del Titular: %d\n", super.detallesSeguro(), edad);
    }
}
