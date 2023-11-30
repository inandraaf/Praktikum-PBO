/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstrakclass;

/**
 *
 * @author HP
 */
public class ObjekAbstrakClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        AbstrakClass ac = new AbstrakClass(2, 3, 4);
        TurunanAbstrakClass tac = new TurunanAbstrakClass(2, 3, 2);
        tac.printX();
        System.out.println(tac.kali());
    }
    
}
