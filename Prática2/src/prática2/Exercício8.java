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
public class Exercício8 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        int cod;
        
        System.out.println("Informe codigo: ");
        cod = input.nextInt();
        
        if (cod == 1) {
            System.out.println("Produto: Sapato"
                    + "\n Preco: " + "R$99,99");
        }
        if (cod == 2) {
            System.out.println("Produto: Bolsa"
                    + "\n Preco: " + "R$103,89");
        }
        if (cod == 3) {
            System.out.println("Produto: Camisa"
                    + "\n Preco: " + "R$48,98");
        }
        if (cod == 4) {
            System.out.println("Produto: Calca"
                    + "\n Preco: " + "R$89,72");
        }
        if (cod == 5) {
            System.out.println("Produto: Blusa"
                    + "\n Preco: " + "R$97,35");
        }
        
        
        
    }
    
}
