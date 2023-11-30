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
public class bangunDatar {
    double luas ;
    double keliling;
    
    void hitungLuas(double lebar, double panjang) {
        this.luas = lebar * panjang ;
    }
    double hitungKeliling(double lebar, double panjang) {
        this.keliling = 2 * (lebar + panjang);
        return keliling;
    }
}
