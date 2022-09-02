package eva1.pkg12.copia.objetos;

/**
 *
 * @author emiliomurillo
 */
public class EVA112COPIAOBJETOS {

    public static void main(String[] args) {
        int valor, copiaValor;
        //Paso por valor
        valor = 100;
        copiaValor = valor;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        valor++;
        System.out.println("Valor = " + valor);
        System.out.println("Copia = " + copiaValor);
        //Copia por dirección
        PruebaValor prueba = new PruebaValor();
        prueba.x = 1000;
        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia = prueba;
        System.out.println("Ahora con objetos: ");
        System.out.println("Prueba: " + prueba.x);
        System.out.println("Prueba Copia: " + pruebaCopia.x);
        prueba.x++;
        System.out.println("Prueba: " + prueba.x);
        System.out.println("Prueba Copia: " + pruebaCopia.x);
    }
    
}

class PruebaValor{
    int x;
}
