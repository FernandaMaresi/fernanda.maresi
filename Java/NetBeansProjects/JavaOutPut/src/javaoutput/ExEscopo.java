/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoutput;

/**
 *
 * @author ferfe
 */
public class ExEscopo {
    
   // public static void main (String args[]){
        //Inicio do Bloco 0
        int i = 5;
        {
            //Inicio do Bloco 1
            int j = 0;
            j = 5 * i;
            System.out.println (i); //Dentro do escopo de i
            System.out.println (j); //Dentro do escopo de j
            {
                    //Inicio do Bloco 2
                    System.out.println (i); //Dentro do escopo de i
                    System.out.println (j); //Dentro do escopo de j
                }
            }
            //System.out.println (i); //Dentro do escopo de i
            //System.out.println (j); //ERRO! Fora do escopo de j
    //}
}
