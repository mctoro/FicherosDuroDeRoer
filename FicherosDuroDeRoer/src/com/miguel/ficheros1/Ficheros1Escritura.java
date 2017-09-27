/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.ficheros1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class Ficheros1Escritura {

    public static void main(String... args) {

        try {
/*también podemos poner (try (FileWriter fw = new FileWriter
("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo")) 
y con esto se cerraría automaticamente (fw.close)
*/
/*si en la raiz del fichero, añadimos un boolean (es decir "C: blabla, TRUE)
no elimina, sino que añade al fichero"
*/
            FileWriter fw = new FileWriter("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo");

            
            fw.write("Hola mundo! Como estás hoy? Pongo unos numeros, 1346");

            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(Ficheros1Escritura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
