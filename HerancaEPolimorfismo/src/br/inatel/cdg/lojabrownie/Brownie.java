package br.inatel.cdg.lojabrownie;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    //Construtor
    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println(">> Você adicionou um " + nome + " ao seu carrinho.");
    }

    public void calculaValorTotalCompra(){
        System.out.println(">> Valor da compra de um " + nome + ": " + preco + " R$");
    }

    public void mostraInfo(){
        System.out.println("Brownie selecionado: " + nome + " Preço: " + preco);
    }

}
