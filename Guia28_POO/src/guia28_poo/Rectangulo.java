
package guia28_poo;

public class Rectangulo{
    double base;
    double altura;
    String unidadMedida;
    int identificador;

    public Rectangulo(double base, double altura, String unidadMedida, int identificador) {
        this.base = base;
        this.altura = altura;
        this.unidadMedida = unidadMedida;
        this.identificador = identificador;
    }

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

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }


 
   public double area(double base, double altura){
       double area = base*altura;
       return area;
   }
   
   public double perimetro(double base, double altura){
       double perimetro = base*2+altura*2;
       return perimetro;
   }
}