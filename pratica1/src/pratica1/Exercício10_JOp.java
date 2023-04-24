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
public class Exercício10_JOp {
    
    public static void main(String args[]){
String R;
double raio, comp, area, vol, π;
R = JOptionPane.showInputDialog("Informe o raio: ");
raio = Integer.parseInt(R);

π = 3.14;
comp = 2 * π * raio;
JOptionPane.showMessageDialog(null, "Comprimento da esfera: " + comp);

area = π * (Math.pow(raio, 2));
JOptionPane.showMessageDialog(null, "Area da esfera: " + area);

vol = (Math.pow(raio, 3)) * π * 0.75;
JOptionPane.showMessageDialog(null, "Volume da esfera: " + vol);
System.exit(0);

    }
    
}
