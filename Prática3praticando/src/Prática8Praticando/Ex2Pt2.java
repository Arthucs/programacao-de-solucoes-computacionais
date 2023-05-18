/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prática8Praticando;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Ex2Pt2 extends Exception{
    
    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * @return the divid
     */
    public double getDivid() {
        return divid;
    }

    /**
     * @param divid the divid to set
     */
    public void setDivid(double divid) {
        this.divid = divid;
    }
    private int num1;
    private int num2;
    private double divid;
    
    public double divisão() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o 1o numero: ");
        this.setNum1(input.nextInt());
        System.out.println("Informe o 2o numero: ");
        this.setNum2(input.nextInt());
       
        this.setDivid(getNum1() / getNum2());
        
        if (getNum2() == 0 || getNum1() < 0){
            throw new ArithmeticException();
        }
        return this.getDivid();
    }
    
    
    
}
