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
public class Exercício7_JOp {
    
    public static void main(String args[]){
String sal;
        double salMin, salFunc, quant;
        
sal = JOptionPane.showInputDialog("Informe o salario minimo: ");
salMin = Integer.parseInt(sal);

sal = JOptionPane.showInputDialog("Informe o salario do funcionario: ");
salFunc = Integer.parseInt(sal);

quant = salFunc / salMin;
JOptionPane.showMessageDialog(null, "O funcionario recebe " + quant + " salarios minimos");
System.exit(0);

    }
    
}
