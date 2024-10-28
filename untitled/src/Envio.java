public abstract class Envio {

    private double costoBase;
    private double peso;

    public Envio(double costoBase, double peso) {
        this.costoBase = costoBase;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    public double getCostoBase() {
        return costoBase;
    }

    public void validarPeso(){
        if (this.peso <= 0) {
            System.out.println("Peso invalido");
        }else{
            System.out.println("Peso valido");
        }
    }

    public abstract String calcularTiempoyCostoentrega();
}
