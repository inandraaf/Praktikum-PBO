/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

/**
 *
 * @author HP
 */
public class Manager extends Karyawan{
    private float jamKerja = 7.5f;
        
    /**
     *
     * @return
     */
    public float getjamKerja() {
        return jamKerja;
    }
    
    public void setjamKerja(float jamKerja) {
        this.jamKerja = jamKerja;
    }
    
    public float getGajiManager(){
        return getGaji() * 2;
    }
    
}
