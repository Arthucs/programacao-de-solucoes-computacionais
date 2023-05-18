/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliacaoa1;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class AvaliacaoA1 {

    public static void main(String[] args) {
        
        int i, j;
        int soma=0;
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        System.out.println("Informe 9 valores");
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz[i].length; j++){
                System.out.println("Valor: ");
                matriz[i][j] = input.nextInt();
            }
        }
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz[i].length; j++){
                if (j == i){
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos elementos da digonal principal: " + soma);
    }
}




