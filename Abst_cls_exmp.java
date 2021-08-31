/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java_lab;

/**
 *
 * @author JOHN JOSEPH
 */

abstract class A{
    void fun1(){
        System.out.println("Call me from B");
    }
}
class B extends A{
}
public class Abst_cls_exmp {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.fun1();
    }
}
