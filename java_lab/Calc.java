/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_lab;
import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */
class Calculator extends Applet implements ActionListener{
    TextField t1;
    Label l1;
    Button b1;
   Calculator(){
       setLayout(null);
       t1 = new TextField();
       l1 = new Label("abcc");
       b1 = new Button("Click here");
       t1.getText();
       l1.setBounds(100, 60, 90, 100);
       t1.setBounds(100, 80 ,90 , 100);
       b1.setBounds(100, 100, 50, 50);
       
       add(l1);
       add(t1);
       add(b1);
       
   }
    public void actionPerformed(ActionEvent e){
        
    }
}
class Viewzz extends JFrame{
    Calculator b = new Calculator();
    Viewzz(){
        this.setSize(500,500);
        this.add(b);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
public class Calc {
    public static void main(String[] args) {
        Viewzz a = new Viewzz();
    }
    
}
