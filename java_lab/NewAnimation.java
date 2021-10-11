/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_lab;

import java.applet.Applet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author hp
 */
class Anime extends Applet implements Runnable {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Thread t ;
    int i=0,c=0;
    Anime() {
        // TODO start asynchronous download of heavy resources
        t = new Thread(this);
        t.start();
    }
    public void run(){
        for(i=0;i<1000;i=i+10){
                try{
                if(c==0){
                    repaint();
                    t.sleep(100);
                    
                }
                else if(c==1){
                    repaint();
                    t.sleep(100);
                    
                }
            }
                catch (Exception ex) {
            }
        }
    }
    public void paint(Graphics g){
        if(c==0){
            g.fillOval(i, 30, 30, 30);
            g.setColor(Color.red);
            g.fillOval(300,30,30,30);
            if(i==270){
                c=1;
            }  
        }
        else if(c==1){
            g.fillOval(270, 30, 30, 30);
            g.setColor(Color.red);
            g.fillOval(i+30,30,30,30);
        }
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
class MainView extends JFrame {
        Anime b = new Anime();
    MainView(){
        this.setSize(500,500);
        this.add(b);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
}

public class NewAnimation {
    public static void main(String[] args) {
        new MainView();
    }
}