/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica1;
import javax.swing.JOptionPane;

public class Exercício1_JOp {
    
    public static void main(String args[]){
String nota;
double nota1, nota2, nota3, media;
nota = JOptionPane.showInputDialog("Informe a 1a nota: ");
nota1 = Integer.parseInt(nota);

nota = JOptionPane.showInputDialog("Informe a 2a nota: ");
nota2 = Integer.parseInt(nota);

nota = JOptionPane.showInputDialog("Informe a 3a nota: ");
nota3 = Integer.parseInt(nota);

media = (nota1+nota2+nota3)/3;
JOptionPane.showMessageDialog(null, "A media eh: " + media);
System.exit(0);

    }
    
}
