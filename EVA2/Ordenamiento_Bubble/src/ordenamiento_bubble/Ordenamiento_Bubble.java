package ordenamiento_bubble;

/**
 *
 * @author Team Froyo
 */
public class Ordenamiento_Bubble {
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
        public static void main(String[] args) {  
            long ini10, ini50, ini100, ini500, ini1000, ini5000, ini10000, ini100000, ini1000000;
                //Bubble Sort
                System.out.println("Método Bubble Sort");
                
                // Arreglo con 10 enteros
                int[] array1 = new int[10];        
                fillArray(array1);

                System.out.println("\nArreglo con 10 elementos: ");
                printArray(array1);        
                bubbleSort(array1);
                System.out.println("Arreglo ordenado: ");
                printArray(array1);        
                ini10 = System.nanoTime();
                System.out.println("Tiempo de ejecución: " + ini10);

                // Arreglo con 50 enteros
                int[] array2 = new int[50];        
                fillArray(array2);

                System.out.println("\nArreglo con 50 elementos: ");
                printArray(array2);        
                bubbleSort(array2);
                System.out.println("Arreglo ordenado: ");
                printArray(array2);        
                ini50 = System.nanoTime();
                System.out.println("Tiempo de ejecución: " + ini50);

                // Arreglo con 100 enteros
                int[] array3 = new int[100];
                fillArray(array3);

                System.out.println("\nArreglo con 100 elementos: ");
                printArray(array3);        
                bubbleSort(array3);
                System.out.println("Arreglo ordenado: ");
                printArray(array3);        
                ini100 = System.nanoTime();
                System.out.println("Tiempo de ejecución: " + ini100);

                // Arreglo con 500 enteros
                int[] array4 = new int[500];
                fillArray(array4);

                System.out.println("\nArreglo con 500 elementos: ");
                printArray(array4);        
                bubbleSort(array4);
                System.out.println("Arreglo ordenado: ");
                printArray(array4);        
                ini500 = System.nanoTime();
                System.out.println("Tiempo de ejecución: " + ini500);

                // Arreglo con 1000 enteros
                int[] array5 = new int[1000];
                fillArray(array5);

                System.out.println("\nArreglo con 1000 elementos: ");
                printArray(array5);        
                bubbleSort(array5);
                System.out.println("Arreglo ordenado: ");
                printArray(array5);        
                ini1000 = System.nanoTime();
                System.out.println("Tiempo de ejecución: " + ini1000);

                // Arreglo con 5000 enteros
                int[] array6 = new int[5000];
                fillArray(array6);

                System.out.println("\nArreglo con 5000 elementos: ");
                printArray(array5);        
                bubbleSort(array6);
                System.out.println("Arreglo ordenado: ");
                printArray(array6);        
                ini5000 = System.nanoTime();
                System.out.println("Tiempo de ejecución: " + ini5000);

                // Arreglo con 10000 enteros
                int[] array7 = new int[10000];
                fillArray(array7);

                System.out.println("\nArreglo con 10000 elementos: ");
                printArray(array7);        
                bubbleSort(array7);
                System.out.println("Arreglo ordenado: ");
                printArray(array7);        
                ini10000 = System.nanoTime();
                System.out.println("Tiempo de ejecución: " + ini10000);

                // Arreglo con 100000 enteros
                int[] array8 = new int[100000];
                fillArray(array8);

                System.out.println("\nArreglo con 100000 elementos: ");
                printArray(array8);        
                bubbleSort(array8);
                System.out.println("Arreglo ordenado: ");
                printArray(array8);        
                ini100000 = System.nanoTime();
                System.out.println("Tiempo de ejecución: " + ini100000);

                // Arreglo con 1000000 enteros
                int[] array9 = new int[1000000];
                fillArray(array9);

                System.out.println("\nArreglo con 1000000 elementos: ");
                printArray(array9);        
                bubbleSort(array9);
                System.out.println("Arreglo ordenado: ");
                printArray(array9);        
                ini1000000 = System.nanoTime();
                System.out.println("Tiempo de ejecución: " + ini1000000);  
        }     

// Método que llena un arreglo con números enteros aleatorios.
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    // Método que imprime un arreglo.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                System.out.print("[0" + array[i] + "]");
            } else {
                System.out.print("[" + array[i] + "]");
            }
        }
        System.out.println();
    }

}
