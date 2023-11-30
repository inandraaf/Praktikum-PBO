/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author HP
 */
public class Hewan {
String nama;
int kaki;
String makanan;
String tipe;

void beriNama(String namaHewan) {
    nama = namaHewan;
}

void kakinya(int jumlahkaki) {
    kaki = jumlahkaki;
}

void makanapa(String makanHewan) {
    makanan = makanHewan;
}

void tipenya(String tipeHewan) {
    tipe = tipeHewan;
}

void infoHewan() {
    System.out.println(
    "Nama Hewan : " + nama + "\n" +
    "Jumlah Kaki : " + kaki + "\n" +
    "Makan : " + makanan + "\n" +
    "Type Hewan : " + tipe + "\n");
    
}
}
