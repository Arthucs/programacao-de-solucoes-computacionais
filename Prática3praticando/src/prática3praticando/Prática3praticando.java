/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prática3praticando;
import java.util.Scanner;
/**
 *
 * @author arthu
 */
public class Prática3praticando {

    
    public static void main(String[] args) {
        
        double nota, media, soma=0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        int falta=0, count=0, aprov=0, reprov=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe uma nota (digite -1 para encerrar): ");
        nota = sc.nextDouble();
        
        while (nota >= 0) {
            System.out.println("Informe o número de faltas: ");
            falta = sc.nextInt();
            
            if (nota >= 90) {
                aprov++;
            }
            else if (nota < 70 || falta >= 20) {
              reprov++;  
            }
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
            soma += nota;
            count++;
            
            System.out.println("\nInforme uma nota (digite -1 para encerrar): ");
            nota = sc.nextDouble();
        }
        
        if (count > 0) {
        media = soma/count;
        System.out.println("Número de alunos informados: " + count);
        System.out.println("Alunos com nota acima de 90: " + aprov);
        System.out.println("Alunos reprovados: " + reprov);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média de notas da turma: " + media);
        
        }
    }
    
}
