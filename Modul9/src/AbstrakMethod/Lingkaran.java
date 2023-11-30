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

public class Lingkaran extends methodAbstract {
    int r = 7;
    
    public int luas() {
        return (int) Math.PI * (r * r);
    }
    
    public int keliling() {
        return (int) ((int) 2 * (Math.PI * r));
    }
}
