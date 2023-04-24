/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prática2;
import java.util.Scanner;


/**
 *
 * @author arthu
 */
public class Exercício1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double nota1, nota2, media;
        
        System.out.println("Informe a 1a nota: ");
        nota1 = input.nextDouble();
        
        System.out.println("Informe a 2a nota: ");
        nota2 = input.nextDouble();
        
        media = (nota1+nota2)/2;
        System.out.println("A media eh: " + media);
        
        if (media >= 7) {
            System.out.println("Situacao: Aprovado :)");
        }
        else if (media < 7) {
            System.out.println("Situacao: Reprovado :(");
        }
            
    }

}
    

