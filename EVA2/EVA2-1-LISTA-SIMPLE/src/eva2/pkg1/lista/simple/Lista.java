package eva2.pkg1.lista.simple;

/**
 *
 * @author emiliomurillo
 */
public class Lista {
    private Nodo inicio;

    //Por default, la lista está vacía
    public Lista() {
        this.inicio = null; //No hay nodos en la lista.
    }
    
    public void imprimir(){
        Nodo temp = inicio;
        while(temp.getSiguiente() != null){ //Moverse mientras el siguiente sea distinto de null
            System.out.println(temp.getValor() + " - ");
                temp = temp.getSiguiente();
        }
    }
    
    //Agregar un nodo al final de la lista
    public void agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        //Verificar si hay nodos en la lista
        if(inicio == null){ //No hay nodos en la lista.
            inicio = nuevoNodo; 
        }else{ //Hay nodos en la lista.
            //Hay que moverse por la lista
            //Usando un nodo tewmporal hasta el último nodo de la lista.
            Nodo temp = inicio;
            while(temp.getSiguiente() != null){ //Moverse mientras el siguiente sea distinto de null
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo); //Conectamos al nuevo nodo
        }
    }
    
    
}
