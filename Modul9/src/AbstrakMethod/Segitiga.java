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
public class Segitiga extends methodAbstract {
    int alas = 8;
    int tinggi = 5;
    int sisi = 8;
    
    public int luas() {
        return (alas*tinggi)/2;
    }
    
    public int keliling() {
        return sisi+sisi+sisi;
    }
}
