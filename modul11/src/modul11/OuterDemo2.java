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
public class OuterDemo2 {
    private int num = 175;
    public class Inner_Demo {
        public int getNum() {
            System.out.println("Ini adalah nilai dari variable private outerDemo");
            return num;
        }
    }
}
