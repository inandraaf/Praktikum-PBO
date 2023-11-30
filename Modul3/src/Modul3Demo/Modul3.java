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
public class Modul3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lat1 lat1 = new Lat1();
        lat1.hitungUsia();
        lat1.beratBadan();
        Lat2 lat2 = new Lat2();
        lat2.hitungUsia();
        lat2.beratBadan();
        
        
        Pegawai pegawai1 = new Pegawai();
        pegawai1.beriNama("Susanto");
        pegawai1.beriNip(120);
        pegawai1.beriGaji(1200000);
        pegawai1.infoPegawai();
        
        Pegawai pegawai2 = new Pegawai();
        pegawai2.beriNama("Susilo");
        pegawai2.beriNip(121);
        pegawai2.beriGaji(1500000);
        pegawai2.infoPegawai();
        
        Pegawai pegawai3 = new Pegawai();
        pegawai3.beriNama("Suratno");
        pegawai3.beriNip(122);
        pegawai3.beriGaji(1000000);
        pegawai3.infoPegawai();
        
        Pegawai pegawai4 = new Pegawai();
        pegawai4.beriNama("Susi");
        pegawai4.beriNip(123);
        pegawai4.beriGaji(1600000);
        pegawai4.infoPegawai();
        
       Pegawai pegawai5 = new Pegawai();
        pegawai5.beriNama("Susahimo");
        pegawai5.beriNip(124);
        pegawai5.beriGaji(1250000);
        pegawai5.infoPegawai();
        
        
        PR mhs = new PR();
        mhs.beriUTS(90);
        mhs.beriUAS(95);
        mhs.beriTugas(80);
        System.out.println("Nilai total : " + mhs.nilaiTotal());
    }
       
}
