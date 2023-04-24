/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class NívelPeso {
    
    public static void main(String[] args) {
        
        Pessoa ps = new Pessoa();
        
        
        String nome;
        String sobrenome;
        String atributo;
        int idade;
        double altura, peso, IMC;
        
        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome: ");
       
        atributo = JOptionPane.showInputDialog("Informe sua idade: ");
        ps.setIdade(Integer.parseInt(atributo));
        atributo = JOptionPane.showInputDialog("Informe sua altura: ");
        ps.setAltura(Double.parseDouble(atributo));
        atributo = JOptionPane.showInputDialog("Informe seu peso: ");
        ps.setPeso(Double.parseDouble(atributo));
         
        IMC = ps.calculaIMC();
        
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + ps.getIdade());
        System.out.println("IMC: " + IMC);
        ps.informaObesidade();
        
        
        
    }
    
}
