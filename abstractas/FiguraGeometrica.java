package abstractas;
    public abstract class FiguraGeometrica {
     

        //ATRIBUTOS
        protected double x;
        protected double y;
        //CONSTRUCTOR
        public FiguraGeometrica (){
            x = 0;
            y = 0;
        }
        public FiguraGeometrica (double x, double y){
            this.x = x;
            this.y = y;
        }
        //METODOS ABSTRACTOS
        public abstract double area();
        //METODO CONCRETOS
        public String toString(){
            return "Area: " + area();
        }

    }
