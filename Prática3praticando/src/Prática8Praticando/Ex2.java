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
public class Ex2 {
    
    public static void main (String args[]) {
        
        Ex2Pt2 pt = new Ex2Pt2();
        
        double dd = pt.divisão();
        
        try {
            System.out.println("A divisão eh: " + dd); 
        }
        catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");
            
        }
    }
    
}
