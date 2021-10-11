/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_lab;

import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author hp
 */
class TickReservation extends Applet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==blay){
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(bbook);
            sname = tname.getText();
            sage = tage.getText();
            
        }
        else if (e.getSource()==b1){
            if(b1.getBackground()==Color.red){
                b1.setBackground(Color.white);
                sseat="";
            }
            else{
                b1.setBackground(Color.red);
                sseat="1";
            }
        }
        else if (e.getSource()==b2){
            if(b2.getBackground()==Color.red){
                b2.setBackground(Color.white);
                sseat="";
            }
            else{
                b2.setBackground(Color.red);
                sseat="2";
            }
        }
        else if (e.getSource()==b3){
            if(b3.getBackground()==Color.red){
                b3.setBackground(Color.white);
                sseat="";
            }
            else{
                b3.setBackground(Color.red);
                sseat="3";
            }
        }
        else if (e.getSource()==b4){
            if(b4.getBackground()==Color.red){
                b4.setBackground(Color.white);
                sseat="";
            }
            else{
                b4.setBackground(Color.red);
                sseat="4";
            }
        }
        else if (e.getSource()==b5){
            if(b5.getBackground()==Color.red){
                b5.setBackground(Color.white);
                sseat="";
            }
            else{
                b5.setBackground(Color.red);
                sseat="5";
            }
        }
        else if (e.getSource()==b6){
            if(b6.getBackground()==Color.red){
                b6.setBackground(Color.white);
                sseat="";
            }
            else{
                b6.setBackground(Color.red);
                sseat="6";
            }
        }
        else if (e.getSource()==b7){
            if(b7.getBackground()==Color.red){
                b7.setBackground(Color.white);
                sseat="";
            }
            else{
                b7.setBackground(Color.red);
                sseat="7";
            }
        }
        else if (e.getSource()==b8){
            if(b8.getBackground()==Color.red){
                b8.setBackground(Color.white);
                sseat="";
            }
            else{
                b8.setBackground(Color.red);
                sseat="8";
            }
        }
        else if(e.getSource()==bbook){
            Graphics c = getGraphics();
            String name = "Name : "+sname;
            String age = "Age : "+sage;
            String seat = "Seat No ; "+sseat;
            c.drawString(name, 70,290); 
            c.drawString(age, 70, 310);
            c.drawString(seat, 70, 330);
            c.drawString(samount, 70, 350);
        }
    }
    Button blay,bbook;
    Label lname,lage;
    TextField tname,tage;
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    String sname,sage,samount="Amount : 790",sseat;
    TickReservation() {
        // TODO start asynchronous download of heavy resources
        setLayout(null);
        lname = new Label("Name : ");
        lage = new Label ("Age : ");
        blay = new Button("Layout");
        bbook = new Button("Confirm");
        tname = new TextField();
        tage = new TextField();
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        lname.setBounds(0, 10, 50, 50);
        lage.setBounds(0, 60, 50, 50);
        blay.setBounds(200, 110, 50, 50);
        bbook.setBounds(200, 410, 50, 50);
        tname.setBounds(60, 10, 300, 30);
        tage.setBounds(60, 60, 300, 30);
        
        
        
        b1.setBounds(70,180,30,30);
        b2.setBounds(70,220,30,30);
        b3.setBounds(110,180,30,30);
        b4.setBounds(110,220,30,30);
        b5.setBounds(150,180,30,30);
        b6.setBounds(150,220,30,30);
        b7.setBounds(190,180,30,30);
        b8.setBounds(190,220,30,30);
        
        
        add(lname);
        add(lage);
        add(blay);
        add(tname);
        add(tage);
        blay.addActionListener(this);
        bbook.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        
        bbook.addActionListener(this);
        
    }
    public void paint(Graphics g){
        //g.drawRect(100 ,150, 30, 30);
    }
    // TODO overwrite start(), stop() and destroy() methods


}
class ViewzX1 extends JFrame{
    TickReservation b = new TickReservation();
    ViewzX1(){
         this.setSize(500,500);
        this.add(b);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
public class TicketReservation {
    public static void main(String[] args){
        ViewzX1 a = new ViewzX1();
    }
}