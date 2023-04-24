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
public class Exercício12 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        int idade, sexo;
        
        System.out.println("Informe sua idade: ");
        idade = input.nextInt();
        
        System.out.println("Informe seu sexo (Digite 1 para maculino e 2 para feminino): ");
        sexo = input.nextInt();
        
        if (sexo == 1 && idade <= 15) {
            System.out.println("Mensalidade: R$60,00");
        }
         if (sexo == 1 && idade >= 16 && idade <= 18) {
            System.out.println("Mensalidade: R$75,00");
        }
         if (sexo == 1 && idade >= 19 && idade <= 30) {
            System.out.println("Mensalidade: R$90,00");
        }
         if (sexo == 1 && idade >= 31 && idade <= 40) {
            System.out.println("Mensalidade: R$85,00");
        }
         if (sexo == 1 && idade > 40) {
            System.out.println("Mensalidade: R$80,00");
        }
        
         
         if (sexo == 2 && idade <= 18) {
            System.out.println("Mensalidade: R$60,00");
        }
         if (sexo == 2 && idade >= 19 && idade <= 25) {
            System.out.println("Mensalidade: R$90,00");
        }
         if (sexo == 2 && idade >= 26 && idade <= 40) {
            System.out.println("Mensalidade: R$85,00");
        }
         if (sexo == 2 && idade > 40) {
            System.out.println("Mensalidade: R$80,00");
        }
         
        
    }
    
}
