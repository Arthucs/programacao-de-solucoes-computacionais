/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista03;
import java.util.Calendar;

/**
 *
 * @author arthu
 */
public class Pessoa {

    /**
     * @return the data_nascimento
     */
    public Data getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(Data data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

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
   private Data data_nascimento;
   
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
           System.out.println("Classificação: Abaixo do peso");
       }
       else if(getIMC() >= (18.5) && getIMC() <= (24.9)) {
           System.out.println("Classificação: Peso normal");
       }
       else if(getIMC() >= 25 && getIMC() <= (29.9)) {
           System.out.println("Classificação: Sobrepeso");
       }
       else if(getIMC() >= 30 && getIMC() <= (34.9)) {
           System.out.println("Classificação: Obesidade Grau 1");
       }
       else if(getIMC() >= 35 && getIMC() <= (39.9)) {
           System.out.println("Classificação: Obesidade Grau 2");
       }
       else if(getIMC() >= 40) {
          System.out.println("Classificação: Obesidade Grau 3"); 
       }   
   return "";
   }
   
   public int calculaIdade() {
     Calendar dataAtual = Calendar.getInstance();
     int anoAtual = dataAtual.get(Calendar.YEAR);
     int mesAtual = dataAtual.get(Calendar.MONTH) +1;
     int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
    
     this.setIdade(((anoAtual - this.getData_nascimento().getAno()) -1));
       if (mesAtual > this.getData_nascimento().getMes()) {
             this.setIdade((anoAtual - this.getData_nascimento().getAno()));
            }
       else if (mesAtual == this.getData_nascimento().getMes()) {
             if (diaAtual >= this.getData_nascimento().getDia()) {
             this.setIdade((anoAtual - this.getData_nascimento().getAno()));
            }
        }
     return this.getIdade();
    }  
}

