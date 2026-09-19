package br.inatel.cdg.lojabrownie;

public class BrownieDoceDeLeite extends  Brownie {

    public BrownieDoceDeLeite (String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void addDoceDeLeite(){
        System.out.println("Adicionando doce de leite ao " + super.nome);
    }
}
