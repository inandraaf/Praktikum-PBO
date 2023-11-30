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
public class PersegiPanjang extends methodAbstract {
    int panjang = 6;
    int lebar = 2;
    
    public int luas(){
        return panjang*lebar;
    }
    
    public int keliling(){
        return 2*(panjang+lebar);
    }
}
