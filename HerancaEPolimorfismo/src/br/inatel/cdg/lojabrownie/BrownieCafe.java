package br.inatel.cdg.lojabrownie;

public class BrownieCafe extends Brownie {

    public BrownieCafe (String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void addCafe(){
        System.out.println("Adicionando cafe ao " + super.nome);
    }
}
