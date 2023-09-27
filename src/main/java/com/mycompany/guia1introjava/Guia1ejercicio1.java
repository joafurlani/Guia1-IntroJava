/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia1introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia1ejercicio1 {

    public static void main(String[] args) {
       // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
       //El programa deberá después mostrar el resultado de la suma
       
       int num1;
       int num2;
       int suma;
       
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer num");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo num");
        num2 = leer.nextInt();

        suma = num1 + num2;
        
        System.out.println("La suma de los numeros es: " + suma);
       
    }
}
