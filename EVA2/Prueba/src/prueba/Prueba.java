/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Arrays;

/**
 *
 * @author emiliomurillo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        String[] pacienteArray = new String[10];
        //String[] copia = new String[10];
        pacienteArray[0] = "José Sebastian López Ibarra + \n + 19 + \n + M + \n + China";
        pacienteArray[1] = "Emilio Murillo\n20\nM\nChina";
        String[] copia = pacienteArray.clone();
        String paciente = pacienteArray[0];
        String separador = "+ \n";
        pacienteArray = paciente.split(separador);
        if("José Sebastian López Ibarra".equals(pacienteArray[0])){
            System.out.println(copia[0]);
        }
    }
}
