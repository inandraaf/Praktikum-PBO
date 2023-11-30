package modul6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Modul6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        System.out.println("--------------Mobil--------------");
        System.out.println("Bahan Bakar     : " + mobil.bahanBakar + "\n" + 
                           "Tahun Pembuatan : " + mobil.tahunPembuatan + "\n" +
                           "Buatan dari     : " + mobil.asal + "\n" +
                           "Kapasitas       : " + mobil.kapasitas + "\n" +
                           "Maks Muatan     : " + mobil.muatan + " kg" + "\n");
    
        Pesawat pesawat = new Pesawat();
        System.out.println("-------------Pesawat-------------");
        System.out.println("Bahan Bakar     : " + pesawat.bahanBakar + "\n" + 
                           "Tahun Pembuatan : " + pesawat.tahunPembuatan + "\n" +
                           "Turbo Jet       : " + pesawat.turboJet + "\n" +
                           "Maks Muatan     : " + pesawat.muatan + " kg" + "\n" +
                           "Kapasitas       : " + pesawat.kapasitas);
    }
    
}
