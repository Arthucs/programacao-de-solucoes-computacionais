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
public class Exercício5 {
    
     public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double dMaior, dMenor, area;
        
        System.out.println("Informe a diagonal maior: ");
        dMaior = input.nextDouble();
        
        System.out.println("Informe a dianogal menor: ");
        dMenor = input.nextDouble();
        
        area = (dMaior * dMenor)/2;
        System.out.println("A area eh: " + area);
        
        
    }
    
}
