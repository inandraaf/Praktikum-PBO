/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author HP
 */
public class NestedDemo {
    public static void main(String[] args) {
        NestedClass.StaticNestedClass staticNested = new NestedClass.StaticNestedClass();
        staticNested.printInfo();
        
        NestedClass.InnerClass dalam = new NestedClass().new InnerClass();
        System.out.println(dalam.getJurusan());
    }
}
