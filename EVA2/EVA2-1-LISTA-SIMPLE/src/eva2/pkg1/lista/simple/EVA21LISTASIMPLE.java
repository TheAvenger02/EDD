package eva2.pkg1.lista.simple;

/**
 *
 * @author emiliomurillo
 */
public class EVA21LISTASIMPLE {

    public static void main(String[] args) {
        Lista miLista = new Lista();
        //miLista.agregar(10);
        //miLista.agregar(20);
        //miLista.agregar(30);
        //miLista.agregar(40);   
        //int[] arreglo = new int[1000000];
        for(int i = 0; i < 1000000;i++){ //O(N2) -> O(1)
            //arreglo[i] = 1000;
            miLista.agregar(1000);
        }
        System.out.println("Conteo de nodos: " + miLista.tamaLista());
        //miLista.imprimir();
    }
}