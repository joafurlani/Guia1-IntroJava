/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia1introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas
           //y después toda en minúsculas.
           String frase;
           Scanner leer = new Scanner (System.in);
           System.out.println("Ingresa una frase");
           frase = leer.next();
           
           System.out.println("La frase ingresada es: " + frase.toUpperCase());
           System.out.println("  " + frase.toLowerCase());
           
   }
    
}
