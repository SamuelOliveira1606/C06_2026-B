import java.util.Random;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(10)+1;
        int test;

        do {
            System.out.print("Qual o número?: ");
            test = guess.nextInt();

            if (test != num) {
                if (test < num) {
                    System.out.println("Errou, é maior.");
                } else {
                    System.out.println("Errou, é menor.");
                }
            } else {
                System.out.println("Acertou! Ganhou: "+num+" reais!");
            }
            } while (test != num);
        }
    }
