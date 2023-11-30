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
public class Bola extends abstrak {
    int r = 7;
    
    public int volume() {
        return (int) ((4 * Math.PI * (r * r * r))/3);
    }
    
    public int luasPermukaan() {
        return (int) (4 * Math.PI * (r * r));
    }
}
