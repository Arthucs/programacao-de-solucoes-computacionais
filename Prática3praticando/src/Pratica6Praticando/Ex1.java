/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratica6Praticando;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int i, soma=0;
        
        for (i =0; i < vetor.length; i++) {
            System.out.println("Informe um valor: ");
            vetor[i] = input.nextInt();
            
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
            }
        }
        System.out.println("Vetor informado:");
        for (i =0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Soma dos numeros pares: " + soma);
        
    }
    
}
