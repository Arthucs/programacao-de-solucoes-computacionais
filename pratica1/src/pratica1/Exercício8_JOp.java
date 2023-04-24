/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1;
import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class Exercício8_JOp {
    
    public static void main(String args[]){
String kg;
double peso, peso15, peso20;
kg = JOptionPane.showInputDialog("Informe seu peso: ");
peso = Integer.parseInt(kg);

peso15 = (0.15 * peso) + peso;
JOptionPane.showMessageDialog(null, "Caso engorde 15%: " + peso15 + "kg");

peso20 = peso - (0.20 * peso);
JOptionPane.showMessageDialog(null, "Caso emagreca 20%: " + peso20 + "kg");
System.exit(0);

    }
    
}
