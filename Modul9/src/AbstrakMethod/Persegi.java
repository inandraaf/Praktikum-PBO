/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstrakMethod;

/**
 *
 * @author HP
 */
public class Persegi extends methodAbstract {
    int sisi = 5;
    
    public int luas(){
        return sisi*sisi;
    }
    
    public int keliling(){
        return 4*sisi;
    }
}
