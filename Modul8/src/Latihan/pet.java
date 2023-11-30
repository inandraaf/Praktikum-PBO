/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author HP
 */
public class pet {
    private String nama;
    
    public void beriNama(String nama) {
        this.nama = nama;
    }
    
    public String panggilNama() {
        return this.nama;
    }
    
    public String perilaku() {
        return "Hewan Penurut";
    }

}
