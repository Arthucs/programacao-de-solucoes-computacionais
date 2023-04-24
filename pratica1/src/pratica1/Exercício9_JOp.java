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
public class Exercício9_JOp {
    
    public static void main(String args[]){
String cateto;
double c1, c2, h;
cateto = JOptionPane.showInputDialog("Informe o valor do 1o cateto: ");
c1 = Integer.parseInt(cateto);

cateto = JOptionPane.showInputDialog("Informe o valor do 2o cateto: ");
c2 = Integer.parseInt(cateto);

 h = Math.sqrt(Math.pow(c1, 2) + (Math.pow(c2,2)));
JOptionPane.showMessageDialog(null, "A hipotenusa eh: " + h);
System.exit(0);

    }
    
}
