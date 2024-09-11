import java.sql.SQLOutput;

public class Empleado {

    double sueldobase;
    double bonificacion;
    double horasextra;

    public Empleado(Double sueldobase, Double bonificacion, Double horasextra) {
        this.sueldobase= sueldobase;
        this.bonificacion= bonificacion;
        this.horasextra= horasextra;
    }

   /* public void mostrarInfo(){
        System.out.println("Tu salario es de : $"+this.sueldobase);
        if (bonificacion ==0.0){
            System.out.println("Tu salario es: $"+this.sueldobase);
        }else{
            System.out.println("Tu salario con bonificacion es de:  $"+(this.sueldobase+
                    this.bonificacion));
        }
        if (horasextra ==0.0){
            System.out.println("Tu paga sera de: $"+this.sueldobase);

        }else{
            double extra=(horasextra*20);
            System.out.println("Tu paga por las horas extras es de : $"+extra);
            System.out.println("Tu paga Final de tu sueldo mas bonificacion mas las " +
                    "horas extras sera de: $"+(this.sueldobase+this.bonificacion+extra));
        }
    }*/
            public void calcularSalario(double sueldobase){
        System.out.println("Tu salario es de: $"+this.sueldobase);
    }
    public void calcularSalario(double sueldobase, double bonificacion){
        if(this.bonificacion != 0.0){
           Double bonifi= this.sueldobase+this.bonificacion;
            System.out.println("Tu paga del salario mas la bonificacion" +
                    " es de: $"+bonifi);
        }
    }
    public void calcularSalario(double sueldobase, double bonificacion, double horasextra){
        if(this.horasextra != 0.0){
            Double extra=(this.horasextra*20);
            System.out.println("Tu paga del salario mas la bonificacion mas " +
                    "las horas extras es de: $"+(this.sueldobase+this.bonificacion+extra));
        }
    }
}
