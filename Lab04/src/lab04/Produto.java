/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04;
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
    
    public static void definirProdutos(){
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
        
        System.out.println("=PRODUTOS DISPONIVEIS=");
        System.out.println(bn.getNome()
                + "\nCodigo: " + bn.getCodigo()
                + "\nPreco: " + bn.getPreco());
        
        System.out.println(ov.getNome()
                + "\nCodigo: " + ov.getCodigo()
                + "\nPreco: " + ov.getPreco());
        
        System.out.println(lt.getNome()
                + "\nCodigo: " + lt.getCodigo()
                + "\nPreco: " + lt.getPreco());
    }
    
    
    
    public static void main(String[] args) {
        
        int op;
        String cod;
        int quant;
        String dec;
        Item it = new Item();
        Fatura ft = new Fatura();
        Scanner input = new Scanner(System.in);
        
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
        
        do {    
            System.out.println("COMPRAR (Digite 1)"
                + "\nVER FATURA (Digite 2)"
                + "\nENCERRAR PROGRAMA(Digite 3)");
        
            op = input.nextInt();
            if (op == 1) {
                definirProdutos();
                System.out.println("Digite o codigo do produto para compra-lo");
                cod = input.nextLine();
                switch (cod) {
                    case bn.getCodigo(): 
                        it.setProduto(bn);
                        System.out.println("Digite a quantidade que deseja comprar");
                        quant = input.nextInt();
                        it.setQuantidade(quant);
                        ft.adicionarItem();
                        break;
                    case ov.getCodigo(): 
                        it.setProduto(ov);
                        System.out.println("Digite a quantidade que deseja comprar");
                        quant = input.nextInt();
                        it.setQuantidade(quant);
                        ft.adicionarItem();
                        break;
                    case lt.getCodigo(): 
                        it.setProduto(lt);
                        System.out.println("Digite a quantidade que deseja comprar");
                        quant = input.nextInt();
                        it.setQuantidade(quant);
                        ft.adicionarItem();
                        break;
                }
                if (cod.equals(bn.getCodigo())){
                    it.setProduto(bn);
                    System.out.println("Digite a quantidade que deseja comprar");
                    quant = input.nextInt();
                    it.setQuantidade(quant);
                    ft.adicionarItem();
                }
            }
            else if (op == 2) {
                ft.exibirLista();
            }
            else if (op == 3){
                break;
            }
            System.out.println("Deseja continuar? (Digite S ou N)");
            dec = input.nextLine();
        } while (dec.equalsIgnoreCase("S"));
        
        
    }
    
}
