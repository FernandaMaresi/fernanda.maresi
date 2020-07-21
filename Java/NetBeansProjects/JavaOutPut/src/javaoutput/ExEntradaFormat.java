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
public class ExEntradaFormat {
    
    //public static void main (String args[])
    {
        System.out.println ("Olá!"); //Mensagem inicial
        //Exibe mensagem e prepara entrada de dados
        System.out.println ("Digite um inteiro: ");
        Scanner s = new Scanner (System.in);
        int valor = s.nextInt(); //declara e atribui valor à variável
        
        //exibição do valor lido
        System.out.println ("Valor digitado = " + valor);
    }

    
}
