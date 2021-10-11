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
class Thread11 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread 1 : "+(char)(65+i));
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
            }
        }
    }
}
class Thread12 implements Runnable{
    public void run(){
        for(int i=5;i>0;i--){
            System.out.println("Thread 2 : "+(char)(85+i));
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
            }
        }
    }
}
public class Thread_by_implementing {
    public static void main(String[] args) {
        Thread11 td= new Thread11();
        Thread12 td1 = new Thread12();
        Thread t = new Thread(td);
        Thread t1 = new Thread(td1);
        t.start();
        try{
            Thread.sleep(250);
        }
        catch(Exception e){
            
        }
        t1.start();
    }
}
