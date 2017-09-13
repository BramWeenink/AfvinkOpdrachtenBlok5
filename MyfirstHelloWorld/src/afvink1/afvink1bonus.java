/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author BramWeenink
 */
public class afvink1bonus extends JFrame {
    
    JTextField field;
    JLabel label;
     
    public static void main(String[] args) {
        afvink1bonus frame = new afvink1bonus();
        ImageIcon icon = new ImageIcon("C:\\Users\\BramWeenink\\Pictures\\mario.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(300, 200);
        frame.createGUI();
        frame.setVisible(true);
//        frame.addWindowListener(getWindowAdapter());
    }
    
//    private static WindowAdapter getWindowAdapter() {
//        return new WindowAdapter() {
//            @Override
//            public void windowIconified(WindowEvent we) {
//                frame.setState(JFrame.NORMAL);
//                }
//        };
//    }
    
    private void createGUI(){
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        label = new JLabel ("Dit is een Label");
        label.setForeground(Color.red);
        window.add(label);
        field = new JTextField ("Hello");
        field.setPreferredSize(new Dimension(200, 40));
        window.add(field);
        window.setBackground(Color.blue);
    }
}