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
public class Exercício10 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double raio, comp, area, vol, π;
        
        System.out.println("Informe o raio: ");
        raio = input.nextDouble();
        
        π = 3.14;
        comp = 2 * π * raio;
        System.out.println("Comprimento da esfera: " + comp);
        
        area = π * (Math.pow(raio, 2));
        System.out.println("Area da esfera: " + area);
        
        vol = (Math.pow(raio, 3)) * π * 0.75;
        System.out.println("Volume da esfera: " + vol);
        
    }
    
}
