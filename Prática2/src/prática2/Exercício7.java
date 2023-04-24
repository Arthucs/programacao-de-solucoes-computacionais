/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática2;

/**
 *
 * @author arthu
 */
public class Exercício7 {

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * @return the delta
     */
    public double getDelta() {
        return delta;
    }

    /**
     * @param delta the delta to set
     */
    public void setDelta(double delta) {
        this.delta = delta;
    }

    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the x2
     */
    public double getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;
    
    public double calculaDelta(double a, double b, double c){
        setDelta((Math.pow(b,2)) - (4*a*c));
        return getDelta();
    }
    
    public double calculaDelta(){
        this.setDelta((Math.pow(this.getB(), 2)) - (4 * this.getA() * this.getC()));
        return getDelta();
    }
    
    public double calculaX1(){
        setX1(-getB() + (Math.sqrt(getDelta())) / (2 * getA()));
       return getX1(); 
    }
    
    public double calculax2(){
        setX2(-getB() - (Math.sqrt(getDelta())) / (2 * getA()));
        return getX2();
    }
    
    public static void main(String[] args) {
        
        Exercício7 eq = new Exercício7();
        double delta, x1, x2, raiz;
        
        eq.setA(1);
        eq.setB(6);
        eq.setC(7);
        
        delta = eq.calculaDelta();
        x1 = eq.calculaX1();
        x2 = eq.calculax2();
        raiz = (-eq.getC() / eq.getB());
        
        System.out.println("Delta = " + delta +
                "\n X1 = " + x1 +
                "\n X2 = " + x2);
        
        if (eq.getA() == 0 && eq.getB() ==0 && eq.getC() ==0) {
            System.out.println("Igualdade confirmada: 0=0");
        }
        if (eq.getA() == 0 && eq.getB() ==0 && eq.getC() !=0) {
            System.out.println("Coeficientes informados incorretamente");
        }
        if (eq.getA() == 0 && eq.getB() !=0) {
            System.out.println("Esta eh uma equacao de primeiro grau"
                    + "\n Raiz real da equacao: x = " + raiz);
        }
        if (eq.getA() != 0) {
            System.out.println("Esta eh uma equacao de segundo grau");
        }
        if (eq.getA() != 0 && eq.getDelta() < 0) {
            System.out.println("Esta equacao nao possui raizes reais");
        }
        if (eq.getA() != 0 && eq.getDelta() == 0) {
            System.out.println("Esta equacao possui duas raizes reais iguais: x1 e x2 = " + x1);
        }
        if (eq.getA() != 0 && eq.getDelta() > 0) {
           System.out.println("Esta equacao possui duas raizes reais diferentes: " + x1 + " e " + x2); 
        }
    
        
     }
    
}
