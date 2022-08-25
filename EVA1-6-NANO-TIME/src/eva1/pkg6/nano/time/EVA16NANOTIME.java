package eva1.pkg6.nano.time;

/**
 *
 * @author emiliomurillo
 */
public class EVA16NANOTIME {

    public static void main(String[] args) {
        long ini = System.nanoTime(); //8 Bytes
        System.out.println(System.nanoTime()); 
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
}
