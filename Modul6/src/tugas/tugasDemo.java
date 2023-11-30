/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author HP
 */
public class tugasDemo {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();        
        PersegiPanjang panjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();
        SegiTigaSamaKaki segisamakaki = new SegiTigaSamaKaki();
        SegiTigaSamaSisi segisamasisi = new SegiTigaSamaSisi();
        
        //Persegi
        persegi.sisi = 5;
        persegi.hitungLuas(persegi.sisi,persegi.sisi);
        persegi.hitungKeliling(persegi.sisi, persegi.sisi);
        
        //Persegi Panjang
        panjang.panjang = 10;
        panjang.lebar = 5;
        panjang.hitungLuas(panjang.panjang,panjang.lebar);
        panjang.hitungKeliling(panjang.panjang,panjang.lebar); 
        
        //Segitiga
        segitiga.alas = 12; 
  
        //Segitiga Sama Kaki
        segisamakaki.sisiMiring = 10;
        segisamakaki.alas = 12;
        segisamakaki.hitungLuas(segisamakaki.alas,Math.sqrt(Math.pow(segisamakaki.sisiMiring, 2) - Math.pow(segisamakaki.alas/2, 2)));
        segisamakaki.hitungKeliling(segisamakaki.alas/2,segisamakaki.sisiMiring);
        
        //Segitiga Sama Sisi
        segisamasisi.sisi = 10;
        segisamasisi.alas = 12;
        segisamasisi.hitungLuas(segisamasisi.alas,Math.sqrt(Math.pow(segisamakaki.sisiMiring, 2) - Math.pow(segisamakaki.alas/2, 2)) );
        segisamasisi.hitungKeliling(segisamasisi.alas/2,segisamasisi.sisi);
        
        
        System.out.println("--------Persegi--------");
        System.out.println("Sisi     : " + persegi.sisi + "\n" +
                           "Luas     : " + persegi.luas + " cm2" + "\n" +
                           "Keliling : " + persegi.keliling + " cm" + "\n");
        System.out.println("----Persegi Panjang----");
        System.out.println("Panjang  : " + panjang.panjang + "\n" +
                           "Lebar    : " + panjang.lebar + "\n" +
                           "Luas     : " + panjang.luas + " cm2" + "\n" +
                           "Keliling : " + panjang.keliling + " cm" +"\n");
        System.out.println("----Segitiga Sama Kaki----");
        System.out.println("Alas        : " + segisamakaki.alas + "\n" +
                           "Sisi Miring : " + segisamakaki.sisiMiring + "\n" +
                           "Luas        : " + segisamakaki.luas/2 + " cm2" + "\n" +
                           "Keliling    : " + segisamakaki.keliling + " cm" + "\n");
        System.out.println("----Segitiga Sama Sisi----");
        System.out.println("Alas        : " + segisamasisi.alas + "\n" +
                           "Sisi        : " + segisamasisi.sisi + "\n" +
                           "Luas        : " + segisamasisi.luas/2 + " cm2" + "\n" +
                           "Keliling    : " + segisamasisi.keliling + " cm" + "\n");
    }
}
