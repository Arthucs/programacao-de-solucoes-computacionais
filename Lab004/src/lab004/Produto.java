/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab004;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Produto {
        
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    private String nome;
    private String codigo;
    private double preco;
    
    public Produto() {
        nome = "";
        codigo = "";
        preco = 0;
    }
    
    public static void exibirProdutos (Produto bn, Produto ov, Produto lt) {
        System.out.println("PRODUTOS DISPONIVEIS");
        
        System.out.println(bn.getNome() + "\nCodigo: " + bn.getCodigo() + "\nPreco: " + bn.getPreco());
        System.out.println(ov.getNome() + "\nCodigo: " + ov.getCodigo() + "\nPreco: " + ov.getPreco());
        System.out.println(lt.getNome() + "\nCodigo: " + lt.getCodigo() + "\nPreco: " + lt.getPreco());
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Item it = new Item();
        Fatura ft = new Fatura();
        Produto pd = new Produto ();
        Scanner input = new Scanner(System.in);
        int op=0;
        String cod;
        int quant;
        
        Produto bn = new Produto();
        bn.setNome("CACHO DE BANANAS");
        bn.setCodigo("1");
        bn.setPreco(20);
        Produto ov = new Produto();
        ov.setNome("CAIXA DE OVOS");
        ov.setCodigo("2");
        ov.setPreco(15);
        Produto lt = new Produto();
        lt.setNome("CAIXA DE LEITE");
        lt.setCodigo("3");
        lt.setPreco(8);
        
        System.out.println("Bem-vindo ao seu Carrinho de Compras! O que deseja fazer?");
        
        while (op != 3) {
            System.out.println("COMPRAR (Digite 1)"
                    + "VER FATURA (Digite 2)"
                    + "ENCERRAR (Digite 3)");
            
            op = input.nextInt();
            switch (op) {
                case 1 :
                    exibirProdutos(bn, ov, lt);
                    System.out.println("Digite o código do produto para compra-lo");
                    cod = input.next();
                    if (cod.equals("1")) {
                        it = new Item();
                        it.setProduto(bn);                        
                        System.out.println("Informe a quantidade que deseja comprar");
                        quant = input.nextInt();
                        it.setQuantidade(quant);
                        ft.setItem(it);
                        ft.adicionarItem(it);
                    }
                    if (cod.equals("2")){
                        it = new Item();
                        it.setProduto(ov);
                        System.out.println("Informe a quantidade que deseja comprar");
                        quant = input.nextInt();
                        it.setQuantidade(quant);
                        ft.setItem(it);
                        ft.adicionarItem(it);
                    }
                    if (cod.equals("3")){
                        it = new Item();
                        it.setProduto(lt);
                        System.out.println("Informe a quantidade que deseja comprar");
                        quant = input.nextInt();
                        it.setQuantidade(quant);
                        ft.setItem(it);
                        ft.adicionarItem(it);

                    }
                    break;
                case 2 :
                    ft.exibirLista();
                    break;
                default :
                    System.out.println("Codigo invalido");
                    break;
            }
            
        }
        
    }
}
