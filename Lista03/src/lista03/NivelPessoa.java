/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista03;
import javax.swing.JOptionPane;
/**
 *
 * @author arthu
 */
public class NivelPessoa {
    
    public static void main(String[] args) {
        
        Pessoa ps;
        
        String nome;
        String sobrenome;
        String nomecomp;
        String atributo;
        int idade;
        int i;
        int n;
        double IMC;
        Data dataNasc;
        
        Pessoa[] vetor = new Pessoa[10];
        
        for (i = 0; i < vetor.length; i++) {
            ps = new Pessoa();
            dataNasc = new Data();
            ps.setData_nascimento(dataNasc);
            
            ps.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
            ps.setSobrenome(JOptionPane.showInputDialog("Informe seu sobrenome: "));

            atributo = JOptionPane.showInputDialog("Informe o ano em que nasceu: ");
            dataNasc.setAno(Integer.parseInt(atributo));
            atributo = JOptionPane.showInputDialog("Informe o mes em que nasceu: ");
            dataNasc.setMes(Integer.parseInt(atributo));
            atributo = JOptionPane.showInputDialog("Informe o dia em que nasceu: ");
            dataNasc.setDia(Integer.parseInt(atributo));
            atributo = JOptionPane.showInputDialog("Informe sua altura: ");

            ps.setAltura(Double.parseDouble(atributo));
            atributo = JOptionPane.showInputDialog("Informe seu peso: ");
            ps.setPeso(Double.parseDouble(atributo));

            IMC = ps.calculaIMC();
            nome = ps.getNome();
            sobrenome = ps.getSobrenome();
            nomecomp = ps.getNome() + " " + ps.getSobrenome();
            idade = ps.calculaIdade();
            n = i+1;
            
            System.out.println("Cadastro " + n + ":");
            System.out.println("Nome completo: " + nomecomp);
            System.out.println("Nome de refêrencia: " + sobrenome + ", " + nome.toUpperCase());
            System.out.println("Idade: " + idade);
            System.out.println("Peso: " + ps.getPeso());
            System.out.println("Altura: " + ps.getAltura());
            System.out.println("IMC: " + IMC);
            ps.informaObesidade();
            System.out.println();

            vetor[i] = ps;
            if (i > 0) {
                String nc2 = vetor[i-1].getNome() + " "+ vetor[i-1].getSobrenome();
                String nc1 = vetor[i].getNome() + " " + vetor[i].getSobrenome();
                if (nc2.equalsIgnoreCase(nc1)) {
                    System.out.println("""
                                       Nome já casdastrado
                                       Cadastro encerrado.""");
                     break;
                }
            }
        }
     }
 }