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
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    public String beriNama(String namaSaya) {
        return this.nama = namaSaya;
    }
    
    public int beriNip(int nipSaya) {
    return this.nip = nipSaya;
    }
    
    public double beriGaji(double gajiSaya) {
    return this.gaji = gajiSaya;
    }
    
    void infoPegawai() {
        System.out.println("Nama : " + nama + "\n" +
                "NIP : " + nip + "\n" +
                "Gaji : " + gaji + "\n");
    }
}
