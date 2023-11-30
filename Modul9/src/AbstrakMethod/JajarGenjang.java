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
public class JajarGenjang extends methodAbstract {
    int alas = 10;
    int sisimiring = 6;
    int tinggi = 8;
    
    public int luas() {
        return alas*tinggi;
    }
    
    public int keliling() {
        return 2*(alas+sisimiring);
    }
}
