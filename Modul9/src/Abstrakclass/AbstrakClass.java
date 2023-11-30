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
abstract class AbstrakClass {
    int a;
    int b;
    int c;
    public AbstrakClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int kali() {
        return a*b*c;
    }
}
