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
public class Exercício2_JOp {
    
    public static void main(String args[]){
String ano;
int anoNasc, anoAtual, idadeAtual, idade50;
ano = JOptionPane.showInputDialog("Insira o ano de nascimento: ");
anoNasc = Integer.parseInt(ano);

ano = JOptionPane.showInputDialog("Insira o ano atual: ");
anoAtual = Integer.parseInt(ano);

idadeAtual = anoAtual - anoNasc;
JOptionPane.showMessageDialog(null, "Idade atual: " + idadeAtual);

idade50 = 2050-anoNasc;
JOptionPane.showMessageDialog(null, "Idade em 2050: " + idade50);
System.exit(0);

    }
    
}
