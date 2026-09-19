package br.inatel.cdg;

import br.inatel.cdg.lojabrownie.BrownieCafe;
import br.inatel.cdg.lojabrownie.BrownieDoceDeLeite;
import br.inatel.cdg.lojabrownie.BrownieNutella;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BrownieCafe bwCafe = new BrownieCafe("Brownie de Café", 14.50, "Café");
        BrownieDoceDeLeite bwDoceLeite = new BrownieDoceDeLeite("Brownie de Doce de Leite", 12.00, "Doce de Leite");
        BrownieNutella bwNutella = new BrownieNutella("Brownie de Nutella", 15.00, "Nutella");

        Comprador comprador = new Comprador("José", 100.50);

        System.out.println("Bem-vindo a loja de Brownies! Selecione seu brownie abaixo: \n");
        System.out.println("(1) - Brownie de Café\n");
        System.out.println("(2) - Brownie de Doce de Leite\n");
        System.out.println("(3) - Brownie de Nutella\n");
        System.out.println("(0) - Finalizar Compra");

        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        
        switch(n){
            case 1:
                comprador.efetuarCompra(bwCafe);
                break;
            case 2:
                comprador.efetuarCompra(bwDoceLeite);
                break;
            case 3:
                comprador.efetuarCompra(bwNutella);
                break;
            default:
                System.out.println("Compra finalizada!");
        }
    }
}
