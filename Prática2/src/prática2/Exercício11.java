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
public class Exercício11 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double total, dia, taxa = 0;
        
        System.out.println("Informe o numero de diarias: ");
        dia = input.nextDouble();
        
        if (dia < 15) {
            taxa = 15;
        }
        else if (dia == 15) {
            taxa = 10;
        }
        else if (dia > 15) {
            taxa = 5;
        }
        
        total = (500*dia)+(taxa*dia);
        System.out.println("O total a ser pago é de R$" + total);
        
        
    }
    
}
