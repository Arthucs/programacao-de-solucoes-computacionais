/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1;
import java.util.Scanner;
/**
 *
 * @author arthu
 */
public class Exercício3 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double cotDolar, quantia, valorReal;
        
        System.out.println("Informe a cotacao atual do dolar: ");
        cotDolar = input.nextDouble();
        
        System.out.println("Informe sua quantia atual em dolar: ");
        quantia = input.nextDouble();
        
        
        valorReal = quantia * cotDolar;
        System.out.println("Sua quantia em reais eh: " + valorReal + "R$");
        
        
    }
    
}
