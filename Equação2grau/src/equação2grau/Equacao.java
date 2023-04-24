/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equação2grau;

/**
 *
 * @author arthu
 */
public class Equacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private double a=1;
    private double b=2;
    private double c=3;
    private double x1;
    private double x2;
    private double delta;
    
    public double calculaDelta(double b, double a, double c, double delta) {
        delta = (Math.pow(b,2)-(4*a*c));
        return delta;
        
    }
    
    public double calculaX1(double a, double b, double delta, double x1) {
        x1 = (-b + (Math.sqrt(delta)))/(2*a);
        return x1;
        
    }
    
    public double calculaX2(double a, double b, double delta, double x2) {
        x2 = (-b - (Math.sqrt(delta)))/(2*a);
        return x2;
    
}

    
    
}