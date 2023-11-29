/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AplikasiLampu {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statusLampu = lampu.setSaklar(0);
        System.out.println("Status lampu = " + lampu.statusLampu + "\nketikkan");
        System.out.println("1 untuk menyalakan lampu\n0 untuk mematikan lampu\n2 untuk meredupkan lampu");
        
        int x = sc.nextInt();
        if(lampu.setSaklar(x)==0){
            lampu.matikanLampu();
        } else if(lampu.setSaklar(x)==1){
            lampu.hidupkanLampu();
        } else {
            lampu.redupkanLampu();
        }
    }
}
