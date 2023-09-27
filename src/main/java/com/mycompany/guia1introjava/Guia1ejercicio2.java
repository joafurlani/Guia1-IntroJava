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
public class Guia1ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo
        //muestre por pantalla.
        String nombre;
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        
        System.out.println("El nombre igresado es: " + nombre);
    }
    
}
