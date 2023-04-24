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
public class Exercício9 {
   
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
                
        double v0, t, vt, ht, g = 0;
        int planet;
        
        System.out.println("Escolha o planeta em que quer jogar uma bola e descubra sua velocidade e altura no planeta!"
                + "\n Digite 1 para Mercúrio"
                + "\n 2 - Venus"
                + "\n 3 - Terra"
                + "\n 4 - Marte"
                + "\n 5 - Jupter"
                + "\n 6 - Saturno"
                + "\n 7 - Urano"
                + "\n 8 - Netuno"
                + "\n 9 - Plutao");
        planet = input.nextInt();
        
        System.out.println("Informe a velocidade inicial da bola: ");
        v0 = input.nextDouble();
        
        System.out.println("Informe o instante em que a bola eh jogada: ");
        t = input.nextDouble();
        
         if (planet == 1) {
            g = 3.7;
            System.out.println("Em Mercurio: ");
        }
         if (planet == 2) {
            g = 8.8;
            System.out.println("Em Venus: ");
        }
         if (planet == 3) {
            g = 9.8;
            System.out.println("Em Terra: ");
        }
         if (planet == 4) {
            g = 3.8;
            System.out.println("Em Marte: ");
        }
         if (planet == 5) {
            g = 26.4;
            System.out.println("Em Jupter: ");
        }
         if (planet == 6) {
            g = 11.5;
            System.out.println("Em Saturno: ");
        }
         if (planet == 7) {
            g = 9.3;
            System.out.println("Em Urano: ");
        }
         if (planet == 8) {
            g = 12.2;
            System.out.println("Em Netuno: ");
        }
         if (planet == 9) {
            g = 0.6;
            System.out.println("Em Plutao: ");
        }
        
        vt = v0 - (g*t);
        ht = (v0*t) - ((g*(t*t))/2);
        
        System.out.println("Velocidade: " + vt + "m/s" +
                "\nAltura: " + ht +"cm");
        
       
        
        
    }
    
}
