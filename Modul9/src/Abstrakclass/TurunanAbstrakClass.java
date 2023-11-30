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
public class TurunanAbstrakClass extends AbstrakClass {
    int x;
    
    public TurunanAbstrakClass(int a, int b, int c) {
        super(a,b,c);
        x = a+b+c;
    }
    
    public void printX() {
        System.out.println(x);
    }
}
