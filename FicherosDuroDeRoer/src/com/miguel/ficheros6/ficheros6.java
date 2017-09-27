/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.ficheros6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ficheros6 {

    public static void main(String[] args) {

        String DNI;
        String nombre;
        int edad;
        double expectativaSalario;
        

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

        do {

            System.out.println("Introduzca su nombre");
            nombre = sc.next();

            System.out.println("Introduzca su DNI");
            DNI = sc.next();

            System.out.println("Introduzca su edad");
            edad = sc.nextInt();

            System.out.println("Introduzca sus expectativas");
            expectativaSalario = sc.nextDouble();

            boolean salir = false;

            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\cadidatos.txt", true))) {

                dos.writeUTF(nombre);

                dos.writeUTF(DNI);

                dos.writeInt(edad);

                dos.writeDouble(expectativaSalario);

                System.out.println("candidato añadido");
            
                System.out.println("Quieres añadir más candidatos?");
                
                char respuesta = sc.next().toUpperCase().charAt(0);
                
                if(respuesta =='N'){
                    salir=true;
                }
            } catch (IOException e) {
            }

            
            
        } while (!true);

    }

}
