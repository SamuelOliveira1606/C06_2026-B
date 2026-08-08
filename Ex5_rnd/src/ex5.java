import java.util.Random;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(10)+1;
        int test;

        do {
            System.out.println("Um número de 1 a 10: ");
            test = guess.nextInt();
            if (num != test){
                System.out.println("Errou!");
            } else {
                System.out.println("Acertou!");
            }
        } while (num != test);
    }
}
