/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author HP
 */
public class Modul4Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PublicModifier pubmod = new PublicModifier();
        System.out.println(pubmod.a + "\n" +
                           pubmod.b + "\n" + 
                           pubmod.c);
        pubmod.kali();
        pubmod.tambah();
        pubmod.kurang();
        pubmod.rata_rata();
    }
}
