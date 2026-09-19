package br.inatel.cdg.lojabrownie;

public class BrownieNutella extends Brownie {
    public BrownieNutella (String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void addNutella(){
        System.out.println("Adicionando Nutella ao " + super.nome);
    }
}
