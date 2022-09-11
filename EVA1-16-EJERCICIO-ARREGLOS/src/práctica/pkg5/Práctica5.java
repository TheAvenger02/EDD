package práctica.pkg5;

/**
 *
 * @author emiliomurillo
 */
public class Práctica5 {

    public static void main(String[] args) {
    int[] arrayDatos = new int[50];
    int contPar = 0, contImpar = 0;
    for (int i = 0; i < arrayDatos.length; i++) {
            arrayDatos[i] = ((int)(Math.random() * 100))+1;
            if((arrayDatos[i]%2)==0){
                contPar++;
            }
            else{
                contImpar++;
            }
    }
    int[] arrayPares = new int[contPar];
    int[] arrayImpares = new int[contImpar];
    int contPares = 0, contImpares = 0;
    for (int i = 0; i < arrayDatos.length; i++) {
        if(arrayDatos[i]%2==0){
            arrayPares[contPares] = arrayDatos[i];
            contPares++;
        }
        else{
            arrayImpares[contImpares] = arrayDatos[i];
            contImpares++;
        }
    }
        System.out.println("Los números pares en el arreglo son: ");
    for(int i = 0; i <arrayPares.length; i++){
        System.out.print("[" + arrayPares[i] + "]");
    }
        System.out.println("");
        System.out.println("Los números impares en el arreglo son: ");
    for(int i = 0; i <arrayImpares.length; i++){
        System.out.print("[" + arrayImpares[i] + "]");
    }
    
    }
}
//Crear un arreglo con 50 elementos, llenarlo con valores aleatorios entre 1 y 100 e imprimir una lista con los valores pares que contenga.
//Guardar los pares en un arreglo nuevo (tamaño exacto)