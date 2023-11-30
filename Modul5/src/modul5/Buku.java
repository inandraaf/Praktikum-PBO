/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author HP
 */
public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    double hargaJual;

   
    public Buku(String namaPengarang, String judulBuku) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
    }
    
    public Buku(String namaPengarang, String judulBuku, double hargaJual) {
        this(namaPengarang, judulBuku);
        this.hargaJual = hargaJual;
    }
    
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual) {
        this(namaPengarang, judulBuku, hargaJual);
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
    }

    public void info() {
        System.out.println("Judul buku      : " + judulBuku + "\n" +
                           "Nama Pengarang  : " + namaPengarang + "\n" +
                           "Tahun Terbit    : " + tahunTerbit + "\n" +
                           "Cetakan Ke      : " + cetakanKe + "\n" + 
                           "Harga Jual      : " + hargaJual + "\n");
    }
}
