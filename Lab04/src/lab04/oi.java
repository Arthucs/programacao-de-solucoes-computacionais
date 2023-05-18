/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;
import java.util.Scanner;
/**
 *
 * @author arthu
 */
public class oi {
    
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
    
    public oi() {
        nome = "";
        codigo = "";
        preco = 0;
    }
    
    public static void definirProdutos (Produto bn, Produto ov, Produto lt) {
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
        Scanner input = new Scanner(System.in);
        int op;
        String cod;
        int quant;
        boolean ctz = false;
        
        Produto bn = new Produto();
        bn.setNome("CACHO DE BANANAS");
        bn.setCodigo("01");
        bn.setPreco(20);
        Produto ov = new Produto();
        ov.setNome("CAIXA DE OVOS");
        ov.setCodigo("02");
        ov.setPreco(15);
        Produto lt = new Produto();
        lt.setNome("CAIXA DE LEITE");
        lt.setCodigo("03");
        lt.setPreco(8);
        
        System.out.println("Bem-vindo ao seu Carrinho de Compras! O que deseja fazer?");
        
        while (ctz == false) {
            System.out.println("COMPRAR (Digite 1)"
                    + "VER FATURA (Digite 2)"
                    + "ENCERRAR (Digite 3)");
            
            op = input.nextInt();
            if (op == 1){
                definirProdutos(bn, ov, lt);
                System.out.println("Digite o código do produto para compra-lo");
                cod = input.next();
                if (cod.equals("01")) {
                    it.setProduto(bn);
                    System.out.println("Informe a quantidade que deseja comprar");
                    quant = input.nextInt();
                    it.setQuantidade(quant);
                }
                else if (cod.equals("02")){
                    it.setProduto(ov);
                    System.out.println("Informe a quantidade que deseja comprar");
                    quant = input.nextInt();
                    it.setQuantidade(quant);
                }
                else if (cod.equals("03")){
                    it.setProduto(lt);
                    System.out.println("Informe a quantidade que deseja comprar");
                    quant = input.nextInt();
                    it.setQuantidade(quant);
                }
            }
            else if (op == 2) {
                ft.exibirLista();
            }
            else if (op == 3){
                break;
            }
        }
        
    }
    
}
