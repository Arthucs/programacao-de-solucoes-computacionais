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
public class Exercício11_JOp {
    
    public static void main(String args[]){
String tab;
int num;
tab = JOptionPane.showInputDialog("Informe um numero: ");
num = Integer.parseInt(tab);

JOptionPane.showMessageDialog(null, num + " x 0 = " + num*0 + 
"\n" + num + " x 1 = " + num*1 +
"\n" + num + " x 2 = " + num*2 +
"\n" + num + " x 3 = " + num*3 +
"\n" + num + " x 4 = " + num*4 +
"\n" + num + " x 5 = " + num*5 +
"\n" + num + " x 6 = " + num*6 +
"\n" + num + " x 7 = " + num*7 +
"\n" + num + " x 8 = " + num*8 +
"\n" + num + " x 9 = " + num*9 +
"\n" + num + " x 10 = " + num*10);
System.exit(0);

    }
    
}
