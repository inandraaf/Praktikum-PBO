/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author HP
 */
public class ConstructorAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tugas tugas1 = new Tugas();
        Tugas tugas2 = new Tugas("OOP", 5);
        tugas2.info();
    }
    
}
