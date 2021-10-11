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
import java.util.Scanner;

public class Handling_Exception {
    public static void main(String[] args) {
        try{
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter a number : ");
           int a1 = scan.nextInt();
           System.out.println("Enter a number : ");
           int a2 = scan.nextInt();
           int b = a1/a2;
           System.out.println("Answer : "+b);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Divided By zero ");
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Error : Array index out of range");
        } 
        catch(NumberFormatException e){
            System.out.println("Error : "+e);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
}

