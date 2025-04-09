package abstractas;
    public abstract class FiguraGeometrica {
     

        //ATRIBUTOS
        protected double x;
        protected double y;
        protected String nombre;
        
        //CONSTRUCTOR
        public FiguraGeometrica (){
            x = 0;
            y = 0;
        }
        public FiguraGeometrica (double x, double y){
            this.x = x;
            this.y = y;
        }
        public FiguraGeometrica(String nom){
            this.nombre = nom;
        }
        //METODOS ABSTRACTOS
        public abstract double area();
        //METODO CONCRETOS
        public static double areaPromedio(FiguraGeometrica arr[]){
            double suma = 0;
            for(int i = 0; i < arr.length; i++){
                suma = suma + arr[i].area();
            }
            return suma / arr.length;
        }

        public String toString(){
            return nombre + "Area: " + area();
        }

    }
