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
public class CustomerData {
    String nama,alamat,pekerjaan, tanggal_lahir;
    double gaji;
    
    public CustomerData() {
        System.out.println("Customer Data successfully created");
    }
    
    public CustomerData(String nama, String alamat, String pekerjaan, String tanggal_lahir, double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.tanggal_lahir = tanggal_lahir;
        this.gaji = gaji;
        infoData();
    }
    
    public void infoData() {
        System.out.println("===========================");
        System.out.println("Name            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Pekerjaan       : " + pekerjaan);
        System.out.println("Tanggal lahir   : " + tanggal_lahir);
        System.out.println("Gaji            : Rp. " + gaji);
    }
}
