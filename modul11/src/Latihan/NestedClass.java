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
public class NestedClass {
    String nama = "Inandra Asha Fardhana";
    String nim = "L200220045";
    
    public void printNama() {
        System.out.println(nama + " : " + nim );
    }
    
    static class StaticNestedClass {
        static String jurusan = "Informatika";
        
        NestedClass outer = new NestedClass();
        public void printInfo() {
            outer.printNama();
        }
    }
    
    class InnerClass {
        public String getJurusan() {
            return StaticNestedClass.jurusan;
        }
    }
}
