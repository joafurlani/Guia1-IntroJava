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
public class Guia1ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que lea un número entero por teclado y muestre
        //por pantalla el doble, el triple y la raíz cuadrada de ese número. Math.sqrt().
   
        double num,raiz;
        
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Ingrese un num");
        num=leer.nextDouble();
        raiz=(Math.sqrt(num));
        
        System.out.println("El doble del num ingresado es: " + num * 2);
        System.out.println("El triple es: " + num * 3);
        System.out.println("La raiz es : " + raiz );
        
    
    }
    
}
