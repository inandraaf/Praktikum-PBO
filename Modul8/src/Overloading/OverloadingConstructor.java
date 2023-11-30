/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author HP
 */
import java.util.Date;
public class OverloadingConstructor {
    int idUser;
    String userName;
    int level;
    Date lastLogin;
    
    public OverloadingConstructor() {
        
    }
    
    public OverloadingConstructor(int idUser, String userName) {
        this.idUser = idUser;
        this.userName = userName;
    }
}
