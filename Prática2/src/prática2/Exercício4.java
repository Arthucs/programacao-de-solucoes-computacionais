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
public class Exercício4 {

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the IMC
     */
    public double getIMC() {
        return IMC;
    }

    /**
     * @param IMC the IMC to set
     */
    public void setIMC(double IMC) {
        this.IMC = IMC;
    }
   
   private double altura;
   private double peso;
   private double IMC;
   
   public double calculaIMC() {
       this.setIMC(getPeso()/(getAltura()*getAltura()));
       return getIMC();
       
   }
   
   public String informaObesidade() {
       if(getIMC() < 20) {
           System.out.println("Grau de obesidade: Abaixo do peso");
       }
       else if(getIMC() >= 20 && getIMC() <= 24) {
           System.out.println("Grau de obesidade: Peso normal");
       }
       else if(getIMC() >= 25 && getIMC() <= 29) {
           System.out.println("Grau de obesidade: Sobrepeso");
       }
       else if(getIMC() >= 30 && getIMC() <= 39) {
           System.out.println("Grau de obesidade: Obesidade");
       }
       else if(getIMC() >= 40) {
          System.out.println("Grau de obesidade: Obesidade Morbida"); 
       }   
   return "";
   }
    
   public static void main(String[] args) {
        
        Exercício4 ps = new Exercício4();
       
        String atributo;
        double IMC;
        
        atributo = JOptionPane.showInputDialog("Informe sua altura: ");
        ps.setAltura(Double.parseDouble(atributo));
        atributo = JOptionPane.showInputDialog("Informe seu peso: ");
        ps.setPeso(Double.parseDouble(atributo));
         
        IMC = ps.calculaIMC();
        System.out.println("IMC: " + IMC);
        ps.informaObesidade();
        
        
        
    }
    
}
