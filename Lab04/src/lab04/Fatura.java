/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class Fatura {

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the lista
     */
    public ArrayList<Item> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Item> lista) {
        this.lista = lista;
    }

    /**
     * @return the valorFatura
     */
    public double getValorFatura() {
        return valorFatura;
    }

    /**
     * @param valorFatura the valorFatura to set
     */
    public void setValorFatura(double valorFatura) {
        this.valorFatura = valorFatura;
    }
    
    private ArrayList<Item> lista;
    private double valorFatura;
    private Item item;
    
    public void adicionarItem() {
        this.getLista().add(getItem());
    }
    
    public double calculaFatura(){
        double soma=0;
        int i =0;
        while (getLista().size() >= i){
            soma += getItem().getValorTotal();
            this.setValorFatura(soma);
        }
        return getValorFatura();
    }
    
    public void exibirLista() {
        int i;
        System.out.println("Fatura:");
        for (i = 0; i < getLista().size(); i++){
            System.out.println(getLista().get(i) + " x" + getItem().getQuantidade() + "     R$ " + getItem().calculaTotal());
        } 
        System.out.println("Total: R$ " + calculaFatura());
    }
    
    
}

