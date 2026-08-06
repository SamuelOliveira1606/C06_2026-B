import java.util.Scanner;

public class notafinal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Declara a variável nome: "entrada" do tipo Scanner

        System.out.println("Digite a NPA: ");
        int NPA = entrada.nextInt(); //Insere a entrada do usuário na variável NPA

        if (NPA >= 60){ //Aluno Aprovou direto
            System.out.println("Fazer NP3: Não");
            System.out.println("Aluno Aprovado");
        } else if (NPA >= 30 && NPA < 60) {
            System.out.println("Fazer NP3: Sim");
            System.out.println("Digite a nota NP3: ");
            int NP3 = entrada.nextInt();
            int NPF = NPA+NP3;
            if (NPF >= 100){
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Aluno Reprovado");
            }
        } else {
            System.out.println("Fazer NP3: Não");
            System.out.println("Aluno Reprovado");
        }

    }
}
