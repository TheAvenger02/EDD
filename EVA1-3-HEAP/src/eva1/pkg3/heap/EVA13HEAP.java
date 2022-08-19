package eva1.pkg3.heap;

/**
 *
 * @author emiliomurillo
 */
public class EVA13HEAP {
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        // obj y obj2 guardan referencias (direcciones de memoria en la VM), en otros lenguajes se les llama apuntadores (memoria física)
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(x);
        System.out.println(obj.valor);
        System.out.println(obj2);
    }  
}

class Prueba{
    public int valor = 100;
}