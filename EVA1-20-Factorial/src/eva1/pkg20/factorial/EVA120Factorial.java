package eva1.pkg20.factorial;
import java.util.Scanner;
/**
 *
 * @author emiliomurillo
 */
public class EVA120Factorial {

    public static void main(String[] args) {
        // factorial(5) -> 5 * 4 * 3 * 2 * 1 = 120
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();
         
        System.out.println("\nEl factorial de " + num + " es: " + factorial(num));
    }
     
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }
}