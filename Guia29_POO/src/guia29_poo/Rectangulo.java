
package guia29_poo;

public class Rectangulo {
    double base = 100;
    double altura = 50;

    public Rectangulo() {
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
       public double area(double base, double altura){
       double area = base*altura;
       return area;
   }
   
   public double perimetro(double base, double altura){
       double perimetro = base*2+altura*2;
       return perimetro;
   }
    
   public double cuadrar(double base, double altura){
       return altura = base;
   }
}
