/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.ficheros6;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class ficheros6_1 {

    public static void main(String[] args) {

        try (DataInputStream dis = new DataInputStream((new FileInputStream("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\cadidatos.txt")))) {
            System.out.println("Nombre\t\tDNI\t\tEdad\t\tSalario");

            String nombre, DNI;
            int edad;
            double expectativaSalario;

            while (true) {

                nombre = dis.readUTF();
                System.out.print(nombre + "\t\t");
                DNI = dis.readUTF();
                System.out.print(DNI + "\t\t");
                edad = dis.readInt();
                System.out.print(edad + "\t\t");
                expectativaSalario = dis.readDouble();
                System.out.print(expectativaSalario + "\t\t");

            }

        } catch (EOFException ex) {
            System.out.println("Fin");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("");

        System.out.println("");

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Dame la expectativa salarial");
        double expectativaSalarioUsuario = sc.nextDouble();

        try (DataInputStream dis = new DataInputStream((new FileInputStream("C:\\Users\\Miguel\\Desktop\\Programación\\CreacionFicheros\\cadidatos.txt")))) {
            System.out.println("Nombre\t\tDNI\t\tEdad\t\tSalario");

            String nombre, DNI;
            int edad;
            double expectativaSalario;

            while (true) {

                nombre = dis.readUTF();
                DNI = dis.readUTF();
                edad = dis.readInt();
                expectativaSalario = dis.readDouble();
                
                if (expectativaSalarioUsuario<expectativaSalario) {

                System.out.print(nombre + "\t\t");
                System.out.print(DNI + "\t\t");
                System.out.print(edad + "\t\t");
                System.out.print(expectativaSalario + "\t\t");
                System.out.println("");
                }

            }

        } catch (EOFException ex) {
            System.out.println("Fin");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
