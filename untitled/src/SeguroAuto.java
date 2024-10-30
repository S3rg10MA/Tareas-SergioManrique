public class SeguroAuto extends Seguro {

    private int edad;

    public SeguroAuto(String nombre, double valorAsegurado, int edad) {
        super(nombre, valorAsegurado);
        this.edad = edad;
    }


    public int getEdad() {
        return edad;
    }

    @Override
    public void calcularPrima(){
        pagoFinal = 300 +(getValorAsegurado()*0.05);
        if (edad < 25){
            pagoFinal *= 1.15;
        }
    }


    @Override
    public String detallesSeguro(){
        calcularPrima();
        return String.format("Seguro de Auto: %s \nEdad del propietario: %d",super.detallesSeguro(),edad);
    }
}
