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
public class Exercício6 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double x, y, z;
        
        System.out.println("Informe o valor X: ");
        x = input.nextDouble();
        
        System.out.println("Informe o valor Y: ");
        y = input.nextDouble();
        
        System.out.println("Informe o valor Z: ");
        z = input.nextDouble();
        
        if ((x-y)<z && z<(x+y)
                || (x-z)<y && y<(x+y)
                || (y-z)<x && x<(y+z)) {
            System.out.println("Os valores informados podem ser os comprimentos dos lados de um triangulo.");
        }
        else {
            System.out.println("Os valores informados NAO podem ser os comprimentos dos lados de um triangulo.");
        }
        
        
    }
    
}
