/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática2;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Exercício5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double x, resultado = 0;
        
        System.out.println("Informe o valor de x: ");
        x = input.nextDouble();
        
        if (x < -2) {
            resultado = (2*x) + 2;
        }
        
        if (-2 <= x && x < 3) {
            resultado = 3;
        }
        
        if (3 <= x) {
            resultado = -x;
        }
        
        System.out.println("O resultado eh: " + resultado);
        
    }
    
}
