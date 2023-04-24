/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1;

/**
 *
 * @author arthu
 */
import java.util.Scanner;

public class Exercício2 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        int anoNasc, anoAtual, idadeAtual, idade50;
        
        System.out.println("Insira o ano de nascimento: ");
        anoNasc = input.nextInt();
        
        System.out.println("Insira o ano atual: ");
        anoAtual = input.nextInt();
        
        idadeAtual = anoAtual - anoNasc;
        System.out.println("Idade Atual: " + idadeAtual);
        
        idade50 = 2050-anoNasc;
        System.out.println("Idade em 2050: " + idade50);
        
        
    }
    
}
