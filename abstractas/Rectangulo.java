package abstractas;
    public class Rectangulo extends FiguraGeometrica {

        //ATRIBUTOS
        private double base;
        private double altura;
        //CONSTRUCTOR
        public Rectangulo(){
            super();
            
        }
        public Rectangulo(double b, double h){
            super();
            this.base = b;
            this.altura = h;
        }
        public Rectangulo(double x, double y, double b, double h){
            super(x,y);
            this.base = b;
            this.altura = h;
        }


    }