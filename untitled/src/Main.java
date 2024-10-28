

public class Main {
    public static void main(String[] args) {

        Envionacional envionacional = new Envionacional(300,6.0,200);
        envionacional.validarPeso();
        System.out.println(envionacional.calcularTiempoyCostoentrega());

        System.out.println("************");

        Enviointernacional enviointernacional = new Enviointernacional(500,12.0,"Espania");
        enviointernacional.validarPeso();
        System.out.println(enviointernacional.calcularTiempoyCostoentrega());
    }

}