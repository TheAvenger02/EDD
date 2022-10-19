package eva2.pkg3.lista.doble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emiliomurillo
 */
public class EVA23LISTADOBLE {

    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.agregar(10); //0
        listaDoble.agregar(20); //1
        listaDoble.agregar(30); //2
        listaDoble.agregar(40); //3
        listaDoble.agregar(50); //4
        listaDoble.agregar(60); //5
        listaDoble.imprimir();
        try {
            listaDoble.insertarEn(5, 0);
        } catch (Exception ex) {
            Logger.getLogger(EVA23LISTADOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaDoble.imprimir();
        
        try {
            listaDoble.borrarEn(5);
        } catch (Exception ex) {
            Logger.getLogger(EVA23LISTADOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listaDoble.imprimir();    
    }
}