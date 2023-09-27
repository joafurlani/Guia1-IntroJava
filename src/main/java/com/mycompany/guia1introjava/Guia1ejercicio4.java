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
public class Guia1ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dada una cantidad de grados centígrados se debe mostrar su
        //equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
        //+ (9 * C / 5).
    
    double grados, f;
    
    Scanner leer = new Scanner (System.in);
    
        System.out.println("Ingrese los grados a convertir");
        grados=leer.nextInt();
        
        f= 32 + (9 * grados /5);
        
        System.out.println("La conversion en grados Fahrenheit es: " + f);
        
        
    
    }
    
}
