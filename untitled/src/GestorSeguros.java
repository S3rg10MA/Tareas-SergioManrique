

public class GestorSeguros {
    public static void main(String[] args) {
        SeguroAuto seguroAuto = new SeguroAuto("Marco",1000,22);
        System.out.println(seguroAuto.detallesSeguro());
        System.out.println("***********************");

        SeguroVida seguroVida = new SeguroVida("Melania",1000,61);
        System.out.println(seguroVida.detallesSeguro());
        System.out.println("***********************");

        SeguroHogar seguroHogar = new SeguroHogar("Morgan",1000,true);
        System.out.println(seguroHogar.detallesSeguro());
        System.out.println("***********************");
    }
}