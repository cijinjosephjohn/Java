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
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author student
 */
class NewApplet extends Applet implements ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    float n1,n2;
    TextField t1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bequl,bmult,bdiv,bcls;
    String s4,s1,s2,s3;
    NewApplet() {
        // TODO start asynchronous download of heavy resources
       
        t1 = new TextField();
        t1.setBounds(100, 70, 90, 30);
        setLayout(null);
       
       
        b0=new Button("0");
        b1=new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button ("8");
        b9 = new Button("9");
        badd = new Button("+");
        bsub = new Button("-");
        bequl = new Button("=");
        bmult = new Button("*");
        bdiv = new Button("/");
        bcls = new Button("cls");
       
        b0.setBounds(100, 100, 30, 30);
        b1.setBounds(130, 100, 30, 30);
        b2.setBounds(160, 100, 30, 30);
        b3.setBounds(100, 130, 30, 30);
        b4.setBounds(130, 130, 30, 30);
        b5.setBounds(160, 130, 30, 30);
        b6.setBounds(100, 160, 30, 30);
        b7.setBounds(130, 160, 30, 30);
        b8.setBounds(160, 160, 30, 30);
        b9.setBounds(100, 190, 30, 30);
        badd.setBounds(130, 190, 30, 30);
        bequl.setBounds(160, 190, 30, 30);
        bmult.setBounds(100, 210, 30, 30);
        bdiv.setBounds(130, 210, 30, 30);
        bcls.setBounds(160, 210, 30, 30);
       
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        badd.addActionListener(this);
        bequl.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bcls.addActionListener(this);
       
       
       
       
        add(t1);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(badd);
        add(bequl);
        add(bmult);
        add(bdiv);
        add(bcls);
       
       
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b0){
               s1=t1.getText();
               s2="0";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == b1){
               s1=t1.getText();
               s2="1";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == b2){
               s1=t1.getText();
               s2="2";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == b3){
               s1=t1.getText();
               s2="3";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == b4){
               s1=t1.getText();
               s2="4";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == b5){
               s1=t1.getText();
               s2="5";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == b6){
               s1=t1.getText();
               s2="6";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == b7){
               s1=t1.getText();
               s2="7";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == b8){
               s1=t1.getText();
               s2="8";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == b9){
               s1=t1.getText();
               s2="9";
               s3 = s1+s2;
               t1.setText(s3);
        }
        else if(e.getSource() == badd){
               n1  = Float.parseFloat(s3);
               t1.setText("");
               s4="+";
        }
        else if(e.getSource() == bequl){
             n2 = Float.parseFloat(s3);
             if(s4 == "+"){
                 float n3 = n1+n2;
                 t1.setText(n3+"");
              }
             else if(s4=="-"){
                 float n3 = n1-n2;
                 t1.setText(n3+"");
             }
             else if(s4=="*"){
                 float n3 = n1*n2;
                 t1.setText(n3+"");
             }
             else if(s4=="/"){
                 float n3 = n1/n2;
                 t1.setText(n3+"");
             }
        }
        else if(e.getSource() == bsub){
               n1  = Float.parseFloat(s3);
               t1.setText("");
               s4="-";
        }
        else if(e.getSource() == bmult){
               n1  = Float.parseFloat(s3);
               t1.setText("");
               s4="*";
        }
        else if(e.getSource() == bdiv){
               n1  = Float.parseFloat(s3);
               t1.setText("");
               s4="/";
        }
        else if(e.getSource() == bcls){
               n1=0;
               n2=0;
               t1.setText("");
               
        }
       
    }

    // TODO overwrite start(), stop() and destroy() methods
}
class Viewzz1 extends JFrame {
    NewApplet b = new NewApplet();
    Viewzz1(){
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(b);
        this.setVisible(true);
    }
}
public class Calculator {
    public static void main(String[] args) {
        Viewzz1 a = new Viewzz1();
    }
}
