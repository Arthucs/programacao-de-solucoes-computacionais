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
public class Exercício4 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double salAtual, aumento, salFinal;
        
        System.out.println("Informe o salario atual: ");
        salAtual = input.nextDouble();
        
        aumento = salAtual/4;
        salFinal = aumento + salAtual;
        System.out.println("O novo salario eh: " + salFinal);
        
        
    }
    
}
