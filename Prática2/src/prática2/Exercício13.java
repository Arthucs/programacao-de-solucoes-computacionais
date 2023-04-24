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
public class Exercício13 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double total, dia, taxa = 0;
        int apto;
        
        System.out.println("Informe o numero de diarias: ");
        dia = input.nextDouble();
        
        System.out.println("Informe tipo do apartamento (Digite 1 para um apartamento Simples e 2 para Duplo): ");
        apto = input.nextInt();
        
        if (apto == 1 && dia < 10) {
            taxa = 100;
        }
        else if (apto == 1 && dia >= 10 && dia <= 15) {
            taxa = 90;
        }
        else if (apto == 1 && dia > 15) {
            taxa = 80;
        }
        
        
        if (apto == 2 && dia < 10) {
            taxa = 140;
        }
        else if (apto == 2 && dia <= 10 && dia >= 15) {
            taxa = 120;
        }
        else if (apto == 2 && dia > 15) {
            taxa = 100;
        }
        
        total = taxa*dia;
        System.out.println("O total a ser pago eh de R$" + total);
        
        
    }
    
}
