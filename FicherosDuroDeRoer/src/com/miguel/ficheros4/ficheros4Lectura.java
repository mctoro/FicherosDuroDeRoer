/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.ficheros4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Miguel
 */
public class ficheros4Lectura {
    
    public static void main(String[] args) {
        
        
        try (BufferedReader br= new BufferedReader(new FileReader("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\HolaMundo2.txt"))){
            
            String linea;
            
            while ((linea = br.readLine()) !=null) {                
                
                System.out.println(linea);
                
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    
}
