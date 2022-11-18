package eva3.pkg1.ordenamiento;

/**
 *
 * @author emiliomurillo
 */
public class EVA31ORDENAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloDatos = new int[10];
        int[] arregloSel = new int[arregloDatos.length];
        int[] arregloIns = new int[arregloDatos.length];
        System.out.println("Arreglo original: ");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        System.out.println("Selection Sort");
        copiar(arregloDatos, arregloSel);
        imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Selection Sort = " + (fin - ini));
        System.out.println("Insertion Sort");
        copiar(arregloDatos, arregloIns);
        imprimir(arregloIns);
        ini = System.nanoTime();
        insertionSort(arregloIns);
        fin = System.nanoTime();
        imprimir(arregloIns);
        System.out.println("Insertion Sort = " + (fin - ini));
        
    }
    //LLENAR ARREGLO
    public static void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }
    //IMPRIMIR ARREGLO
    public static void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] < 10)
            System.out.print("[" + arreglo[i] + "]");
            else
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }
    //COPIAR ARREGLO
    public static void copiar(int[] arreglo, int[] copia){
        for (int i = 0; i < arreglo.length; i++) {
            copia[i] = arreglo[i];
        }
    }
    
    //SELECTION SORT O[n^2]
    //+ Comparaciones
    //- Intercambios (Swap)
    public static void selectionSort(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //Busco el elemento (posición) más pequeño
            for (int j = i+1; j < arreglo.length; j++) {
             //Buscar el más pequeño
             if(arreglo[min] > arreglo[j])
                 min = j;
            }
            //Swap - Intercambiar
            if(min != i){
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
            }
        }
    }
    //INSERTION SORT O[n^2]
    //+ Intercambios
    //- Comparaciones
    public static void insertionSort(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i]; //Es lo que vamos a ordenar
            int insP = i;
            //Buscamos en qué punto debe quedar temp
            //Esa posición queda almacenada en InsP
            for (int prev = i-1; prev >= 0; prev--) { //Comparamos
                if(arreglo[prev] > temp){
                    //Swap (intercambio parcial)
                    arreglo[insP] = arreglo[prev];
                    insP--;
                }else{
                    break;
                }
            }
            arreglo[insP] = temp;
        }
        
    }
    
}
