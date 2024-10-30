public class SeguroHogar extends Seguro{


    private boolean zonaRiesgo;


    public SeguroHogar(String nombre, double valorAsegurado, boolean zonaRiesgo) {
        super(nombre, valorAsegurado);
        this.zonaRiesgo = zonaRiesgo;
    }

    @Override
    public void calcularPrima() {
        pagoFinal = 500 + (getValorAsegurado() * 0.02);
        if (zonaRiesgo) {
            pagoFinal *= 1.20;
        }
    }

    @Override
    public String detallesSeguro() {
        calcularPrima();
        return String.format("Seguro de Hogar:\n%s\nZona de Riesgo: %s\n", super.detallesSeguro(),
                zonaRiesgo ? "Sí" : "No");
    }
}
