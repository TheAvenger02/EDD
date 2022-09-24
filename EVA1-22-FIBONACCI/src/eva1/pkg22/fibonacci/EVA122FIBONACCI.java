package eva1.pkg22.fibonacci;
/**
 *
 * @author emiliomurillo
 */
public class EVA122FIBONACCI {

    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
             System.out.println(calcularFibo(i));
        }
        }
  
    public static int calcularFibo(int pos){
        //Llamada recurisiva
        //Detener la llamada recursiva
        if(pos <= 1)
            return 1;
        else
            return calcularFibo(pos-1) + calcularFibo(pos - 2);
    }
}
   