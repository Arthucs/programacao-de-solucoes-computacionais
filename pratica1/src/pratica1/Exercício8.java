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
public class Exercício8 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double peso, peso15, peso20;
        
        System.out.println("Informe seu peso: ");
        peso = input.nextDouble();
        
        peso15 = (0.15 * peso) + peso;
        System.out.println("Caso engorde 15%: " + peso15 + "kg");
        
        peso20 = peso - (0.20 * peso); 
        System.out.println("Caso emagreca 20%: " + peso20 + "kg");
        
        
    }
    
}
