import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {

//Sergio Manrique Ambriz
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tus datos:");
        System.out.println("Ingresos:");
        int ingresos = sc.nextInt();
        System.out.println("Porcentaje de Impuestos");
        Double porcentajeImpuestos = sc.nextDouble();
        System.out.println("Dividendos");
        Double dividendos = sc.nextDouble();
        System.out.println("Exencion");
        Double exencion = sc.nextDouble();

        System.out.println("\ncalculadora de Impuestos");
        CalculadoraImpuestos calculadoraUno = new CalculadoraImpuestos(ingresos,porcentajeImpuestos, dividendos,
                exencion);
        calculadoraUno.calcularImpuestos();
        calculadoraUno.calcularImpuestos(ingresos, porcentajeImpuestos);
        calculadoraUno.calcularImpuestos(ingresos, porcentajeImpuestos,dividendos);
    }
}
