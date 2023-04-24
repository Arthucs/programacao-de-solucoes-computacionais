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
public class Exercício4_JOp {
    
    public static void main(String args[]){
String sal;
double salAtual, aumento, salFinal;
sal = JOptionPane.showInputDialog("Informe o salario atual: ");
salAtual = Integer.parseInt(sal);

aumento = salAtual/4;
salFinal = aumento + salAtual;
JOptionPane.showMessageDialog(null, "O novo salario eh: " + salFinal);
System.exit(0);

    }
    
}
