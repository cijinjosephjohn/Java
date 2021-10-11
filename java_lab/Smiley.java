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
import java.applet.*;
import java.awt.*;
import javax.swing.*;

class Emoji extends Applet{
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(80, 70, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
        g.drawArc(130, 165, 50, 20 , 180, 180);
    }
    
}
class View extends JFrame{
    Emoji smile= new Emoji();
    View() {
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(smile);
        this.setVisible(true);
    }
}
public class Smiley{
      public static void main(String[] args) {
        View A = new View();

        
    }
    
}