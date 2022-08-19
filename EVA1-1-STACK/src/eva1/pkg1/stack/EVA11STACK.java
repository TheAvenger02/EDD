package eva1.pkg1.stack;
/**
 *
 * @author emiliomurillo
 */
public class EVA11STACK {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA MAIN");
        A();
        System.out.println("RETOMA EJECUCIÓN MAIN");
        System.out.println("TERMINA MAIN");
    }
    
    public static void A(){
        System.out.println("INICIA A");
        B();
        System.out.println("RETOMA EJECUCIÓN A");
        System.out.println("TERMINA A");
    }
    
    public static void B(){
     System.out.println("INICIA B");
     int i = 1;
     double d = 10.0;   
     System.out.println("TERMINA B");
    }
}