package abstractas;
public class Triangulo extends FiguraGeometrica {
    
    //ATRIBUTOS
    private double base;
    private double altura;
    //CONSTRUCTOR
    public Triangulo(){
        super();
        this.base = 0;
        this.altura = 0;
    }
    public Triangulo(double b, double h){
        super();
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