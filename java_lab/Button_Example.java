/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_lab;

/**
 *
 * @author hp
 */
import javax.swing.*;   
import java.awt.event.*;
public class Button_Example extends JFrame implements ActionListener{  
    static  JTextField t1,t2;
    public static void main(String[] args) {  
        t1 = new JTextField("abc");
        Button_Example c = new Button_Example();
        t1.setBounds(100, 100, 100, 100);
        t2 = new JTextField();
        t2.setBounds(100, 300, 50,100 );
        JFrame f=new JFrame("Button Example");  
        JButton b=new JButton("Click Here");  
        b.addActionListener(c);
        b.setBounds(50,100,95,30);  
        f.add(b);  
        f.add(t1);
        f.add(t2);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
        
    }  
    public void actionPerformed(ActionEvent e){
        String s =  e.getActionCommand();
        t2.setText(s);
        
    }
}  
