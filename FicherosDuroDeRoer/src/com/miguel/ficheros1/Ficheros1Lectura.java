/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.ficheros1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class Ficheros1Lectura {
    
    public static void main(String[] args) {
        
        String contenido="";
        int c;
        
        
        try {
            FileReader fr = new FileReader("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo");
        
            
            c=fr.read();
        while(c!=-1){
            contenido+=(char)c;
            c=fr.read();
        
        
        }
        
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheros1Lectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ficheros1Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("El contenido del fichero es: "+contenido);
    }
    
}
