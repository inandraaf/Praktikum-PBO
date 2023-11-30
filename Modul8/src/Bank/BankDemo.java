/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author HP
 */
public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankPribadi pri = new BankPribadi();
        BankUmum umu = new BankUmum();
        BankPasar pas = new BankPasar();
        BankSyariah sya = new BankSyariah();
        
        System.out.println(bank.rasioBunga(5));
        System.out.println(pri.rasioBunga(8));
        System.out.println(umu.rasioBunga(8));
        System.out.println(pas.rasioBunga(9));
        System.out.println(sya.rasioBunga(4));
    }
}
