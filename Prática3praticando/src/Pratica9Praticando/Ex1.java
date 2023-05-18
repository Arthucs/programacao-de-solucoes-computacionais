/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratica9Praticando;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex1 {
   
    public static int buscaSeq (int vet[], int chave) {
        int i;
        int n = vet.length;
        int comp=0;
        for(i=0; i < n; i++){
            comp += i;
            if (vet[i] == chave) {
            return (i);
            }
        }
        return (-1);
    }
    
    public static int buscaSent (int vet[], int chave, int n) {
        int i=0;
        int comp=0;
        vet[n-1] = chave;
        
        while (vet[i] != chave) {
            i++;
            comp += i;
        }
        if ((i < n - 1) && (vet[n - 1] == chave)){
            return (i);
        }
        return (-1);
    }
    
    public static void main (String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int tipo;
        int[] vet = new int[10];
        int i;
        int chave;
        int n = vet.length;
        int comp = 0;
        
        System.out.println("Informe 10 numeros: ");
        for(i=0; i < vet.length; i++) {
                
            System.out.println("n" + i + ": ");
            vet[i] = input.nextInt();
        }
        
        System.out.println("Informe o valor que deseja encontrar: ");
        chave = input.nextInt();
        
        while (chave >= 0) {
           System.out.println("Para realizar uma busca sequencial sem sentinela, digite 1"
                + "/nPara uma busca com sentila, digite 2");
            tipo = input.nextInt();

            int seq = buscaSeq(vet, chave);
            int sent = buscaSent(vet, chave, n);

            if (tipo == 1){
                System.out.println("Posicao: " + seq);
                if (seq == -1) {
                    System.out.println("Valor nao encontrado");
                }
                else {
                    System.out.println("Valor encontrado!");
                }
            }
            if (tipo == 2) {
                System.out.println("Posicao " + sent);
                if (sent == -1) {
                    System.out.println("Valor nao encontrado");
                }
                else {
                    System.out.println("Valor encontrado!");
                }
            }
        System.out.println("Informe o valor que deseja encontrar (digite um valor negativo para encerrar): ");
        chave = input.nextInt();
        }
        System.out.println("O progama realizou " + comp + " comparacoes");
        
    }
}
