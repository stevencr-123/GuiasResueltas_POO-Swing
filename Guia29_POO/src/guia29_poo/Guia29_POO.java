
package guia29_poo;

import javax.swing.JOptionPane;

public class Guia29_POO {
     

    public static void main(String[] args) {
     
             mostrarInfoObjeto();
    }
    
     public static void mostrarInfoObjeto(){
      Rectangulo Objeto;
        double area = 0;
        double peri = 0;
        Objeto = new Rectangulo();        
        area = Objeto.perimetro(Objeto.base, Objeto.altura); 
        peri = Objeto.area(Objeto.base, Objeto.altura);
        double nuevaAltura = Objeto.cuadrar(Objeto.getBase(), Objeto.getAltura());
        JOptionPane.showMessageDialog(null, "La base del Objeto es: "+ Objeto.getBase()+
                           "\nLa altura del Objeto es: "+ Objeto.getAltura()+
                           "\nEl área del Objeto es de: "+area+
                           "\nEl nuevo valor de la altura es: "+nuevaAltura+
                           "\nEl perimetro del Objeto es de:"+peri,
                           "Exito", JOptionPane.INFORMATION_MESSAGE);
    }
}
