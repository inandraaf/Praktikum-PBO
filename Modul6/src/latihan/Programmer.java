/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author HP
 */
public class Programmer extends Pegawai{
    public static void main(String[] args) {
        double lemburPerjam = 50000;
        double gajiPerBulan;
        Pegawai pegawai = new Pegawai();
        gajiPerBulan = pegawai.gajiPokok + lemburPerjam;
        System.out.println(gajiPerBulan);
    }
}
