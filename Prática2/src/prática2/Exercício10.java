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
public class Exercício10 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double n1, n2, op;
        
        System.out.println("Informe o 1o numero: ");
        n1 = input.nextDouble();
        
        System.out.println("Informe o 2o numero: ");
        n2 = input.nextDouble();
        
        System.out.println("1 - Somar os dois números"
                + "\n2 - Multiplicar os dois numeros"
                + "\n3 - Subtrair o numero maior pelo numero menor"
                + "\n4 - Divir o primeiro numero pelo segundo (lembre-se de que não sexiste divisão por zero)");
        op = input.nextDouble();
        
        if (op == 1) {
            System.out.println("Soma: " + (n1+n2));
        }
        if (op == 2) {
            System.out.println("Multiplicacao: " + (n1*n2));
        }
        if (op == 3 && n1 > n2) {
            System.out.println("Subtracao: " + (n1-n2)); 
        }
        else if (op == 3 && n2 > n1) {
            System.out.println("Subtracao: " + (n2-n1));
        }
        else if (op == 3 && n2 == n1) {
            System.out.println("Subtracao: 0");
        }
        if (op == 4) {
            System.out.println("Divisao: " + (n1/n2));
        }

        
    }
    
}
