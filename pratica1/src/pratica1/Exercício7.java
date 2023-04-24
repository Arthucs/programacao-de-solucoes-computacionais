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
public class Exercício7 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double salMin, salFunc, quant;
        
        System.out.println("Informe o salario minimo: ");
        salMin = input.nextDouble();
        
        System.out.println("Informe o salario do funcionario: ");
        salFunc = input.nextDouble();
        
        quant = salFunc / salMin;
        System.out.println("O funcionario recebe " + quant + " salarios minimos");
        
    }
    
}
