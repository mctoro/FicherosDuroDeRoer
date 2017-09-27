/*
Pide un numero por teclado y lee el fichero suando Scanner, pero muestra
solo los que sean mayores que el numero introducido
Lo mismo que el anterior pero guarda el resutaldo en otro fichero
 */
package com.miguel.ficheros5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class ficheros5_3 {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo3.txt");
        File f_salida = new File("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo3.txt");
                
        try (Scanner sc = new Scanner(f);
            Scanner sc_usuario = new Scanner(System.in);){
            
            PrintWriter pw = new PrintWriter(f_salida);

            int fichero;
            int fichero_usuario;

            System.out.println("Introduce un numero");
            fichero_usuario = sc_usuario.nextInt();

            while (sc.hasNext()) {
                fichero = sc.nextInt();
                if (fichero > fichero_usuario) {
                    pw.println(fichero);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ficheros5_1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
