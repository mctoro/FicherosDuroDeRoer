/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.ficheros4;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Miguel
 */
public class ficheros4Escritura {
    
    public static void main(String[] args) {
        
        String texto1="Hola que tal estas.";
        String texto2="Espero que todo vaya bien";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo2.txt"))){
          
            bw.write(texto1);
            bw.newLine();
            bw.write(texto2);
            
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
