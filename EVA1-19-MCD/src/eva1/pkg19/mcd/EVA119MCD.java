package eva1.pkg19.mcd;

/**
 *
 * @author emiliomurillo
 */
public class EVA119MCD {

    public static void main(String[] args) {
        // Dividendo/divisor -> residuo
        //Si residuo = 0 divisor es el MCD
        //Si no divisor/residuo
        System.out.println(mcd(180, 48));
    }
    
    public static int mcd(int dividendo, int divisor){
        int residuo = dividendo%divisor;
        if(residuo == 0){
            return divisor;
        }else{
            return mcd(divisor,residuo);
        }
    }
}
