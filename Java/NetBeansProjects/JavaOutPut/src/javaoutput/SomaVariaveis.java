/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoutput;

import java.util.Scanner;

/**
 *
 * @author ferfe
 */
public class SomaVariaveis {
    
    public static void main (String[] args){
    
        System.out.println("------------------");
        System.out.println("      SOMA        ");
        System.out.println("------------------\r");
        
        System.out.print("Digite o primeiro número: ");
        Scanner input = new Scanner(System.in);
        
        int numero1 = input.nextInt();
        System.out.print("Digite o primeiro número: ");
        int numero2 = input.nextInt();
        
        System.out.println("A soma é "+ (numero1+numero2));
    
    }
    
    
}
