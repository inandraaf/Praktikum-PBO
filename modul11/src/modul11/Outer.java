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
public class Outer {
    static class NestedDemo {
        public void myNetMethod() {
            System.out.println("Ini adalah method " + "static nesred class");
        }
    }
    
    public static void main(String[] args) {
        Outer.NestedDemo nested = new Outer.NestedDemo();
        nested.myNetMethod();
    }
}
