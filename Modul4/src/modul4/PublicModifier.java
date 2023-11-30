/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author HP
 */
public class PublicModifier {
public int a = 2;
public int b = 5;
public int c = 9 ;
public void kali() {
    int d = a*b*c;
    System.out.println("Hasil kali = " + d);
}

public void tambah() {
    int d = a+b+c;
    System.out.println("Hasil tambah = " + d);
}

public void kurang() {
    int d = a-b-c;
    System.out.println("Hasil kurang = " + d);
}

public void rata_rata() {
    int d = (a+b+c)/3;
    System.out.println("Hasil rata-rata = " + d);
}
}
