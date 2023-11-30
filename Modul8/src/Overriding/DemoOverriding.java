/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author HP
 */
public class DemoOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Parentclaz pc = new Parentclaz();
        Childclaz cc = new Childclaz();
        Hewan kc = new Kucing();
        Hewan elang = new Elang();
        pc.printOut();
        cc.printOut();
        kc.jalan();
        elang.jalan();
    }
    
}
