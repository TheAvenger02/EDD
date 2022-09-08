package práctica.pkg5;

/**
 *
 * @author emiliomurillo
 */
public class Práctica5 {

    public static void main(String[] args) {
    int[] arrayDatos = new int[50];
    int[] arrayPares = new int[arrayDatos.length];
    int[] arrayImpares = new int[arrayDatos.length];
    for (int i = 0; i < arrayDatos.length; i++) {
            arrayDatos[i] = ((int)(Math.random() * 100))+1;
    }
    for (int i = 0; i < arrayDatos.length; i++) {
        if(arrayDatos[i]%2==0){
            arrayPares[i] = arrayDatos[i];
        }
        else{
            arrayImpares[i] = arrayDatos[i];
        }
    }
        System.out.println("Los números pares en el arreglo son: ");
    for(int i = 0; i <arrayDatos.length; i++){
        if(arrayPares[i] != 0){
        System.out.print("[" + arrayPares[i] + "]");
        }
    }
        System.out.println("");
        System.out.println("Los números impares en el arreglo son: ");
    for(int i = 0; i <arrayDatos.length; i++){
        if(arrayImpares[i] != 0){
        System.out.print("[" + arrayImpares[i] + "]");
        }
    }
    
    }
}
//Crear un arreglo con 50 elementos, llenarlo con valores aleatorios entre 1 y 100 e imprimir una lista con los valores pares que contenga.
//Guardar los pares en un arreglo nuevo (tamaño exacto)