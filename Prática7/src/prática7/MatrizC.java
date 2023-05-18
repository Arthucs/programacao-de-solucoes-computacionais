/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática7;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class MatrizC {
    
    public static void main(String[] args) {
        
        int i, j;
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (i = 0; i < matriz.length; i++)
         for (j = 0; j < matriz[i].length; j++) {

             System.out.println("Informe um número: ");
             matriz[i][j] = input.nextInt();

          }

        System.out.println("Matriz informada:");
        for (i = 0; i < matriz.length; i++) {
             for (j = 0; j < matriz[i].length; j++)

             System.out.printf("%2d ", matriz[j][i]);

             System.out.println();
         }
     }
 }
