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
public class Ex2 {
    
    public static void main(String[] args) {
        int matrícula;
        double nota1, nota2, nota3, média;
        int countAluno = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a matrícula do aluno (-1 para encerrar): ");
        matrícula = input.nextInt();
        
        while (matrícula >= 0) {
            System.out.println("Informe a 1a nota: ");
            nota1 = input.nextDouble();
            System.out.println("Informe a 2a nota: ");
            nota2 = input.nextDouble();
            System.out.println("Informe a 3a nota: ");
            nota3 = input.nextDouble();
            countAluno++;
            média = (nota1+nota2+nota3)/3;
            
            if (média >= 70) {
                System.out.println("Aluno " + matrícula +  ": APROVADO!");
            }
            else if (média >= 60 && média < 70) {
                System.out.println("Aluno " + matrícula +  ": em RECUPERAÇÃO");
            }
            else if (média < 60) {
                System.out.println("Aluno " + matrícula +  ": REPROVADO");
            }
            
            System.out.println("Informe a matrícula do aluno (-1 para encerrar): ");
            matrícula = input.nextInt();
        }
        
    }
    
}
