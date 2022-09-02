package eva1.pkg13.paso.valor.ref;

/**
 *
 * @author emiliomurillo
 */
public class EVA113PASOVALORREF {

    public static void main(String[] args) {
       int valorPrueba = 100;
        System.out.println("Valor = " + valorPrueba);
        incVal(valorPrueba);
        System.out.println("Valor incrementado = " + valorPrueba);
        
        PruebaValor prueba = new PruebaValor();
        prueba.x = 100;
        System.out.println("Valor [obj] = " + prueba.x);
        incVal(prueba);
        System.out.println("Valor [obj] = " + prueba.x);
    }
    
public static void incVal(int valor){
    valor++;
}

public static void incVal(PruebaValor pruebaVal){
    pruebaVal.x++;
}

}

class PruebaValor{
    int x;
}