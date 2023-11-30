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
public class Tugas {
    String sentence;
    int modul;
    
    // Default Constructor
    public Tugas() {
        System.out.println("Ini merupakan tugas OOP pada Modul 5");
    }
    

    
    //Parametered Constructor
    public Tugas(String sentence, int modul) {
        this.sentence = sentence;
        this.modul = modul;
    }
    
    public void info() {
    System.out.println("Ini merupakan tugas " + sentence + " pada Modul " + modul);
    }

}
