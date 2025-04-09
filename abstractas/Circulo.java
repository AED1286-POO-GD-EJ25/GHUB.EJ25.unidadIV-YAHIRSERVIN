package abstractas;
public class Circulo extends FiguraGeometrica {
    
    //ATRIBUTOS
    private double radio;
    //CONSTRUCTOR
    public Circulo(){
        super();
        this.radio = 0;
    }
    public Circulo(double r){
        super();
        this.radio = r;
    }
    public Circulo(double x, double y, double r){
        super(x,y);
        this.radio = r;
    }
    
    public double area(){
        return Math.PI * radio * radio;
    }
    public String toString(){
        return super.toString() + "\nRadio: " + radio;
    }
    public double getRadio() {
        return radio;
    } 
    
}