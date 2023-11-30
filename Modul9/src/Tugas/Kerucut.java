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
public class Kerucut extends abstrak{
    int r = 5;
    int tinggi = 5;
    
    public int volume() {
        return (int) (Math.PI * (r * r) * tinggi) / 3;
    }
    public int luasPermukaan() {
        return (int) (Math.PI * r * (r + Math.sqrt((tinggi * tinggi) + (r*r))));
    }
}
