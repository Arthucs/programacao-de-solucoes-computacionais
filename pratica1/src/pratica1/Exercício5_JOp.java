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
public class Exercício5_JOp {
   
    public static void main(String args[]){
String diagonal;
        double dMaior, dMenor, area;
diagonal = JOptionPane.showInputDialog("Informe diagonal maior: ");
dMaior = Integer.parseInt(diagonal);

diagonal = JOptionPane.showInputDialog("Informe dianogal menor: ");
dMenor = Integer.parseInt(diagonal);

area = (dMaior * dMenor)/2;
JOptionPane.showMessageDialog(null, "A area eh: " + area);
System.exit(0);

    }
    
}
