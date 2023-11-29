/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author HP
 */
public class Lampu implements ActivityLampu {
    public int statusLampu;
    
    
    @Override
    public void matikanLampu() {
        if(statusLampu==0) {
            System.out.println("Lampu sudah dalam kondisi mati");
        }else if(statusLampu==1) {
            statusLampu=-1;
            System.out.println("Lampu sudah dimatikan");
        }
    }
    
    @Override
    public void hidupkanLampu(){
        if(statusLampu==1){
            System.out.println("Lampu sudah dinyalakan\n***");
        } else {
            statusLampu=+1;
            System.out.println("Lampu sudah dalam kondisi menyala");
        }
    }
    
    @Override
    public void redupkanLampu() {
        if(statusLampu==2) {
            System.out.println("Lampu telah meredup\n===");
        } else {
            statusLampu=+2;
            System.out.println("Lampu meredup karena hampir rusak");
        }
    }
    
    public int setSaklar(int saklar){
        return statusLampu = saklar;
    }
}
