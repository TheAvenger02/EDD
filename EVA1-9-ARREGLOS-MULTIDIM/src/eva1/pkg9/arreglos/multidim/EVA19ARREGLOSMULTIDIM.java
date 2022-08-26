package eva1.pkg9.arreglos.multidim;

/**
 *
 * @author emiliomurillo
 */
public class EVA19ARREGLOSMULTIDIM {

    public static void main(String[] args) {
        int[][] matrizDatos = new int[3][5];
        System.out.println("FILAS: " + matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++) { //1D (3 filas)
            System.out.println("COLUMNAS: " + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++) { //2D (5 columnas)
                matrizDatos[i][j] = 100;
            }
        }
        System.out.println("");
        for (int i = 0; i < matrizDatos.length; i++) { //1D (3 filas)
            for (int j = 0; j < matrizDatos[i].length; j++) { //2D (5 columnas)
                System.out.print("[" + matrizDatos[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
