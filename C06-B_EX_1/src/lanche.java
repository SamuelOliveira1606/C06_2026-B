import java.util.Scanner;

public class lanche {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o número de lanches1: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Entre com o número de lanches2: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Entre com o número de lanches3: ");
        int lanche3 = entrada.nextInt();
        int soma = lanche1+lanche2+lanche3;
        double media = (double) soma/3;

        System.out.println("Total de lanches: "+ soma);
        System.out.println("Média de lanches: "+ media);

    }
}
