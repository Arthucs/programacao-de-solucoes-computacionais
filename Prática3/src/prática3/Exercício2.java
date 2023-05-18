/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática3;
import java.util.Scanner;
/**
 *
 * @author arthu
 */
public class Exercício2 {
    
    public static void main(String args[]) {
		
	Scanner input = new Scanner(System.in);

     System.out.println("Digite a matrícula do aluno (-1 para encerrar): ");
     int matricula = input.nextInt();

     while (matricula >= 0) {
         System.out.println("Digite a primeira nota do aluno: ");
         double nota1 = input.nextDouble();

         System.out.println("Digite a segunda nota do aluno: ");
         double nota2 = input.nextDouble();

         System.out.println("Digite a terceira nota do aluno: ");
         double nota3 = input.nextDouble();

         double media = (nota1 + nota2 + nota3) / 3;

         if (media >= 70) {
             System.out.println("Aluno aprovado com média " + media);
         } else if (media >= 60 && media < 70) {
             System.out.println("Aluno em recuperação com média " + media);
         } else {
             System.out.println("Aluno reprovado com média " + media);
         }

         System.out.println("Digite a matrícula do aluno (-1 para encerrar): ");
         matricula = input.nextInt();
     }

     System.out.println("Matricula inválida. Fim do programa!");
}
    
}
