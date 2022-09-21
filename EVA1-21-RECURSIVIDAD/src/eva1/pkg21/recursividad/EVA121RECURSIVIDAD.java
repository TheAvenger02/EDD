package eva1.pkg21.recursividad;

/**
 *
 * @author emiliomurillo
 */
public class EVA121RECURSIVIDAD {
    public static void main(String[] args) {
        System.out.println("MAIN " + A());
        
    }
    
    public static String A(){
       return "A " + B(); 
    }
    public static String B(){
        return "B " + C();
    }
    public static String C(){
        return "C";
    }
    
}
