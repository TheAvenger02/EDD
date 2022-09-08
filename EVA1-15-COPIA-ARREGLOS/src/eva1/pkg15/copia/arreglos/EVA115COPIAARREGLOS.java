package eva1.pkg15.copia.arreglos;

/**
 *
 * @author emiliomurillo
 */
public class EVA115COPIAARREGLOS {
    
    public static void main(String[] args) {
        int[] arrayDatos = new int[100];
        //Copias de los valores almecenados en el arreglo
        int[] arrayCopia = new int[arrayDatos.length];
        llenar(arrayDatos);
        imprimir(arrayDatos);
        //Copia de los valores
        for (int i = 0; i < arrayDatos.length; i++) {
            arrayCopia[i] = arrayDatos[i];
        }
        System.out.println("");
        imprimir(arrayCopia);
        System.out.println("");
        //Copiar del último al 1° valor
        for (int i = arrayCopia.length-1; i >= 0; i--) {
            System.out.print("[" + arrayCopia[i] + "]");   
        }       
       //for(int i = 0; i < arrayDatos.length; i++){
       //arrayCopia[i = arrayDatos[(arrayDatos.length - 1) - 1];
       //}
       //imprimir(arrayCopia);
    }
    public static void llenar(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
        }
    }
    
    public static void imprimir(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");   
        }
    }
}