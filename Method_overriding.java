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
class Figure {
    void area(){
        System.out.println("Area cannot be calculated ");
    }
}
class Rectangle extends Figure {
    double area(double l,double h){
        return l*h;
        
    }
}
class Triangle extends Figure {
    double area (double b,double h){
        return (b*h)/2;
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Triangle obj2 = new Triangle();
        double ans1 = obj1.area(5, 3);
        double ans2 = obj2.area(5,3);
        System.out.println("Area of Triangle : "+ans2+"\nArea of Rectangle : "+ans1);
    }
    
}
