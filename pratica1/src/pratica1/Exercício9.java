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
public class Exercício9 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        double h, c1, c2;
        
        System.out.println("Informe o valor do 1o cateto: ");
        c1 = input.nextDouble();
        
        System.out.println("Informe o valor do 2o cateto: ");
        c2 = input.nextDouble();

        h = Math.sqrt(Math.pow(c1, 2) + (Math.pow(c2,2)));
        System.out.println("A hipotenusa eh: " + h);
        
    }
    
}
