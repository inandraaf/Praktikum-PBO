/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author HP
 */
public class ABCdemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.MessageA();
        b.MessageA();
        b.MessageB();
        c.MessageC();
        c.MessageB();
        c.MessageA();
    }
}
