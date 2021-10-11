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
import java.applet.Applet;
import java.util.logging.Level;
import java.util.logging.Logger;

class Traffic extends Applet implements Runnable{
    Thread t;
    int c;
    Traffic(){
        c=1;
        t= new Thread(this);
        t.start();
    }
 
    @Override
    public void run(){
        
        for(int i=1;i<100;i++){
            try{
                if(c==1){
                    Thread.sleep(3000);
                    repaint();
                    c=2;
                   
                }
                else if(c==2){
                    t.sleep(3000);
                    repaint();
                    c=3;
                   
                }
                else if(c==3){
                    t.sleep(3000);
                    repaint();
                    c=1;
                    
                }
            }
            catch(Exception e){
                
            }
              
        }
        
    }
    @Override
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
class View1 extends JFrame{
    Traffic A = new Traffic();
    View1(){
        this.setSize(420,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(A);
        this.setVisible(true);
    }
}
public class NewClass extends JFrame {
    public static void main(String[] args) {
        View1 B= new View1();  
    }
}
