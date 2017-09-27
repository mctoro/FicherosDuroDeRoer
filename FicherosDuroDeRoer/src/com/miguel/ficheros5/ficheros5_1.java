/*
teniendo un fichero donde en cada linea hay un numero, leer el fichero 
usando Scanner, muestra el contenido en pantalla
 */
package com.miguel.ficheros5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class ficheros5_1 {
    
    public static void main(String[] args) {
        
        File f = new File("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo3.txt");
        
        try {
            Scanner sc = new Scanner(f);
            
            Scanner sc_usuario = new Scanner(System.in);
            
           
            int fichero;
            int fichero_usuario;
            
            System.out.println("Introduce un numero");
            fichero_usuario = sc_usuario.nextInt();
            
            while (sc.hasNext()) {                
            fichero = sc.nextInt();
            if(fichero> fichero_usuario) {
                System.out.println(fichero);
            }
            
                
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ficheros5_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
