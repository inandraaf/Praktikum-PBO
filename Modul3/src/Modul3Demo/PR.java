/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3Demo;

/**
 *
 * @author HP
 */
public class PR {
int nilaiUTS;
int nilaiUAS;
int nilaiTugas;

    void beriUTS(int inputUTS) {
        nilaiUTS = inputUTS;
    }
    void beriUAS(int inputUAS) {
        nilaiUAS = inputUAS;
    }    
    
    void beriTugas(int inputTugas) {
        nilaiTugas = inputTugas;
    }

    double nilaiTotal() {
        double UTS = nilaiUTS;
        double UAS = nilaiUAS;
        double Tugas = nilaiTugas;
        double nilaiTotal = (UTS+UAS+Tugas)/3;
        return nilaiTotal;
    }   
}
