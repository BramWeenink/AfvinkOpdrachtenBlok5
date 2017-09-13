/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package myfirsthelloworld;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author BramWeenink
 */
public class H2O extends JFrame implements ActionListener{
    
    private JTextField field1;
    private JTextField field2;
    private JLabel label1;
    private JLabel label2;
    private JPanel panel;
    private JButton button;
       
    
    public static void main(String[] args){
        H2O frame = new H2O();
        frame.setSize(500,500);
        frame.createGUI();
        frame.setVisible(true);
    }
         
    public H2O() {
        this.setSize(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Waterstof Atoom, Bram Weenink");
        this.setVisible(true);
    }
    
       
    
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        label1 = new JLabel ("x");
        window.add(label1);
        field1 = new JTextField();
        field1.setPreferredSize(new Dimension (50,50));
        field1.setBackground(Color.white);
//        field1.addActionListener(this);
        window.add(field1);
        
        label2 = new JLabel ("y");
        window.add(label2);
        field2 = new JTextField();
        field2.setPreferredSize(new Dimension (50,50));
        field2.setBackground(Color.white);
//        field2.addActionListener(this);
        window.add(field2);
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.blue);
        window.add(panel);
        
        button = new JButton();
        button.setText("Teken water molecuul");
        button.setBackground(Color.gray);
        button.addActionListener(this);
        window.add(button);
        
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("geklikt");
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.blue);
        paper.fillRect(0,0,500,500);
        String xlocatie = field1.getText();
        String ylocatie = field2.getText();
        int parseInt = Integer.parseInt(xlocatie);
        int parseInt1 = Integer.parseInt(ylocatie);
        paper.setColor(Color.red);
        paper.fillOval(50+parseInt,125+parseInt1,100,100);
        paper.drawOval(50+parseInt,125+parseInt1,100,100);
        paper.setColor(Color.white);
        paper.fillOval(25+parseInt,25+parseInt1,50,50);
        paper.drawOval(25+parseInt,25+parseInt1,50,50);
        paper.fillOval(150+parseInt,25+parseInt1,50,50);
        paper.drawOval(150+parseInt,25+parseInt1,50,50);
        paper.setColor(Color.black);
        paper.drawLine(55+parseInt,75+parseInt1,75+parseInt,130+parseInt1);
        paper.drawLine(170+parseInt,75+parseInt1,125+parseInt,130+parseInt1); 
    }
   
}

// hoek water is 104.45 graden