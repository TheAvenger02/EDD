package eva1.pkg5.pkgfor.each;

/**
 *
 * @author emiliomurillo
 */
public class EVA15FOREACH {
    public static void main(String[] args) {
        int[] arrayDatos = new int[50];
        for (int i = 0; i < arrayDatos.length; i++) {
            arrayDatos[i] = (int)(Math.random() * 100);
        }
        for (int arrayDato : arrayDatos) { //For Each -> Va del 1° al último, uno por uno.
            System.out.print("[" + arrayDato + "]");
        }
    }
    
}
