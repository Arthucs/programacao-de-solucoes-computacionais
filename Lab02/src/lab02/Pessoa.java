/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

/**
 *
 * @author arthu
 */
public class Pessoa {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

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

   private String nome;
   private String sobrenome;
   private int idade;
   private double altura;
   private double peso;
   private double IMC;
   
   public Pessoa() {
       nome="";
       sobrenome="";
       idade=0;
       altura=0;
       peso=0;
       IMC=0;
   }
    
   public double calculaIMC() {
       this.setIMC(getPeso()/(getAltura()*getAltura()));
       return getIMC();
       
   }
   
   public String informaObesidade() {
       if(getIMC() < (18.5)) {
           System.out.println("Grau de obesidade: Abaixo do peso");
       }
       else if(getIMC() >= (18.5) && getIMC() <= (24.9)) {
           System.out.println("Grau de obesidade: Peso normal");
       }
       else if(getIMC() >= 25 && getIMC() <= (29.9)) {
           System.out.println("Grau de obesidade: Sobrepeso");
       }
       else if(getIMC() >= 30 && getIMC() <= (34.9)) {
           System.out.println("Grau de obesidade: Obesidade Grau 1");
       }
       else if(getIMC() >= 35 && getIMC() <= (39.9)) {
           System.out.println("Grau de obesidade: Obesidade Grau 2");
       }
       else if(getIMC() >= 40) {
          System.out.println("Grau de obesidade: Obesidade Grau 3"); 
       }   
   return "";
   }
  
   
}
