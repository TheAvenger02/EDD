package eva1.pkg11.ejemplo.arreglos;

import java.util.Scanner;

/**
 *
 * @author emiliomurillo
 */
public class EVA111EJEMPLOARREGLOS {

    public static void main(String[] args) {
            //Declaramos el arreglo
            int[][] arrayCali;
            //Pedir número de grupos
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de grupos: ");
            int grupos = sc.nextInt();
            arrayCali = new int[grupos][];            
            for (int i = 0; i < arrayCali.length; i++) {
                //Pedir número de alumnos por grupo
                System.out.println("Ingrese la cantidad de alumnos por grupo: ");
                int alumnos = sc.nextInt();
                arrayCali[i] = new int[alumnos];
        }
            //Capturar calificaciones
            for (int i = 0; i < arrayCali.length; i++) {
                 System.out.println("Inserte las calificaciones del grupo " + i + ":");
            for (int j = 0; j < arrayCali[i].length; j++) {
                int calificaciones = sc.nextInt();
                arrayCali[i][j] = calificaciones;
                }  
            } 
        System.out.println("");
        for (int i = 0; i < arrayCali.length; i++) { //1D
             System.out.println("Las calificaciones del grupo " + i + " son:");

            for (int j = 0; j < arrayCali[i].length; j++) { //2D

                System.out.print("[" + arrayCali[i][j] + "]");
                System.out.println("");
            }
            System.out.println("");
        }              
    }
    
}
