/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul12;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class FrameB extends javax.swing.JFrame {
    public FrameB() {
        super("Frame dan Button");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        FrameB fb = new FrameB();
        JPanel panel = new JPanel();
        URL img = FrameB.class.getResource("foto.png");
        JButton jbtOK = new JButton("OK");
        JButton jbtImg = new JButton(new ImageIcon(img));
        panel.add(jbtOK);
        panel.add(jbtImg);
        fb.add(panel);
        fb.setVisible(true);
    }
}
