/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prática8Praticando;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex1 {
    
    public static void main (String args[]) {
        
        int num1, num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o 1o numero: ");
        num1 = input.nextInt();
        System.out.println("Informe o 2o numero: ");
        num2 = input.nextInt();
        
        try {
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
        catch (ArithmeticException e) {
            System.out.println("deu merda");
        }
        
    }
    
}
