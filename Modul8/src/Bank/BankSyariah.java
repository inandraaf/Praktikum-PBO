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
public class BankSyariah extends BankUmum{
    protected String rasioBunga(int bunga) {
        String hasil = "Bank Syariah" + "\n" + "Rasio Bunga " + bunga + "%" + "\n" + "Gratis Buku" + "\n";
        return hasil;
    }
}
