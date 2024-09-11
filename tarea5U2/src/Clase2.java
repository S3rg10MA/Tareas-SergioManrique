import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu sueldo");
        Double sueldobase= sc.nextDouble();
        System.out.println("Ingresa tu bonificacion");
        Double bonificacion= sc.nextDouble();
        System.out.println("Ingresa tus horas Extras trabajadas");
        Double horasextra= sc.nextDouble();

        System.out.println("\nEmpleado");
        Empleado empleadoUno = new Empleado(sueldobase, bonificacion,horasextra);
        //empleadoUno.mostrarInfo();
        empleadoUno.calcularSalario(sueldobase);
        empleadoUno.calcularSalario(sueldobase,bonificacion);
        empleadoUno.calcularSalario(sueldobase,bonificacion,horasextra);


    }
}
