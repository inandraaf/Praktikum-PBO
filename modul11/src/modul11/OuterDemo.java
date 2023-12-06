/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul11;

/**
 *
 * @author HP
 */
public class OuterDemo {
    int num;
    
    private class InnerDemo {
        private void print() {
            System.out.println("Ini merupakan method inner class");
        }
    }
    
    void displayInner() {
        InnerDemo inner = new InnerDemo();
        inner.print();
    }
}
