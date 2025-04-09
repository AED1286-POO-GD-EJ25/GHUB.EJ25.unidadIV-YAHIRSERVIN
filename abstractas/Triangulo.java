package abstractas;
public class Triangulo extends FiguraGeometrica {
    
    //ATRIBUTOS
    private double base;
    private double altura;
    //CONSTRUCTOR
    public Triangulo(){
        super("Triangulo");
        
    }
    public Triangulo(double b, double h){
        super("Triangulo");
        this.base = b;
        this.altura = h;
    }
    public Triangulo(double x, double y, double b, double h){
        super(x,y);
        this.base = b;
        this.altura = h;
    }
    
    public double area(){
        return (base * altura) / 2;
    }
    
}