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
public class BankPribadi extends Bank{
    protected String rasioBunga(int bunga) {
        String hasil = "Bank Pribadi" + "\n" + "Rasio Bunga " + bunga + "%" + "\n" + "Gratis Buku dan Kartu Debit" + "\n";
        return hasil;
    }
}
