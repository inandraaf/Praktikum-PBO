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
public class Anjing extends pet{
    public String perilaku() {
        return "Menyukai Daging dan Tulang";
    }
    
    public String bark(){
        return "Guk..Guk..Guk..";
    }
    
    public void showInfo() {
        System.out.println(panggilNama());
        System.out.println(perilaku());
        System.out.println(bark());
    }
}
