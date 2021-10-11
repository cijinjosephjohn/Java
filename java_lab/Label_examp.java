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
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

class Buttondemo extends Applet implements ActionListener{
	public void init(){
                JFrame f=new JFrame("Button Example"); 
		JButton b = new JButton("Red");
                b.setBounds(100, 100, 50, 50);
		f.add(b);
		b.addActionListener(this);
	}
	public void paint(Graphics g){
		g.drawString("Button DEMO",100,100);
	}

    public void actionPerformed(ActionEvent e) {
     
    }
}

class View3 extends JFrame {
    Buttondemo q = new Buttondemo();
    View3(){
        this.setSize(400,400);
        this.add(q);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
public class Label_examp {
    public static void main(String[] args) {
        View3 v = new View3();
    }
}
