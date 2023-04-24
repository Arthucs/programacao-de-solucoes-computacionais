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
public class Exercício6_JOp {
    
    public static void main(String args[]){
String temperatura;
double tempC, tempF;

temperatura = JOptionPane.showInputDialog("Informe a temperatura em Celsius: ");
tempC = Integer.parseInt(temperatura);

tempF = (tempC * 9/5) + 32;
JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit eh: " + tempF);
System.exit(0); 

    }
    
}
