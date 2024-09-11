public class Cuadrado {

      public  Double ladoUno;
      public  Double alturaUno;



        public Cuadrado(Double ladoUno, Double alturaUno) {

            this.ladoUno = ladoUno;
            this.alturaUno = alturaUno;
        }

        public String perimetrorectangulo(){
            return "El perimetro del rectangulo es: "+(this.alturaUno*2+
                    this.ladoUno*2);

        }
        public String arearectangulo(){

            return "El area del rectangulo es: "+(this.ladoUno*this.alturaUno);
        }


            public String perimetrorectangulo(Integer ladoUno, Integer alturaUno) {
                return "El perimetro del rectangulo es: " + (this.alturaUno * 2 +
                        this.ladoUno * 2);
            }

                public String arearectangulo(double ladoUno, double alturaUno){
                    return "El aread del rectangulo es: " + (this.ladoUno * this.alturaUno);
                }
            }






