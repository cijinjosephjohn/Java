package com.mycompany.java_lab;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.*;
import java.applet.*;
/*
import java.util.logging.Level;
import java.util.logging.Logger;
*/
class T_light extends Applet implements Runnable{
    
    Thread t;
    int c;
    
    T_light() {
        
        c=1;
        t= new Thread(this);
        t.start();
    }

    public void run(){
        
        for(int i=1;i<100;i++){
            
            try {
                if(c==1){
                    t.sleep(1000);
                    repaint();
                    c=2;
                    
                }
                else if(c==2){
                    t.sleep(1000);
                    repaint();
                    c=3;
                    
                }
                else if(c==3){
                    t.sleep(1000);
                    repaint();
                    c=1;
                   
                }
            } catch (Exception ex) {
                    
            }
            
        }
        
    }
    
    public void paint(Graphics g){
        
        g.setColor(Color.black);
        g.fillRoundRect(100, 100, 100, 220, 20, 20);
        g.setColor(Color.gray);
        g.fillRect(120,320,60,500);
        if(c==1){
            
            g.setColor(Color.red);
            g.fillOval(120,110,60,60);
            g.setColor(Color.black);
            
            
        }
        
        else if(c==2){
            
            g.setColor(Color.yellow);
            g.fillOval(120,180,60,60);
            g.setColor(Color.black);
           
            
            
        }
        
        else if(c==3){
            
            g.setColor(Color.green);
            g.fillOval(120,250,60,60);
            g.setColor(Color.black);
           
            
        }
        
    }
    
}
class View extends JFrame {
    T_light b = new T_light();
    View(){
        this.setSize(500,500);
        this.add(b);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
}
public class Traffic {
    public static void main(String[] args) {
        View a= new View();
    }
}

