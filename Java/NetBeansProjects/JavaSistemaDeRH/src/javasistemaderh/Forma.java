/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasistemaderh;

/**
 *
 * @author ferfe
 */
public abstract class Forma implements Superficie{

    private double medida[]; //array para medidas
 //construtor parametrizado que aloca array de medidas
 public Forma(int numMedidas) {
    medida = new double[numMedidas];
 }
 //define uma medida da forma
 protected void setMedida(int i, double m) {
    if ((i > 0) || (i < medida.length) || (m < 0)) {
    medida[i] = m;
    }
 }
 public double getMedida(int i) {
    if ((i > 0) || (i < medida.length)) {
    return medida[i];
    } else {
    return -1;
    }
 }
    
}
