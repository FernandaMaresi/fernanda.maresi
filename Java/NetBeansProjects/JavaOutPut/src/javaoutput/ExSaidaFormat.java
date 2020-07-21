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
public class ExSaidaFormat 
{
    
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite um número: " + "outra string");
        double numero = sc.nextDouble();
        //printf formata a saída
        System.out.printf ("Saída com uma casa decimal: %.1f", numero);
    }
}
