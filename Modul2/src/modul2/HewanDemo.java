/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author HP
 */
public class HewanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();
        hewan1.beriNama("Harimau");
        hewan1.kakinya(4);
        hewan1.makanapa("Daging");
        hewan1.tipenya("Karnivora");
        hewan1.infoHewan();
        hewan2.beriNama("Kerbau");
        hewan2.kakinya(4);
        hewan2.makanapa("Rumput");
        hewan2.tipenya("Herbivora");
        hewan2.infoHewan();
    }
    
}
