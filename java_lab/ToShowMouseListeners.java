/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_lab;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hp
 */
class ShowMouseListeners extends Applet implements MouseListener,ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Button b1 ;
    ShowMouseListeners() {
        setLayout(null);
        
        // TODO start asynchronous download of heavy resources
        b1 = new Button("New");
        b1.setBounds(60, 60, 50, 50);
        add(b1);
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==b1){
            this.addMouseListener(this);
        }
        if(b1.getBackground()==Color.red){
            b1.setBackground(Color.green);
        }
        else {
            b1.setBackground(Color.red);
        }
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void mouseClicked(MouseEvent e) {
        
        //To change body of generated methods, choose Tools | Templates.
        if(b1.getBackground()==Color.red){
            Graphics g = getGraphics();
            g.drawOval(e.getX(), e.getY(), 30, 30);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


class A12 extends JFrame {
    ShowMouseListeners b = new ShowMouseListeners();
    A12(){
        this.setSize(400,400);
        this.add(b);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
public class ToShowMouseListeners {
    public static void main(String[] args) {
        new A12();
    }
    
}
