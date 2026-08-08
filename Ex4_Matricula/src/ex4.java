import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o número de alunos: ");
        int alunos = read.nextInt();

        switch (alunos){
            case 10, 20:
                System.out.println("Sala I-16");
            break;
            case 30:
                System.out.println("Sala I-22");
            break;
            default:
                System.out.println("Erro 404: Sala não encontrada");
        }
    }
}
