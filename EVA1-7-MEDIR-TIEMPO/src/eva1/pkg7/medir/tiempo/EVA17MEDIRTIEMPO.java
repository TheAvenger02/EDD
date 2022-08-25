package eva1.pkg7.medir.tiempo;
/**
 *
 * @author emiliomurillo
 */
public class EVA17MEDIRTIEMPO {

    public static void main(String[] args) {
       int[] datos = new int[100000000];
       long ini = System.nanoTime();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = 100;
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
}