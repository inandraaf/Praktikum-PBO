/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul12;

import java.awt.Container;
import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class FrameA extends javax.swing.JFrame{
    public FrameA() {
        super("Frame dan Button");
        setSize(100,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrameA fa = new FrameA();
        Container kontainer = fa.getContentPane();
        JButton jbtOK = new JButton("OK");
        kontainer.add(jbtOK);
    }
    
}
