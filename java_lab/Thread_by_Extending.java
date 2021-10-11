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

class Thread1 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Thread 1 : "+i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
            }
        }    
    }
}
class Thread2 extends Thread{
    public void run(){
        for (int i=5;i>0;i--){
            System.out.println("Thread 2 : "+i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
            }
        }
    }
}
public class Thread_by_Extending {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread2 t1 = new Thread2();
        t.start();
        try{
            Thread.sleep(250);
        }
        catch (Exception e){
        }
        t1.start();
    }
}
