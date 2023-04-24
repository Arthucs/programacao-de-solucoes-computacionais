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
public class Exercício2 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double lado1, lado2, lado3;
        
        System.out.println("Informe o 1o lado do Triangulo: ");
        lado1 = input.nextDouble();
        
        System.out.println("Informe o 2o lado: ");
        lado2 = input.nextDouble();
        
        System.out.println("Informe o 3o lado: ");
        lado3 = input.nextDouble();
        
       if(lado1 == lado2 && lado2 == lado3) {
           System.out.println("Triangulo Equilatero");
       }
       else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
           System.out.println("Triangulo Isoceles");
       }
       else if(lado1 != lado2 && lado2 != lado3) {
           System.out.println("Triangulo Escaleno");
       }     
        
    }

            
}
    

