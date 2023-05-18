/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática3praticando;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex3 {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int canal, numPessoas;
        int total2 = 0, total4 = 0, total5 = 0, total7 = 0, total12 = 0;
        double totalPessoas = 0;
        double perAud2 = 0, perAud4 = 0, perAud5 = 0, perAud7 = 0, perAud12 = 0;
        
        System.out.println("Qual o canal assistido: 2, 4, 5, 7 ou 12? (digite 0 para encerrar): ");
        canal = input.nextInt();
        
        while (canal != 0) {
            System.out.println("Quantas pessoas assistiam ao canal?: ");
            numPessoas = input.nextInt();
            
            totalPessoas += numPessoas;
            
            switch (canal) {
                case 2 -> total2 += numPessoas;
                case 4 -> total4 += numPessoas;
                case 5 -> total5 += numPessoas;
                case 7 -> total7 += numPessoas;
                case 12 -> total12 += numPessoas;
            }
            
            perAud2 = (total2/totalPessoas) * 100;
            perAud4 = (total4/totalPessoas) * 100;
            perAud5 = (total5/totalPessoas) * 100;
            perAud7 = (total7/totalPessoas) * 100;
            perAud12 = (total12/totalPessoas) * 100;
            
             System.out.println("Qual o canal assistido: 2, 4, 5, 7 ou 12? (digite 0 para encerrar): ");
        canal = input.nextInt();
        }
        
        System.out.println("Percentual de audiência de cada canal:");
        System.out.println("Canal 2: " + perAud2 + "%");
        System.out.println("Canal 4: " + perAud4 + "%");
        System.out.println("Canal 5: " + perAud5 + "%");
        System.out.println("Canal 7: " + perAud7 + "%");
        System.out.println("Canal 12: " + perAud12 + "%");
        
    }
    
}
