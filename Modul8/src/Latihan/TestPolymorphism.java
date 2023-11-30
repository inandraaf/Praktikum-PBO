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
public class TestPolymorphism {
    public static void main(String[] args) {
        Kucing kc = new Kucing();
        Anjing aj = new Anjing();
        
        kc.beriNama("TOM");
        aj.beriNama("BULL");
        
        kc.showInfo();
        aj.showInfo();
    }
}
