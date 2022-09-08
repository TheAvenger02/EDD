package eva1.pkg14.paso.ref;

/**
 *
 * @author emiliomurillo
 */
public class EVA114PASOREF {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrayDatos = new int[100];
        llenar(arrayDatos);
        imprimir(arrayDatos);
        
    }
    public static void llenar(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 100;
        }
    }
    
    public static void imprimir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + array[i] + "]");   
        }
    }
    
}
