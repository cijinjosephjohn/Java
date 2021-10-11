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
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

class Div extends Applet implements ActionListener{
    TextField t1,t2,t3;
    Button b;
    Div(){
        Label l1 = new Label("Enter the number 1 ");
        l1.setBounds(120, 30, 50, 50);
        t1 = new TextField();
        t1.setBounds(150, 50, 50, 50);
        Label l2 = new Label("Enter the number 2 ");
        l2.setBounds(120, 50, 50, 50);
        t2 = new TextField();
        t2.setBounds(150, 70, 50, 50);
        Label l3 = new Label ("Answer " );
        l3.setBounds(120, 70, 50, 50);
        t3 = new TextField();
        t3.setBounds(150, 110, 50, 50);
        b=new Button("Divide");
        b.setBounds(150, 150, 50, 50);
        b.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        
        addWindowListner(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                Frame frame = (Frame)e.getSource();
                frame.dispose();
            }
        });
    }

    private void addWindowListner(WindowAdapter windowAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1= t1.getText();
		String s2= t2.getText();
		
		if(e.getSource()==b) {
			try {
				int a =Integer.parseInt(s1);
				int b =Integer.parseInt(s2);
				double c=0;
				c=a/b;
				String res=String.valueOf(c);
				t3.setText(res);
			}
			catch(ArithmeticException Aerr) {
				t3.setText("Incorrect");
			}
			catch(NumberFormatException Nerr) {
				t3.setText("Incorrect");
			}
		}//To change body of generated methods, choose Tools | Templates.
    }
    
}
class View2 extends JFrame{
    Div b = new Div();
    View2(){
        setSize(400, 400);
        add(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class Divisiongui {
    public static void main(String[] args) {
        View2 a = new View2();
    }
}

