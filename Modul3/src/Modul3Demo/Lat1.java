/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3Demo;

/**
 *
 * @author HP
 */
public class Lat1 {
    
    public void hitungUsia() {
        int usia = 0;
        int tahunSekarang = 2019;
        int tahunLahir = 1993;
        
        usia = tahunSekarang - tahunLahir;
        
        System.out.println("Usia saya : " + usia);
    }
    public void beratBadan() {
        int beratBadan = 0;
        int usia = 26;
        int beratLahir = 4;
        beratBadan = beratLahir + (usia/2);
        
        System.out.println("Berat badan saya : " + beratBadan + "\n");
    }
}
