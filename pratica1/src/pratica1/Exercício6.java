/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Exercício6 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double tempC, tempF;
        
        System.out.println("Informe a temperatura em Celsius: ");
        tempC = input.nextDouble();
        
        tempF = (tempC * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit eh: " + tempF);
        
        
    }
    
}
