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
public class TugasDemo {
    public static void main(String[] args) {
        Balok bl = new Balok();
        System.out.println("========Balok========");
        System.out.println("Volume         = " + bl.getVolume());
        System.out.println("Luas Permukaan = " + bl.getLuasPermukaan());
    
        Kubus kb = new Kubus();
        System.out.println("========Kubus========");
        System.out.println("Volume         = " + kb.getVolume());
        System.out.println("Luas Permukaan = " + kb.getLuasPermukaan());
        
        Bola bola = new Bola();
        System.out.println("========Bola========");
        System.out.println("Volume         = " + bola.getVolume());
        System.out.println("Luas Permukaan = " + bola.getLuasPermukaan());
        
        Kerucut kr = new Kerucut();
        System.out.println("========Kerucut========");
        System.out.println("Volume         = " + kr.getVolume());
        System.out.println("Luas Permukaan = " + kr.getLuasPermukaan());
        
        PrismaSegitiga prs = new PrismaSegitiga();
        System.out.println("========Prisma Segitiga========");
        System.out.println("Volume         = " + prs.getVolume());
        System.out.println("Luas Permukaan = " + prs.getLuasPermukaan());
    }
}
