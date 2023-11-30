/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

/**
 *
 * @author HP
 */
public class KaryawanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karyawan kl = new Karyawan();
        kl.setNama("Inandra");
        kl.setGaji(3500000);
        kl.setUsia(20);
        
        System.out.println("Nama Karyawan : "+kl.getNama());
        System.out.println("Gaji Karyawan : "+kl.getGaji());
        System.out.println("Usia Karyawan : "+kl.getUsia() + "\n");
        
        //-------------------------------------------------------------//

        // Objek Manager pertama
        Manager mg1 = new Manager();
        mg1.setNama("John");
        mg1.setUsia(30);
        mg1.setGaji(3200000);
        mg1.setjamKerja(8.5f);
        
        System.out.println("Nama          : " + mg1.getNama());
        System.out.println("Usia          : " + mg1.getUsia());
        System.out.println("Gaji karyawan : " + mg1.getGaji());
        System.out.println("Jam Kerja     : " + mg1.getjamKerja());
        System.out.println("Gaji Manager  : " + mg1.getGajiManager() + "\n");
        
        // Objek Manager kedua
        Manager mg2 = new Manager();
        mg2.setNama("Alice");
        mg2.setUsia(35);
        mg2.setGaji(3500000);
        mg2.setjamKerja(8.5f);

        System.out.println("Nama          : " + mg2.getNama());
        System.out.println("Usia          : " + mg2.getUsia());
        System.out.println("Gaji karyawan : " + mg2.getGaji());
        System.out.println("Jam Kerja     : " + mg2.getjamKerja());
        System.out.println("Gaji Manager  : " + mg2.getGajiManager() + "\n");

        // Objek Manager ketiga
        Manager mg3 = new Manager();
        mg3.setNama("Bob");
        mg3.setUsia(40);
        mg3.setGaji(3800000);
        mg3.setjamKerja(8.5f);

        System.out.println("Nama          : " + mg3.getNama());
        System.out.println("Usia          : " + mg3.getUsia());
        System.out.println("Gaji karyawan : " + mg3.getGaji());
        System.out.println("Jam Kerja     : " + mg3.getjamKerja());
        System.out.println("Gaji Manager  : " + mg3.getGajiManager() + "\n");

        // Objek Manager keempat
        Manager mg4 = new Manager();
        mg4.setNama("Eve");
        mg4.setUsia(32);
        mg4.setGaji(3400000);
        mg4.setjamKerja(8.5f);

        System.out.println("Nama          : " + mg4.getNama());
        System.out.println("Usia          : " + mg4.getUsia());
        System.out.println("Gaji karyawan : " + mg4.getGaji());
        System.out.println("Jam Kerja     : " + mg4.getjamKerja());
        System.out.println("Gaji Manager  : " + mg4.getGajiManager() + "\n");

        // Objek Manager kelima
        Manager mg5 = new Manager();
        mg5.setNama("Grace");
        mg5.setUsia(38);
        mg5.setGaji(3700000);
        mg5.setjamKerja(8.5f);

        System.out.println("Nama          : " + mg5.getNama());
        System.out.println("Usia          : " + mg5.getUsia());
        System.out.println("Gaji karyawan : " + mg5.getGaji());
        System.out.println("Jam Kerja     : " + mg5.getjamKerja());
        System.out.println("Gaji Manager  : " + mg5.getGajiManager() + "\n");
    
    }
    
}
