/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.text.SimpleDateFormat;
/**
 *
 * @author arthu
 */
public class NivelPessoa {
    
    public static void main(String[] args) {
        
        Pessoa ps = new Pessoa();
        Data dt = new Data();
        SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
        
        String nome;
        String sobrenome;
        String nomecomp;
        String atributo;
        int idade;
        int i;
        double altura, peso, IMC;
        Data data_nascimento;
        
        String[] vetor = new String[10];
        
        for (i = 0; i < vetor.length; i++) {
        
        
        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome: ");
        
        atributo = JOptionPane.showInputDialog("Informe o ano em que nasceu: ");
        dt.setAno(Integer.parseInt(atributo));
        atributo = JOptionPane.showInputDialog("Informe o mes em que nasceu: ");
        dt.setMes(Integer.parseInt(atributo));
        atributo = JOptionPane.showInputDialog("Informe o dia em que nasceu: ");
        dt.setDia(Integer.parseInt(atributo));
        atributo = JOptionPane.showInputDialog("Informe sua altura: ");
        
        ps.setAltura(Double.parseDouble(atributo));
        atributo = JOptionPane.showInputDialog("Informe seu peso: ");
        ps.setPeso(Double.parseDouble(atributo));
         
        IMC = ps.calculaIMC();
        nomecomp = nome + "" + sobrenome;
        
        idade = ps.calculaIdade();
      
        
        System.out.println("Nome: " + nomecomp);
        System.out.println("Idade: " + idade);
        System.out.println("IMC: " + IMC);
        ps.informaObesidade();
        
        }
    
     }
    
 }