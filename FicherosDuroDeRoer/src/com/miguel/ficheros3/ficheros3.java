/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.ficheros3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ficheros3 {

    public static void main(String[] args) {

        String ruta = JOptionPane.showInputDialog(null, "Inserta la ruta del fichero", "Inserción", JOptionPane.INFORMATION_MESSAGE);

        try (FileReader fr = new FileReader(ruta); FileWriter fw = new FileWriter("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo.txt")) {

            int caracter;
            String resultado = "";

            while ((caracter = fr.read()) != -1) {

                if (caracter >= 97 && caracter <= 122) {
                    resultado += ((char) (caracter - 32));
                } else if (caracter != ' ') {
                    resultado += (char) (caracter);
                }

            }

            fw.write(resultado);
            
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

}
