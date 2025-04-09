package abstractas;
public class Circulo extends FiguraGeometrica {
    
    //ATRIBUTOS
    private double radio;
    //CONSTRUCTOR
    public Circulo(){
        
    }  
    public Circulo(double r){
        super("Circulo");
        this.radio = r;
    }
    public Circulo(double x, double y, double r){
        super("Circulo");
        this.radio = r;
    }
    
   public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
   }
    
}