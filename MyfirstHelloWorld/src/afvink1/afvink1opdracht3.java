/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink1;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author BramWeenink
 */
public class afvink1opdracht3 extends JFrame {
    
     JTextField field;
     JLabel label;
     
     public static void main(String[] args) {
        afvink1opdracht3 frame = new afvink1opdracht3();
        frame.setSize(300, 200);
        frame.createGUI();
        frame.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        label = new JLabel ("Dit is een Label");
        window.add(label);
        field = new JTextField ("Hello");
        field.setPreferredSize(new Dimension(200, 40));
        window.add(field);
    }
}
