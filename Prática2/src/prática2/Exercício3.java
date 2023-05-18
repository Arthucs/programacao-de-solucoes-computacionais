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
public class Exercício3 {
   
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double nota1, nota2, nota3, media;
        
        
        System.out.println("Informe a 1a nota: ");
        nota1 = input.nextDouble();
        
        System.out.println("Informe a 2a nota: ");
        nota2 = input.nextDouble();
        
        System.out.println("Informe a 3a nota: ");
        nota3 = input.nextDouble();
        
        if (nota1>10 || nota2>10 || nota3>10) {
            System.out.println("Informe valores de 0 a 10");
        } else {
            media = (nota1+nota2+nota3)/3;
            System.out.println("A media eh: " + media);

            if (media >= 7 && media <=10) {
                System.out.println("Situacao: Aprovado");
            }
            else if (media >=3 && media < 7) {
                System.out.println("Situacao: Exame");
            }
            else if (media >= 7 && media < 3) {
                System.out.println("Situacao: Reprovado");
            }
        }
    }
}
