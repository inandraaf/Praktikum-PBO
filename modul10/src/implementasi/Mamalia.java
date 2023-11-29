/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementasi;

/**
 *
 * @author HP
 */
public class Mamalia implements ActivityAnimal{
    
    public void eat() {
        System.out.println("Mammal eats");
    }
    
    public void travel() {
        System.out.println("Mammal travels");
    }
    
    public int noOfLegs() {
        return 0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia m = new Mamalia();
        m.eat();
        m.travel();
    }
    
}
