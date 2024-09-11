public class CalculadoraImpuestos {

        int ingresos;
        double porcentajeImpuestos;
        double dividendos;
        double exencion;

        public CalculadoraImpuestos(int ingresos, double porcentajeImpuestos, double dividendos,
                                    double exencion) {
            this.ingresos = ingresos;
            this.porcentajeImpuestos = porcentajeImpuestos;
            this.dividendos = dividendos;
            this.exencion = exencion;

        }

        public void calcularImpuestos() {
            System.out.println("Tus ingresos son: $"+this.ingresos+0.15);
        }
        public void calcularImpuestos(int ingresos, double porcentajeImpuestos) {
            System.out.println("El porcentaje de impuestos por tus ingresos es de: $"
            +(this.ingresos*(this.porcentajeImpuestos/100)));
        }
        public void calcularImpuestos(int ingresos,double porcentajeImpuestos, double dividendos) {
            Double calcular=this.dividendos*(this.porcentajeImpuestos/100);
            Double calcularExcencion=calcular-this.exencion;
            System.out.println("Los impuestos con la Excencion son de: $"+calcularExcencion);
        }
}
