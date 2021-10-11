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
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.lang.model.SourceVersion;

class demo extends Applet implements ActionListener{
    TextField t1;
    
    public void init(){
        
    }
   
    public void actionPerformed(ActionEvent e){
       
   }
}
class B extends JFrame {
    demo b = new demo();
    B(){
        this.setSize(500,500);
        this.add(b);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
public class New {
    public static void main(String[] args) {
        B a = new B();
    }
 
}
