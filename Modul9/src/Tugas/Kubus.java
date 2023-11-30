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
public class Kubus extends abstrak {
    int sisi = 5;
    
    public int volume() {
        return sisi*sisi*sisi;
    }
    
    public int luasPermukaan() {
        return 6 * sisi;
    }
}
