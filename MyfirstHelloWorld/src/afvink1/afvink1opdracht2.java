/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink1;

import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author BramWeenink
 */
//public class afvink1opdracht2{
//    public static void main (String[] args){
//           String naam = Arrays.toString(args);
//        System.out.println ("Hello " +args[0]);
//    }
//}

public class afvink1opdracht2 extends JFrame{
    public static void main (String[] args){
        String naam = JOptionPane.showInputDialog("Wat is je naam");
        JOptionPane.showMessageDialog(null, "Hello " +naam);
    }
}