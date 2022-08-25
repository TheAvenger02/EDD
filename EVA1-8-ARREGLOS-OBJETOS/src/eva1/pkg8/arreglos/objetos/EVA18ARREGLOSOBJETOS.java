package eva1.pkg8.arreglos.objetos;
/**
 *
 * @author emiliomurillo
 */
public class EVA18ARREGLOSOBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Prueba[] arregloPrueba = new Prueba[20];
        for (int i = 0; i < arregloPrueba.length; i++) {
            arregloPrueba[i] = new Prueba();
        }
        for (Prueba prueba : arregloPrueba) {
             System.out.println(prueba.x);
        }
    }
}
class Prueba{
    int x = 100;
}    
