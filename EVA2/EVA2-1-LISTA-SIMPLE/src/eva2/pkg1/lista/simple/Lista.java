package eva2.pkg1.lista.simple;

/**
 *
 * @author emiliomurillo
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;

    //Por default, la lista está vacía
    public Lista() {
        this.inicio = null; //No hay nodos en la lista.
        this.fin = null;
    }
    
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){ //Moverse mientras el siguiente sea distinto de null
            System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
        }
    }
    
    //Agregar un nodo al final de la lista
    public void agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        //Verificar si hay nodos en la lista
        if(inicio == null){ //No hay nodos en la lista.
            inicio = nuevoNodo; 
            fin = nuevoNodo;
        }else{ //Hay nodos en la lista.
            //Hay que moverse por la lista
            //Usando un nodo tewmporal hasta el último nodo de la lista.
            /*Nodo temp = inicio;
            while(temp.getSiguiente() != null){ //Moverse mientras el siguiente sea distinto de null
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo); //Conectamos al nuevo nodo 
            */
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
    }
    public int tamaLista(){
        int cont = 0;
        Nodo temp = inicio;
        while(temp != null){ //Moverse mientras el siguiente sea distinto de null
                temp = temp.getSiguiente();
                cont++;
        }
        return cont;
    }
    
    public void agregarEn(int valor, int pos){
        
    }
    
}