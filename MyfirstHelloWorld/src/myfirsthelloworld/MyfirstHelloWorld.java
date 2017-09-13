/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirsthelloworld;

/**
 *
 * @author BramWeenink
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyfirstHelloWorld extends JFrame{

    JTextField field;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyfirstHelloWorld frame = new MyfirstHelloWorld();
        frame.setSize(300, 200);
        frame.createGUI();
        frame.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        field = new JTextField ("Hello");
        field.setPreferredSize(new Dimension(200, 40));
        window.add(field);
    }
}
