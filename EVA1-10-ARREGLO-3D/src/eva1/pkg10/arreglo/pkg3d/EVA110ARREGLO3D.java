package eva1.pkg10.arreglo.pkg3d;

/**
 *
 * @author emiliomurillo
 */
public class EVA110ARREGLO3D {

    public static void main(String[] args) {
        int[][][] cuboDatos = new int[3][4][5];
        for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    cuboDatos[i][j][k] = 50;
                }  
            } 
        }
        System.out.println("");
        for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                System.out.print("[" + cuboDatos[i][j][k] + "]");
                }
                System.out.println("");
            }
        }
    }
}
