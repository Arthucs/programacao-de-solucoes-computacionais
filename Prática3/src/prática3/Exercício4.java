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
public class Exercício4 {
    
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double salario, mediaSalario = 0.0;
	      int numFilhos, totalFilhos = 0, numPessoas = 0;
	      
	      do {
	         System.out.print("Informe o salário (valor negativo para encerrar): R$ ");
	         salario = input.nextDouble();
	         
	         if (salario >= 0) {
	            System.out.print("Informe o número de filhos: ");
	            numFilhos = input.nextInt();
	            
	            numPessoas++;
	            totalFilhos += numFilhos;
	            mediaSalario += salario;
	         }
	      } while (salario >= 0);
	      
	      mediaSalario /= numPessoas;
	      double mediaFilhos = (double) totalFilhos / numPessoas;
	      
	      System.out.printf("Média salarial da população: R$ %.2f\n", mediaSalario);
	      System.out.printf("Média do número de filhos: %.1f\n", mediaFilhos);
	   }
    
}
