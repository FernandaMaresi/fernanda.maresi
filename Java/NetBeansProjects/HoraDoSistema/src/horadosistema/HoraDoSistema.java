/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ferfe
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hora/data
        Date relogio = new Date();
        System.out.println("A hora do sistema é ");
        System.out.println(relogio.toString());
       
        //idioma
        Locale loc = Locale.getDefault();
        System.out.println("Seu sistema está em "+loc.getDisplayLanguage());
    
        //resolucao da tela
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Sua tela tem resolução " + d.width +" X "+d.height);
        
    }
    
}
