/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HP
 */
public class PrismaSegitiga extends abstrak {
    int alas = 5;
    int tinggi = 5;
    int sisimiring = 5;
    
    public int volume() {
        return (int) ((alas*alas)/2) * tinggi;
    }
    
    public int luasPermukaan() {
        return (int) ((int) ((int) (alas*alas) + (alas * Math.sqrt(sisimiring*sisimiring) + 
                (tinggi * tinggi))) + (sisimiring * Math.sqrt(alas*alas) + (tinggi*tinggi)));
    }
}
