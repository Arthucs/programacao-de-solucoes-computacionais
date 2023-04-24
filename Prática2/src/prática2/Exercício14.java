/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática2;
import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class Exercício14 {
    
    public static void main(String args[]){
 String git;
 
 git = JOptionPane.showInputDialog("Informe um dos comandas (git clone, git fetch ou git pull): ");

 if (git.equals("git clone")) {
     JOptionPane.showMessageDialog(null, "O git clone é um utilitário de linha de comando que é usado para selecionar um repositório existente e criar um clone ou cópia do repositório de destino."
             + "\nPor exemplo: se você deseja obter uma cópia de um projeto para o qual gostaria de contribuir, pode usar o comando git clone para isso.");
 }
 if (git.equals("git fetch")) {
     JOptionPane.showMessageDialog(null, "O git fetch é um comando básico usado para baixar conteúdos de um repositório remoto. O git fetch é usado em conjunto com outros comandos do git."
             + "\nA maneira mais simples de se utilziar esse comando é se referindo a um respositório remoto, por exemplo: git fetch <nome do repositório>; ou git fetch origin");
 }
 if (git.equals("git pull")) {
     JOptionPane.showMessageDialog(null, "O comando git pull é usado para buscar e baixar conteúdo de repositórios remotos e fazer a atualização imediata ao repositório local para que os conteúdos sejam iguais."
             + "\nPor exemplo: Suponha que você tenha um repositório com uma ramificação principal e uma origem remota. Nesse caso, o git pull baixa todas as alterações a partir do ponto de divergência entre o local e a ramificação principal.");
 }

    }
    
}
