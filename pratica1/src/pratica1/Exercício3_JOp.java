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
public class Exercício3_JOp {
    
    public static void main(String args[]){
        
String quantidade;
double cotDolar, quantia, valorReal;

quantidade = JOptionPane.showInputDialog("Informe a cotacao atual do dolar: ");
cotDolar = Integer.parseInt(quantidade);

quantidade = JOptionPane.showInputDialog("Informe sua quantia atual em dolar: ");
quantia = Integer.parseInt(quantidade);

valorReal = quantia * cotDolar;
JOptionPane.showMessageDialog(null, "Sua quantia em reais eh: " + valorReal + "R$");
System.exit(0);

    }
    
}
