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
public class Balok extends abstrak {
    int lebar = 7;
    int panjang = 12;
    int tinggi = 5;
    
    public int volume() {
        return panjang*lebar*tinggi;
    }
    
    public int luasPermukaan() {
        return 2*((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
    }
    
}
