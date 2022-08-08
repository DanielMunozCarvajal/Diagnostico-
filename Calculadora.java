/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.suma;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite un numero");
        int num1 = sc.nextInt();
        
        System.out.println("Digite otro numero");
        int num2 = sc.nextInt();
        
        int total = num1 + num2;
        System.out.println("El resutado de la Suma es: " + total);
        
        int total2 = num1 - num2;
        System.out.println("El resutado de la Resta es: " + total2);
        
        int total3 = num1 * num2;
        System.out.println("El resutado de la Multiplicacion es: " + total3);
        
        int total4 = num1 / num2;
        System.out.println("El resutado de la Divicion es: " + total4);
 

    }
}
