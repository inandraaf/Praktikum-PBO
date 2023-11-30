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
public abstract class methodAbstract {
    public abstract int luas();
    public abstract int keliling();
    
    public int getLuas() {
        return luas();
    }
    
    public int getKel() {
        return keliling();
    }
}
