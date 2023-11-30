/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upcasting;

/**
 *
 * @author HP
 */
public class SepedaAir extends Sepeda{
    void run() {
        System.out.println("Hanya bisa berjalan di atas" + " Air");
    }
    public static void main(String[] args) {
        Sepeda s = new SepedaAir() ;
        s.run();
    }
}
