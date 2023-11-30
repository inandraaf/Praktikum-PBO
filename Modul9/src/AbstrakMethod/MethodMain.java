/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstrakMethod;

/**
 *
 * @author HP
 */
public class MethodMain {
    public static void main(String[] args) {
        Persegi psg = new Persegi();
        System.out.println("Bangun Persegi");
        System.out.println("Keliling = " + psg.getKel());
        System.out.println("Luas     = " + psg.getLuas() + "\n");

        PersegiPanjang pgp = new PersegiPanjang();
        System.out.println("Bangun Persegi Panjang");
        System.out.println("Keliling = " + pgp.getKel());
        System.out.println("Luas     = " + pgp.getLuas() + "\n");

        JajarGenjang jjg = new JajarGenjang();
        System.out.println("Bangun Jajargenjang");
        System.out.println("Keliling = " + jjg.getKel());
        System.out.println("Luas     = " + jjg.getLuas() + "\n");

        Lingkaran lgn = new Lingkaran();
        System.out.println("Bangun Lingkaran");
        System.out.println("Keliling = " + lgn.getKel());
        System.out.println("Luas     = " + lgn.getLuas() + "\n");

        Segitiga sgt = new Segitiga();
        System.out.println("Bangun Segitiga");
        System.out.println("Keliling = " + sgt.getKel());
        System.out.println("Luas     = " + sgt.getLuas());        
    }
}
