public class Enviointernacional extends Envio {

    private String destino;

    public Enviointernacional(double costoBase, double peso, String destino) {
        super(costoBase, peso);
        this.destino = destino;
    }
    @Override
    public String calcularTiempoyCostoentrega(){
        double costoAdicional = 0;
        double costoTotal = 0;
        int tiempoentrega =10;
        if (getPeso() > 10){
            tiempoentrega += 3;
            costoAdicional += getCostoBase()*0.20;
            costoTotal = getCostoBase()+costoAdicional;
        }else{
            costoTotal += 0;
        }
        return String.format("Costo original: $%.2f \nCosto Adicional: $%.2f \n Costo Total: $%.2f \nPeso del paquete: %.2fKg \nTiempo de Entrega: %d dias, Ubicacion: %s"
                ,getCostoBase(),costoAdicional,costoTotal,getPeso(),tiempoentrega, destino);

    }
}
