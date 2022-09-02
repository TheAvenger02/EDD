/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1.pkg14.paso.ref;

/**
 *
 * @author emiliomurillo
 */
public class EVA114PASOREF {

    /**
     * @param args the command line arguments
     */
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
