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
public class BemVindo {
    
    public static void main(String args[]){
        
        System.out.print("Digite seu nome:");
        Scanner scn = new Scanner(System.in);
        String nome = scn.nextLine();
        System.out.println("Bem vindo, "+ nome);
    }
    
}
