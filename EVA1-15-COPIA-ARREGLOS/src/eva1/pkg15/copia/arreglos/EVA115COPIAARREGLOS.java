package eva1.pkg15.copia.arreglos;

/**
 *
 * @author emiliomurillo
 */
public class EVA115COPIAARREGLOS {
    
    public static void main(String[] args) {
        int[] arrayDatos = new int[100];
        //Copia de los valores almecenados en el arreglo
        int[] arrayCopia = new int[arrayDatos.length];
        //Llenar el arreglo con números aleatorios
        llenar(arrayDatos);
        //Imprimir el arreglo
        imprimir(arrayDatos);
        
        //Copia de los valores
        for (int i = 0; i < arrayDatos.length; i++) {
            arrayCopia[i] = arrayDatos[i];
        }
        
        //Imprimir el arreglo Copia
        System.out.println("");
        imprimir(arrayCopia);
        System.out.println("");
        
        //Ciclo que agrega del último valor al primero
        for (int i = 0; i < arrayDatos.length; i++) {
            for(int j = 0; j < arrayDatos.length; j++){
                arrayCopia[j] = arrayDatos[(arrayDatos.length - 1) - j];
            }
        }
        
        //Imprimir el arreglo Copia
        imprimir(arrayCopia);
 
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