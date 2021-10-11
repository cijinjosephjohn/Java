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
import java.applet.*;

class WheelAnimation extends Applet implements Runnable{
    int i=0;
    Thread t;
    WheelAnimation(){
       t =new Thread(this);
       t.start();
    }
    public void run(){
        for(i =0;i<1000;i=i+10){
            try{
                repaint();
                t.sleep(100);
             
            }
            catch(Exception e){
                
            }
        }
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawOval(100+i, 100, 50, 50);
    }
}
class Viewz1 extends JFrame{
    WheelAnimation b = new WheelAnimation();
    Viewz1(){
         this.setSize(500,500);
        this.add(b);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
public class Wheel {
    public static void main(String[] args){
        Viewz1 a = new Viewz1();
    }
}