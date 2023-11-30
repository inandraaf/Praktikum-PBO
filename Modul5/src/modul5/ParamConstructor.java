/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author HP
 */
public class ParamConstructor {
String nama, nim;
int semester;

public ParamConstructor(String nama, int semester, String nim) {
    this.nama = nama;
    this.nim = nim;
    this.semester = semester;
}

public void info(){
    System.out.println("Nama : " + nama + "\nNim : " + nim + "\nSemester : " + semester);
}
}
